package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminEventsTest extends BaseTest {

    @Test
    public void verifyAdminEvents() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        AdminEventsPage pageObj =
                new AdminEventsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}