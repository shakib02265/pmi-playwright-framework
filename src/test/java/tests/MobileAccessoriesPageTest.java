package tests;

import base.BaseTest;
import pages.MobileAccessoriesPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileAccessoriesPageTest
        extends BaseTest {

    @Test
    public void verifyMobilePage()

            throws Exception {

        MobileAccessoriesPage page =
                new MobileAccessoriesPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}