package pom.pages.eneba;

import org.openqa.selenium.By;
import pom.pages.Common;
import pom.pages.Locators;

public class MarketplacePage {

    public static void open(String url) {
        Common.openUrl(url);}

    public static void clickFilterCheckboxTypeDlc() {
        Common.clickElement(Locators.Eneba.MarketplacePage.CheckboxProductTypeFilterDlc);
    }
    public static void clickFilterCheckboxGenreStrategy() {
        Common.clickElement(Locators.Eneba.MarketplacePage.CheckboxProductGenreFilterStrategy);
    }
    public static String readFilterNotifictionFirstFilter() {
        return Common.getElementText(Locators.Eneba.MarketplacePage.SelectedFilter1);
    }
    public static String readFilterNotifictionSecondFilter() {
        return Common.getElementText(Locators.Eneba.MarketplacePage.SelectedFilter2);
    }
    public  static void clickFirstItemFromProductList(){
        Common.clickElement(Locators.Eneba.MarketplacePage.FirstItemFromProductList);
    }
    public  static void clickSecondItemFromProductList() {
        Common.clickElement(Locators.Eneba.MarketplacePage.SecondItemFromProductList);
    }
    public  static void clickShoppingCartButton(){
        Common.clickElement(Locators.Eneba.MarketplacePage.ShoppingCartButton);
    }
    public  static void clickViewCartButton(){
        Common.clickElement(Locators.Eneba.MarketplacePage.ViewCartButton);
    }
    public static String readProductCountInCart() {
        return Common.getElementText(Locators.Eneba.MarketplacePage.ProductCountInCart);
    }
    public  static void clickAddToCartButton(){
        Common.clickElement(Locators.Eneba.MarketplacePage.AddToCartButton);
    }
    public  static void clickContinueShoppingButton(){
        Common.clickElement(Locators.Eneba.MarketplacePage.ContinueShoppingButtonInPopUp);
    }
    public  static void clickViewCartButtonInPopUp(){
        Common.clickElement(Locators.Eneba.MarketplacePage.ViewCartButtonInPopUp);
    }
}

