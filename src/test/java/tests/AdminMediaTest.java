package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.AdminMediaPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminMediaTest
        extends BaseTest {

    @Test
    public void verifyAdminMedia()

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




        // media page


        AdminMediaPage media =

                new AdminMediaPage(
                        page
                );




        Assert.assertTrue(

                media.open(),

                "Admin media page should open"
        );
    }
}