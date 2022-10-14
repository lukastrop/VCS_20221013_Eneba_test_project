package pom.pages.eneba;
import pom.pages.Common;
import pom.pages.Locators;

import static pom.pages.Locators.Eneba.Home.formPrivacyConfirmation;

public class HomePage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementWithVisibilityChange(formPrivacyConfirmation);
        Common.clickElement(Locators.Eneba.Home.buttonConfirm);
    }


}
