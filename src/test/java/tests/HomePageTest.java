package tests;

import base.BaseTest;

import pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest
        extends BaseTest {

    @Test
    public void verifyHomePage()

            throws Exception {


        HomePage page =

                new HomePage(
                        this.page
                );


        page.open();


        waitForPage();


        Assert.assertTrue(

                page.isLoaded()
        );
    }
}