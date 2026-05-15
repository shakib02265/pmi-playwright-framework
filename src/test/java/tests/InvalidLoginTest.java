package tests;

import base.BaseTest;

import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class InvalidLoginTest
        extends BaseTest {

    @Test
    public void verifyInvalidLogin()

            throws Exception {




        LoginPage loginPage =

                new LoginPage(
                        page
                );




        loginPage.open();




        waitForPage();




        String randomEmail =

                "user"

                +

                UUID.randomUUID()

                        .toString()

                        .substring(0,5)

                +

                "@test.com";




        loginPage.login(

                randomEmail,

                "wrong123"
        );




        Assert.assertTrue(

                loginPage.loginFailed(),

                "Login should fail"
        );




        // keep message visible
        // before BaseTest screenshot


        page.waitForTimeout(

                3000
        );
    }
}