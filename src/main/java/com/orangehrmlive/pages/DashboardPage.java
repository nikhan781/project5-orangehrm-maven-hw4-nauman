package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    //Declaring By type variable
    By dashboardText = By.cssSelector("h6[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    //This method will get message upon successful login
    public String getDashboardTextAfterSignIn() {
        return getTextFromElement(dashboardText);
    }
}
