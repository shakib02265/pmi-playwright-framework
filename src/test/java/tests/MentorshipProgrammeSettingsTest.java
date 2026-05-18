package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MentorshipProgrammeSettingsTest extends BaseTest {

    @Test
    public void verifyMentorshipProgrammeSettings()

            throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(
                login.loginSuccess()
        );

        MentorshipProgrammeSettingsPage pageObj =
                new MentorshipProgrammeSettingsPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}