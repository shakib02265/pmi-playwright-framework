package tests;

import base.BaseTest;

import pages.AboutUsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsPageTest
        extends BaseTest {

    @Test
    public void verifyAboutUsPage()

            throws Exception {



        AboutUsPage aboutPage =

                new AboutUsPage(
                        page
                );



        aboutPage.open();

        waitForPage();



        Assert.assertTrue(

                aboutPage.isLoaded()
        );
    }
}