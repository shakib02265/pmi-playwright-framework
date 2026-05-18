package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.AdminMenuBuilderPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminMenuBuilderTest
        extends BaseTest {

    @Test
    public void verifyAdminMenuBuilder()

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




        AdminMenuBuilderPage builder =

                new AdminMenuBuilderPage(
                        page
                );




        Assert.assertTrue(

                builder.open()
        );
    }
}