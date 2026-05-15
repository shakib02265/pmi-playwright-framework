package tests;

import base.BaseTest;
import pages.WishlistPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WishlistPageTest
        extends BaseTest {

    @Test
    public void verifyWishlistPage()

            throws Exception {

        WishlistPage page =
                new WishlistPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}