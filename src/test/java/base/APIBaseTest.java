package base;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeClass;

public class APIBaseTest {

    @BeforeClass
    public void setupAPI(){

        RestAssured.baseURI =

                "https://demo.pmibdchapter.org";
    }
}