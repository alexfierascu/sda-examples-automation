package polarthicket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import model.Customer;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import response.CustomerResponse;
import utils.CustomerUtils;
import utils.ServerInformation;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomerTest {
    private static final String baseUrl = "https://polar-thicket-63660.herokuapp.com/";
    private static final String customerEndpoint = "api/v1/customers/";

    private RequestSpecification requestSpecification = given().
            baseUri(baseUrl).
            basePath(customerEndpoint).
            contentType(ContentType.JSON);

    private ResponseSpecBuilder responseSpecBuilder;
    private ResponseSpecification responseSpecification;

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Test
    @Order(1)
    public void checkServerInformation() {
        responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder.expectHeader(String.valueOf(ServerInformation.Server), "Cowboy");
        responseSpecBuilder.expectHeader(String.valueOf(ServerInformation.Connection), "keep-alive");
        responseSpecBuilder.expectHeader(String.valueOf(ServerInformation.ContentType), "application/json;charset=UTF-8");
        responseSpecBuilder.expectHeader(String.valueOf(ServerInformation.TransferEncoding), "chunked");
        responseSpecBuilder.expectHeader(String.valueOf(ServerInformation.Via), "1.1 vegur");
        responseSpecification = responseSpecBuilder.build();

        given().spec(requestSpecification).
                when().then().
                spec(responseSpecification);
    }

    @Test
    @Order(2)
    public void GETAllCustomers() {
        given().
                when().
                get(baseUrl + customerEndpoint).
                then().statusCode(200).log().all();
    }

    @Test
    @Order(3)
    public void GETAllCustomersWithRequestSpecification() {
        given().
                spec(requestSpecification).
                when().get().then().statusCode(200).log().all();
    }

    @Test
    @Order(4)
    public void createCustomerWithStringPayloadUsingRequestSpecification() {
        String customerPayload = "{\n" +
                "  \"firstName\": \"Miron\",\n" +
                "  \"lastName\": \"Iordache\"\n" +
                "}";


        given().spec(requestSpecification).
                body(customerPayload).post().
                then().statusCode(201).log().all();
    }

    @Test
    @Order(5)
    public void createCustomerWithStringPayloadUsingURLStringBuilder() {
        StringBuilder URL = new StringBuilder();
        URL.append(baseUrl);
        URL.append(customerEndpoint);

        String customerPayload = "{\n" +
                "    \"firstName\": \"Cristian\",\n" +
                "    \"lastName\": \"Faina\"\n" +
                "}";

        Response responseAfterUserWasCreated = given().when().contentType(ContentType.JSON)
                .body(customerPayload).post(URL.toString()).
                        then().statusCode(201).log().all().extract().response();

        ResponseBody body = responseAfterUserWasCreated.getBody();

        CustomerResponse customerResponse = body.as(CustomerResponse.class);
        String currentCustomerId = CustomerUtils.getIDFromURL(customerResponse);
        System.out.println("A customer with id " + currentCustomerId + " was created");
    }

    @Test
    @Order(6)
    public void checkPreviouslyCreatedCustomer() {
        String lastCreatedCustomerId = CustomerUtils.getLastCreatedCustomerId();
        System.out.println("The last customer created has the id " + lastCreatedCustomerId);
        given().when().get(baseUrl + customerEndpoint + lastCreatedCustomerId).then()
                .statusCode(200).log().all();

        CustomerResponse customerResponse = given().
                when().
                get(baseUrl + customerEndpoint + lastCreatedCustomerId).
                as(CustomerResponse.class);
        assertEquals(customerResponse.getFirstName(), "Cristian");
        assertEquals(customerResponse.getLastName(), "Faina");
        assertTrue(customerResponse.getCustomerUrl().contains(lastCreatedCustomerId));
    }

    @Test
    @Order(7)
    public void updatePreviouslyCreatedCustomer() {
        String lastCreatedCustomerId = CustomerUtils.getLastCreatedCustomerId();
        Customer updatedCustomer = new Customer();
        updatedCustomer.setFirstName("Robert");
        updatedCustomer.setLastName("De Niro");
        String updatedDataPayload = null;

        try {
            updatedDataPayload = MAPPER.writeValueAsString(updatedCustomer);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        given().when().contentType(ContentType.JSON)
                .body(updatedDataPayload).
                put(baseUrl + customerEndpoint + lastCreatedCustomerId).
                then().statusCode(200).log().all();
    }

    @Test
    @Order(8)
    public void checkPreviouslyUpdatedCustomer() {
        String lastCreatedCustomerId = CustomerUtils.getLastCreatedCustomerId();
        System.out.println("The last customer created had the id " + lastCreatedCustomerId);
        given().when().get(baseUrl + customerEndpoint + lastCreatedCustomerId).then()
                .statusCode(200).log().all();

        CustomerResponse customerResponse = given().
                when().
                get(baseUrl + customerEndpoint + lastCreatedCustomerId).
                as(CustomerResponse.class);
        assertEquals(customerResponse.getFirstName(), "Robert");
        assertEquals(customerResponse.getLastName(), "De Niro");
    }

    @Test
    @Order(9)
    public void deleteCustomerTest() {
        String lastCreatedCustomerId = CustomerUtils.getLastCreatedCustomerId();
        System.out.println("The customer with the id " +
                lastCreatedCustomerId + " will be deleted");
        given().when().
                delete(baseUrl + customerEndpoint + lastCreatedCustomerId).
                then().statusCode(200);

        given().when().
                get(baseUrl + customerEndpoint + lastCreatedCustomerId).
                then().statusCode(404);
        System.out.println("The customer with the id " +
                lastCreatedCustomerId + " was deleted");
    }
}
