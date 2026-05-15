package tests;

import base.BaseTest;

import pages.SearchPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageTest
        extends BaseTest {

    @Test
    public void verifySearchPage()

            throws Exception {



        SearchPage searchPage =

                new SearchPage(
                        page
                );



        searchPage.open();

        waitForPage();



        Assert.assertTrue(

                searchPage.isLoaded()
        );
    }
}