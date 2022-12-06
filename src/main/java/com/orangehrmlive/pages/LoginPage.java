package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //Declaring By type variables
    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.cssSelector("button[type='submit']");
    By forgotPasswordLink = By.cssSelector("p[class='oxd-text oxd-text--p orangehrm-login-forgot-header']");

    //This method will send text to user field
    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    //This method will send text to password field
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    //This method will click on log in button
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    //This method will click on forgot password link
    public void clickOnForgotPasswordLink() {
        clickOnElement(forgotPasswordLink);
    }

}
