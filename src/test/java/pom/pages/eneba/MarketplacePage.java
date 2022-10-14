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
}
