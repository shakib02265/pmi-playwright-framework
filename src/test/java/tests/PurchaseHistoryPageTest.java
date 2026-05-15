package tests;

import base.BaseTest;
import pages.PurchaseHistoryPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseHistoryPageTest
        extends BaseTest {

    @Test
    public void verifyPurchasePage()

            throws Exception {

        PurchaseHistoryPage page =
                new PurchaseHistoryPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}