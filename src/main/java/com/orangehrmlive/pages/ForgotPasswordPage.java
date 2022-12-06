package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {

    //Declaring By type variable
    By resetPasswordMessage = By.cssSelector("h6[class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");

    //This method will get message when new page is loaded
    public String getResetPasswordText() {
        return getTextFromElement(resetPasswordMessage);
    }
}
