package utils;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import response.AllCustomerResponse;
import response.CustomerResponse;

import java.util.List;

import static io.restassured.RestAssured.given;

public abstract class CustomerUtils {
    private static final String baseUrl = "https://polar-thicket-63660.herokuapp.com/";
    private static final String customerEndpoint = "api/v1/customers/";

    public static String getLastCreatedCustomerId() {
        Response response = given().when().get(baseUrl + customerEndpoint).then()
                .extract().response();

        ResponseBody responseBody = response.getBody();
        AllCustomerResponse allCustomers = responseBody.as(AllCustomerResponse.class);
        List<CustomerResponse> customers = allCustomers.getCustomers();
        CustomerResponse lastCustomerResponse = customers.get(customers.size() - 1);

        return getIDFromURL(lastCustomerResponse);
    }

    public static String getIDFromURL(CustomerResponse customerResponse) {
        String customerUrl = customerResponse.getCustomerUrl();
        String[] customerData = customerUrl.split("/");
        String customerId = customerData[4];
        return customerId;
    }
}
