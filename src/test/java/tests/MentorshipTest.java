package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.MentorshipPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MentorshipTest
        extends BaseTest {

    @Test
    public void verifyMentorshipPage()

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




        MentorshipPage mentorship =

                new MentorshipPage(
                        page
                );




        Assert.assertTrue(

                mentorship.open()
        );
    }
}