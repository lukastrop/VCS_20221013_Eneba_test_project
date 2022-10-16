package pom.pages.eneba;

import pom.pages.Common;
import pom.pages.Locators;

public class MarketplacePage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickFilterCheckboxTypeDlc() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.CheckboxProductTypeFilterDlc);
        Common.clickElement(Locators.Eneba.MarketplacePage.CheckboxProductTypeFilterDlc);
    }

    public static void clickFilterCheckboxGenreStrategy() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.CheckboxProductGenreFilterStrategy);
        Common.clickElement(Locators.Eneba.MarketplacePage.CheckboxProductGenreFilterStrategy);
    }

    public static String readFilterNotifictionFirstFilter() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.SelectedFilter1);
        return Common.getElementText(Locators.Eneba.MarketplacePage.SelectedFilter1);
    }

    public static String readFilterNotifictionSecondFilter() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.SelectedFilter2);
        return Common.getElementText(Locators.Eneba.MarketplacePage.SelectedFilter2);
    }

    public static void clickFirstItemFromProductList() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.FirstItemFromProductList);
        Common.clickElement(Locators.Eneba.MarketplacePage.FirstItemFromProductList);
    }

    public static void clickSecondItemFromProductList() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.SecondItemFromProductList);
        Common.clickElement(Locators.Eneba.MarketplacePage.SecondItemFromProductList);
    }

    public static String readProductCountInCart() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.ProductCountInCart);
        return Common.getElementText(Locators.Eneba.MarketplacePage.ProductCountInCart);
    }

    public static void clickAddToCartButton() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.AddToCartButton);
        Common.clickElement(Locators.Eneba.MarketplacePage.AddToCartButton);
    }

    public static void clickContinueShoppingButton() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.ViewCartButtonInPopUp);
        Common.clickElement(Locators.Eneba.MarketplacePage.ContinueShoppingButtonInPopUp);
    }

    public static void clickViewCartButtonInPopUp() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.ViewCartButtonInPopUp);
        Common.clickElement(Locators.Eneba.MarketplacePage.ViewCartButtonInPopUp);
    }

    public static void clickRemoveTopItemFromCartButton() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.RemoveTopItemFromCartButton);
        Common.sleep(1000);
        Common.clickElement(Locators.Eneba.MarketplacePage.RemoveTopItemFromCartButton);
    }

    public static void BackToMainMarketplacePage() {
        MarketplacePage.open("https://www.eneba.com/store/games");
    }

    public static String readYourCartIsEmptyMessage() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.MarketplacePage.YourCartIsEmptyMessage);
        return Common.getElementText(Locators.Eneba.MarketplacePage.YourCartIsEmptyMessage);
    }

}

