package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MentorshipApplicationsTest extends BaseTest {

    @Test
    public void verifyMentorshipApplications()

            throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(
                login.loginSuccess()
        );

        MentorshipApplicationsPage pageObj =
                new MentorshipApplicationsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}