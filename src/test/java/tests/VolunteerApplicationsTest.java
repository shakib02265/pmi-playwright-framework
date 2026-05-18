package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.VolunteerApplicationsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VolunteerApplicationsTest
        extends BaseTest {

    @Test
    public void verifyVolunteerApplications()

            throws Exception {




        PMILoginPage login =

                new PMILoginPage(
                        page
                );




        login.login(

                 "shakib308@gmail.com",

                "shaan4all"
        );




        Assert.assertTrue(

                login.loginSuccess()
        );




        VolunteerApplicationsPage volunteer =

                new VolunteerApplicationsPage(
                        page
                );




        Assert.assertTrue(

                volunteer.open()
        );
    }
}