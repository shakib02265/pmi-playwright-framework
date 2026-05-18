package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JobApplicationsTest extends BaseTest {

    @Test
    public void verifyJobApplications() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        JobApplicationsPage pageObj =
                new JobApplicationsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}