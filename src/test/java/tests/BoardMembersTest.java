package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardMembersTest extends BaseTest {

    @Test
    public void verifyBoardMembers() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(
                login.loginSuccess()
        );

        BoardMembersPage pageObj =
                new BoardMembersPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}