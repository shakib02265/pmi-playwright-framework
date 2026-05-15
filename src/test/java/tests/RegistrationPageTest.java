package tests;

import base.BaseTest;

import pages.RegistrationPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPageTest
        extends BaseTest {

    @Test
    public void verifyRegistrationPage()

            throws Exception {



        RegistrationPage registrationPage =

                new RegistrationPage(
                        page
                );



        registrationPage.open();

        waitForPage();



        Assert.assertTrue(

                registrationPage.isLoaded()
        );
    }
}