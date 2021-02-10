

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MyFirstSimpleTest {

    private static final String baseURL = "https://www.google.com/";

    @Test
    public void verifyThatTheUserCanSuccessfullyAccessTheAUT() {
        given().when().get(baseURL).then().statusCode(200);
    }


}
