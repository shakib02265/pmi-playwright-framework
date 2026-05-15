package tests;

import base.BaseTest;
import pages.TrackOrderPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrackOrderPageTest
        extends BaseTest {

    @Test
    public void verifyTrackPage()

            throws Exception {

        TrackOrderPage page =
                new TrackOrderPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}