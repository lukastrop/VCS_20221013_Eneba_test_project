package pom.pages.eneba;

import pom.pages.Common;
import pom.pages.Locators;

public class LoginPage {
    public static void open(String url) {
        Common.openUrl(url);
    }


    public static void enterEmail(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail, Locators.Eneba.LoginPage.inputEmail);

    }

    public static void enterPassword(String value) {
        Common.sendKeysToElement(value, Locators.Eneba.LoginPage.inputPassword);
    }

    public static void clickButtonLogin() {
        Common.clickElement(Locators.Eneba.LoginPage.buttonLogin);
    }

    public static String readLoggedInUsernameEmail() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.LoginPage.loggedInUsernameEmail);
        return Common.getElementText(Locators.Eneba.LoginPage.loggedInUsernameEmail);
    }

    public static boolean isLoginErrorMessagedisplayed() {
        try {
            Common.getElement(Locators.Eneba.LoginPage.LoginInfoError).isDisplayed();
            System.out.println("Element is found");
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Element not found");
        }

        return false;
    }
}