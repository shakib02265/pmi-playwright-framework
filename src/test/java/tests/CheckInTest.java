package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckInTest extends BaseTest {

    @Test
    public void verifyCheckIn() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        CheckInPage pageObj =
                new CheckInPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}