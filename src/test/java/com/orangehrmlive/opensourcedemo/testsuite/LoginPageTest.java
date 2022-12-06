package com.orangehrmlive.opensourcedemo.testsuite;

import com.orangehrmlive.opensourcedemo.testbase.BaseTest;
import com.orangehrmlive.pages.DashboardPage;
import com.orangehrmlive.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    //Creating objects of 2 pages classes
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Invoking method from Login Page class to enter username
        loginPage.enterUserName("Admin");
        //Invoking method from Login Page class to enter password
        loginPage.enterPassword("admin123");
        //Invoking method from Login Page class to click on login button
        loginPage.clickOnLoginButton();
        //Invoking method from dashboard Page class to verify text
        Assert.assertEquals(dashboardPage.getDashboardTextAfterSignIn(), "Dashboard", "Dashboard is not displayed");
    }

}
