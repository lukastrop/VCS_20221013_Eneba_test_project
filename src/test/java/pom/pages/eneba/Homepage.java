package pom.pages.eneba;

import pom.pages.Common;
import pom.pages.Locators;

public class Homepage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementWithVisibilityChange(Locators.Tv3.Home.formPrivacyConfirmation);
        Common.clickElement(Locators.Tv3.Home.buttonConfirm);
    }

}
