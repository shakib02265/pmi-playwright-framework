package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClubMembersTest extends BaseTest {

    @Test
    public void verifyClubMembers() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        ClubMembersPage pageObj =
                new ClubMembersPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}