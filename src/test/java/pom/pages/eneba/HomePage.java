package pom.pages.eneba;

import pom.pages.Common;
import pom.pages.Locators;

import static pom.pages.Locators.Eneba.Home;


public class HomePage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.Home.formPrivacyConfirmation);
        Common.clickElement(Locators.Eneba.Home.buttonConfirm);
    }

    public static void closeDiscountTimerPopup() {
        Common.waitForElementWithVisibilityChange(Home.DiscountTimerPopup);
        Common.clickElement(Home.DiscountTimerPopupCloseButton);
    }

    public static void closeNewsletterPopup() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.Home.NewsletterPopup);
        Common.sleep(2000);
        Common.clickElement(Home.NewsletterPopupCloseButton);
    }

    public static boolean arePopupsDisplayed() {
        try {
            Common.getElement(Locators.Eneba.Home.formPrivacyConfirmation).isDisplayed();
            Common.getElement(Home.NewsletterPopup).isDisplayed();
            Common.getElement(Home.DiscountTimerPopup).isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Element not found");
        }

        return false;
    }

}
