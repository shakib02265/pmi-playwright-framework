package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PastEventsTest extends BaseTest {

    @Test
    public void verifyPastEvents() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        PastEventsPage pageObj =
                new PastEventsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}