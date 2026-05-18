package api;

import base.APIBaseTest;

import io.qameta.allure.*;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

@Epic("PMI API")
@Feature("Users API")
public class UsersAPI extends APIBaseTest {

    @Test

    @Story("Users Endpoint")

    @Description("Verify users endpoint")

    public void verifyUsersAPI(){




        String endpoint =

                "/users";




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




        Assert.assertTrue(

                response.getStatusCode()

                        == 200

                        ||

                        response.getStatusCode()

                        == 302
        );




        Assert.assertTrue(

                duration < 5000
        );
    }
}