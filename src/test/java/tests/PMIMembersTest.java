package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PMIMembersTest extends BaseTest {

    @Test
    public void verifyPMIMembers() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        PMIMembersPage pageObj =
                new PMIMembersPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}