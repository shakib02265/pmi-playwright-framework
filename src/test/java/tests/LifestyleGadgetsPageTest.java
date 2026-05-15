package tests;

import base.BaseTest;
import pages.LifestyleGadgetsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LifestyleGadgetsPageTest
        extends BaseTest {

    @Test
    public void verifyLifestylePage()

            throws Exception {

        LifestyleGadgetsPage page =
                new LifestyleGadgetsPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}