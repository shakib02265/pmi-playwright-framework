package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VolunteerPageTest extends BaseTest {

    @Test
    public void verifyVolunteerPage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        VolunteerPage pageObj =
                new VolunteerPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}