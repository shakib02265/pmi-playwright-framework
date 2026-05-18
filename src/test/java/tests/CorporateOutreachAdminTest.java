package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CorporateOutreachAdminTest extends BaseTest {

    @Test
    public void verifyCorporatePage() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        CorporateOutreachAdminPage pageObj =
                new CorporateOutreachAdminPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}