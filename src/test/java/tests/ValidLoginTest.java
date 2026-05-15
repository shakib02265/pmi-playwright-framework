
package tests;

import base.BaseTest;

import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest
        extends BaseTest {

    @Test
    public void verifyValidLogin()

            throws Exception {




        LoginPage loginPage =

                new LoginPage(
                        page
                );




        loginPage.open();




        waitForPage();




        // your real test account


        loginPage.login(

                "shadmanshaan07@gmail.com",

                "shaan4all"
        );




        waitForPage();




        Assert.assertTrue(

                loginPage.loginSuccess(),

                "Login should succeed"
        );
    }
}