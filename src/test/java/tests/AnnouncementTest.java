package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.AnnouncementPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnouncementTest
        extends BaseTest {

    @Test
    public void verifyAnnouncementPage()

            throws Exception {




        // login


        PMILoginPage login =

                new PMILoginPage(
                        page
                );




        login.login(

                "shakib308@gmail.com",

                "shaan4all"
        );




        Assert.assertTrue(

                login.loginSuccess(),

                "PMI login should succeed"
        );




        // announcement page


        AnnouncementPage announcement =

                new AnnouncementPage(
                        page
                );




        Assert.assertTrue(

                announcement.open(),

                "Announcement page should open"
        );
    }
}