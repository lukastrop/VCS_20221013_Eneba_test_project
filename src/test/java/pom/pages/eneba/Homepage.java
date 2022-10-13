package pom.pages.eneba;

import pom.pages.Common;
import pom.pages.Locators;

public class Homepage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementWithVisibilityChange(Locators.Eneba.Home.formPrivacyConfirmation);
        Common.clickElement(Locators.Eneba.Home.buttonConfirm);
    }

}
