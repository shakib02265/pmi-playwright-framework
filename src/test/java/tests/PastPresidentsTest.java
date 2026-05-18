package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PastPresidentsTest extends BaseTest {

    @Test
    public void verifyPastPresidents() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        PastPresidentsPage pageObj =
                new PastPresidentsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}