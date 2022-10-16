package pom.pages.eneba;

import pom.pages.Common;
import pom.pages.Locators;

public class WishlistPage {
    public static void open(String url) {
        Common.openUrl(url);
    }


    public static void ClickAddFirstProductToWishlistButton() {
        Common.moveToElementAndClick(Locators.Eneba.WishlistPage.AddFirstProductToWishlistButton);
        Common.sleep(1000);
    }

    public static void ClickAddSecondProductToWishlistButton() {
        Common.moveToElementAndClick(Locators.Eneba.WishlistPage.AddSecondProductToWishlistButton);
        Common.sleep(1000);
    }

    public static void ClickAddThirdProductToWishlistButton() {
        Common.moveToElementAndClick(Locators.Eneba.WishlistPage.AddThirdProductToWishlistButton);
        Common.sleep(1000);
    }

    public static void ClickWishlistButton() {
        Common.clickElement(Locators.Eneba.WishlistPage.WishlistButton);
        Common.sleep(4000);
    }

    public static String readFirstProductName() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.WishlistPage.FirstProductName);
        return Common.getElementText(Locators.Eneba.WishlistPage.FirstProductName);
    }

    public static String readSecondProductName() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.WishlistPage.SecondProductName);
        return Common.getElementText(Locators.Eneba.WishlistPage.SecondProductName);
    }

    public static String readThirdProductName() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.WishlistPage.ThirdProductName);
        return Common.getElementText(Locators.Eneba.WishlistPage.ThirdProductName);
    }

    public static String readFirstWishlistItemName() {
        return Common.getElementText(Locators.Eneba.WishlistPage.FirstWishlistItemName);
    }

    public static String readSecondWishlistItemName() {
        return Common.getElementText(Locators.Eneba.WishlistPage.SecondtWishlistItemName);
    }

    public static String readThirdWishlistItemName() {
        return Common.getElementText(Locators.Eneba.WishlistPage.ThirdWishlistItemName);
    }

}
