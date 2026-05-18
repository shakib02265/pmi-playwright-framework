package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SponsorshipBrandingTest extends BaseTest {

    @Test
    public void verifySponsorshipPage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        SponsorshipBrandingPage pageObj =
                new SponsorshipBrandingPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}