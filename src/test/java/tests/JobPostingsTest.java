package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JobPostingsTest extends BaseTest {

    @Test
    public void verifyJobPostings() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        JobPostingsPage pageObj =
                new JobPostingsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}