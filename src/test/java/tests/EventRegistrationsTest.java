package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EventRegistrationsTest extends BaseTest {

    @Test
    public void verifyEventRegistrations() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
               "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        EventRegistrationsPage pageObj =
                new EventRegistrationsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}