package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MentorshipAdminTest extends BaseTest {

    @Test
    public void verifyMentorshipPage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        MentorshipAdminPage pageObj =
                new MentorshipAdminPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}