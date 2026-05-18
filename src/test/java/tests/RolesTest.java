package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RolesTest extends BaseTest {

    @Test
    public void verifyRolesPage()

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




        RolesPage pageObj =
                new RolesPage(page);




        Assert.assertTrue(

                pageObj.open()
        );
    }
}