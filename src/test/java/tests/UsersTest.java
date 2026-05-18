package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {

    @Test
    public void verifyUsersPage()

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




        UsersPage pageObj =
                new UsersPage(page);




        Assert.assertTrue(

                pageObj.open()
        );
    }
}