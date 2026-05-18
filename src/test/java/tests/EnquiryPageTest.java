package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.EnquiryPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnquiryPageTest
        extends BaseTest {

    @Test
    public void verifyEnquiryPage()

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




        EnquiryPage enquiry =

                new EnquiryPage(
                        page
                );




        Assert.assertTrue(

                enquiry.open()
        );
    }
}