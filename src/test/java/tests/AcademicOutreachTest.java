package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AcademicOutreachTest extends BaseTest {

    @Test
    public void verifyAcademicPage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        AcademicOutreachPage pageObj =
                new AcademicOutreachPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}