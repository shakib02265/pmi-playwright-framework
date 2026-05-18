package tests;

import base.BaseTest;
import pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalendarTest extends BaseTest {

    @Test
    public void verifyCalendar() throws Exception {

        PMILoginPage login =
                new PMILoginPage(page);

        login.login(
                 "shakib308@gmail.com",
                "shaan4all"
        );

        Assert.assertTrue(login.loginSuccess());

        CalendarPage pageObj =
                new CalendarPage(page);

        Assert.assertTrue(
                pageObj.open()
        );
    }
}