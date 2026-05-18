package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutPageTest extends BaseTest {

    @Test
    public void verifyAboutPage() throws Exception {

        PMILoginPage login = new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        AboutPage about =
                new AboutPage(page);

        Assert.assertTrue(
                about.open()
        );
    }
}