package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactPageTest extends BaseTest {

    @Test
    public void verifyContactPage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        ContactPage pageObj =
                new ContactPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}