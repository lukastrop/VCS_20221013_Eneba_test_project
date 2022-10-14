package pom.pages.eneba;
import pom.pages.Common;
import pom.pages.Locators;

public class LoginPage {
    public static void open(String url) {
        Common.openUrl(url);
    }


    public static void enterEmail(String expectedEmail) {
        Common.sendKeysToElement(
                expectedEmail,
                Locators.Eneba.LoginPage.inputEmail);

    }
    public static void enterPassword(String value) {
        Common.sendKeysToElement(
                value,
                Locators.Eneba.LoginPage.inputPassword);
    }
    public static void clickButtonLogin() {
        Common.clickElement(
                Locators.Eneba.LoginPage.buttonLogin);
    }
    public static String readLoggedInUsernameEmail() {
        return Common.getElementText(
                Locators.Eneba.LoginPage.loggedInUsernameEmail);
    }
}