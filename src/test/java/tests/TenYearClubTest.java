package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TenYearClubTest extends BaseTest {

    @Test
    public void verifyTenYearClub() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        TenYearClubPage pageObj =
                new TenYearClubPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}