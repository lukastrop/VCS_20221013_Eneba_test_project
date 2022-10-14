package pom.tests.eneba;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.eneba.HomePage;
import pom.tests.TestBase;
import pom.utils.TestListener;

import static org.testng.Assert.assertFalse;
import static pom.pages.Common.*;
import static pom.pages.Locators.Eneba.Home.formPrivacyConfirmation;

@Listeners(TestListener.class)
public class HomeTest extends TestBase{

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.eneba.com/lt/");
    }



    @Test
    private void test1() {
        HomePage.acceptPrivacyConfirmation();
        sleep(4000);

        assertFalse(getElement(formPrivacyConfirmation).isDisplayed());

    }
}
