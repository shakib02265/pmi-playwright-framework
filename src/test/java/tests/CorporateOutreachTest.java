package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.CorporateOutreachPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CorporateOutreachTest
        extends BaseTest {

    @Test
    public void verifyCorporateOutreach()

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




        CorporateOutreachPage corporate =

                new CorporateOutreachPage(
                        page
                );




        Assert.assertTrue(

                corporate.open()
        );
    }
}