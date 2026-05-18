package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AwardsListTest extends BaseTest {

    @Test
    public void verifyAwardsList() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        AwardsListPage pageObj =
                new AwardsListPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}