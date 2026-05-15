package tests;

import base.BaseTest;
import pages.InternetNetworkingPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InternetNetworkingPageTest
        extends BaseTest {

    @Test
    public void verifyInternetPage()

            throws Exception {

        InternetNetworkingPage page =
                new InternetNetworkingPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}