package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WhyJoinPageTest extends BaseTest {

    @Test
    public void verifyWhyJoinPage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        WhyJoinPage pageObj =
                new WhyJoinPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}