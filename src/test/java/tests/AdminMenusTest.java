package tests;

import base.BaseTest;

import pages.PMILoginPage;
import pages.AdminMenusPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminMenusTest
        extends BaseTest {

    @Test
    public void verifyAdminMenus()

            throws Exception {




        PMILoginPage login =

                new PMILoginPage(
                        page
                );




        login.login(

                "shakib308@gmail.com",

                "shaan4all"
        );




        Assert.assertTrue(

                login.loginSuccess()
        );




        AdminMenusPage menus =

                new AdminMenusPage(
                        page
                );




        Assert.assertTrue(

                menus.open()
        );
    }
}