package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MentorsTest extends BaseTest {

    @Test
    public void verifyMentors() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        MentorsPage pageObj =
                new MentorsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}