package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.BannerPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BannerTest
        extends BaseTest {

    @Test
    public void verifyBannerPage()

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




        // banner page


        BannerPage banner =

                new BannerPage(
                        page
                );




        Assert.assertTrue(

                banner.open(),

                "Banner page should open"
        );
    }
}