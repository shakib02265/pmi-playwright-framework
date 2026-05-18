package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AwardsPageTest extends BaseTest {

    @Test
    public void verifyAwardsPage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
               "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        AwardsPage pageObj =
                new AwardsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}