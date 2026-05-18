package api;

import base.APIBaseTest;

import io.qameta.allure.*;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

@Epic("PMI API")
@Feature("Login API")
public class LoginAPI extends APIBaseTest {

    @Test

    @Story("Login Endpoint")

    public void verifyLoginAPI(){




        String endpoint =
                "/login";




        long start =
                System.currentTimeMillis();




        Response response =

                given()

                .log().all()

                .when()

                .get(endpoint);




        long duration =

                System.currentTimeMillis()

                        -

                        start;




        Allure.addAttachment(

                "Request",

                "GET " + endpoint
        );




        Allure.addAttachment(

                "Status Code",

                String.valueOf(
                        response.getStatusCode()
                )
        );




        Allure.addAttachment(

                "Response Time",

                duration + " ms"
        );




        Allure.addAttachment(

                "Response Body",

                response.getBody()
                        .asPrettyString()
        );




        Assert.assertEquals(

                response.getStatusCode(),

                200
        );




        Assert.assertTrue(

                duration < 5000
        );
    }
}