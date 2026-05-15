package tests;

import base.BaseTest;
import pages.WarrantyPolicyPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WarrantyPolicyPageTest
        extends BaseTest {

    @Test
    public void verifyWarrantyPage()

            throws Exception {

        WarrantyPolicyPage page =
                new WarrantyPolicyPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}