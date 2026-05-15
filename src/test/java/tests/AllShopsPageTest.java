package tests;

import base.BaseTest;
import pages.AllShopsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllShopsPageTest
        extends BaseTest {

    @Test
    public void verifyAllShopsPage()

            throws Exception {

        AllShopsPage page =
                new AllShopsPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}