package com.orangehrmlive.opensourcedemo.testsuite;

import com.orangehrmlive.opensourcedemo.testbase.BaseTest;
import com.orangehrmlive.pages.ForgotPasswordPage;
import com.orangehrmlive.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    //Creating objects of 2 pages classes
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //Invoking method from Login Page class to click on forgot password link
        loginPage.clickOnForgotPasswordLink();
        //Invoking method from forgot password page Page class to verify text
        Assert.assertEquals(forgotPasswordPage.getResetPasswordText(),"Reset Password","Forgot Password page is not displayed");
    }
}
