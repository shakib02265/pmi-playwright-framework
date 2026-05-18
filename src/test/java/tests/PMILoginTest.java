package tests;

import base.BaseTest;

import pages.PMILoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PMILoginTest
        extends BaseTest {

    @Test
    public void verifyPMILogin()

            throws Exception {




        PMILoginPage loginPage =

                new PMILoginPage(
                        page
                );




        loginPage.open();




        loginPage.login(

                "shakib308@gmail.com",

                "shaan4all"
        );




        Assert.assertTrue(

                loginPage.loginSuccess(),

                "PMI login should succeed"
        );
    }
}