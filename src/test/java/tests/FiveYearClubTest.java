package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiveYearClubTest extends BaseTest {

    @Test
    public void verifyFiveYearClub() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        FiveYearClubPage pageObj =
                new FiveYearClubPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}