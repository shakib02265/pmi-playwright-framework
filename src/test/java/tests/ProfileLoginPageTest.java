package tests;

import base.BaseTest;
import pages.ProfileLoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileLoginPageTest
        extends BaseTest {

    @Test
    public void verifyProfilePage()

            throws Exception {

        ProfileLoginPage page =
                new ProfileLoginPage(this.page);

        page.open();

        waitForPage();

        Assert.assertTrue(
                page.isLoaded()
        );
    }
}