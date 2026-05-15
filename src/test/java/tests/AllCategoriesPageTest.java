package tests;

import base.BaseTest;
import pages.AllCategoriesPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllCategoriesPageTest
        extends BaseTest {

    @Test
    public void verifyAllCategoriesPage()

            throws Exception {

        AllCategoriesPage page =
                new AllCategoriesPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}