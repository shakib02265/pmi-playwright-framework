package tests;

import base.BaseTest;
import pages.TravelGadgetsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TravelGadgetsPageTest
        extends BaseTest {

    @Test
    public void verifyTravelPage()

            throws Exception {

        TravelGadgetsPage page =
                new TravelGadgetsPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}