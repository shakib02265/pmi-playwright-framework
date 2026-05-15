package tests;

import base.BaseTest;
import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest
        extends BaseTest {

    @Test
    public void verifyLoginPage()

            throws Exception {

        LoginPage page =
                new LoginPage(this.page);

        page.open();

        waitForPage();

        page.enterLogin(

                "test@test.com",

                "123456"
        );

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}