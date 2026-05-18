package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SpeakerOpportunitiesTest extends BaseTest {

    @Test
    public void verifySpeakerPage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        SpeakerOpportunitiesPage pageObj =
                new SpeakerOpportunitiesPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}