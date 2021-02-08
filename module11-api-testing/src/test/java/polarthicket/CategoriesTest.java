package polarthicket;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import response.CategoryResponse;
import utils.CategoryType;
import utils.ServerInformation;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoriesTest {

    private static final String baseUrl = "https://polar-thicket-63660.herokuapp.com/";
    private static final String categoryEndpoint = "api/v1/categories/";

    private RequestSpecification requestSpecification = given().
            baseUri(baseUrl).
            basePath(categoryEndpoint).
            contentType(ContentType.JSON);
    private ResponseSpecBuilder responseSpecBuilder;
    private ResponseSpecification responseSpecification;

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
    public void GETAllCategories() {
        given().
                when().
                get(baseUrl + categoryEndpoint).
                then().statusCode(200).log().all();
    }

    @Test
    @Order(3)
    public void GETAllCategoriesWithRequestSpecification() {
        given().
                spec(requestSpecification).
                when().get().then().statusCode(200);
    }

    @Test
    @Order(4)
    public void GETSpecificCategory() {
        System.out.println("Execute a GET request for each category");
        for (CategoryType categoryType : EnumSet.allOf(CategoryType.class)) {
            System.out.println("GET request for category " + categoryType);
            given().
                    when().
                    get(baseUrl + categoryEndpoint + categoryType).
                    then().statusCode(200);
        }
    }

    @Test
    @Order(5)
    public void GETAndCheckResponseFromCategoriesEndpointUsingJSONPath() {
        RestAssured.defaultParser = Parser.JSON;
        Response response = given().when().get(baseUrl + categoryEndpoint).then().extract().response();
        response.getBody().prettyPeek();

        List<String> jsonResponse = Collections.singletonList(response.jsonPath().getString("categories"));

        for (String categoryName : jsonResponse) {
            System.out.println("The list of categories is " + categoryName);
            assertThat(categoryName, containsString("Fruits"));
            assertThat(categoryName, containsString("Dried"));
            assertThat(categoryName, containsString("Fresh"));
            assertThat(categoryName, containsString("Exotic"));
            assertThat(categoryName, containsString("Nuts"));
        }
    }

    @Test
    @Order(6)
    public void GETAndCheckResponseFromCategoriesEndpointUsingDeserializationWithJackson() {
        CategoryResponse categoryResponse = given().
                when().
                get(baseUrl + categoryEndpoint + CategoryType.NUTS).
                as(CategoryResponse.class);
        assertEquals(categoryResponse.getCategoryName(), "Nuts");
    }
}
