package pom.tests.eneba;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.eneba.HomePage;
import pom.tests.TestBase;
import pom.utils.TestListener;

@Listeners(TestListener.class)
public class HomePagePopupTest extends TestBase {
    
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.eneba.com/lt/");
    }

    @Test
    private void PopupCloseTest() {
        HomePage.acceptPrivacyConfirmation();
        HomePage.closeDiscountTimerPopup();
        HomePage.closeNewsletterPopup();
        Assert.assertFalse(HomePage.arePopupsDisplayed());
    }
}
