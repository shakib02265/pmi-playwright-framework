package tests;

import base.BaseTest;

import pages.FaqPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FaqPageTest
        extends BaseTest {

    @Test
    public void verifyFaqPage()

            throws Exception {

        FaqPage page =
                new FaqPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}