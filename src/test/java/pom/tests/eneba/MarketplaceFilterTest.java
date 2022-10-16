package pom.tests.eneba;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.eneba.MarketplacePage;
import pom.tests.TestBase;
import pom.utils.TestListener;

@Listeners(TestListener.class)
public class MarketplaceFilterTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        MarketplacePage.open("https://www.eneba.com/store/games");
    }

    @Test
    private void testSingleFilterCheckbox() {

        String expectedText = "DLC";
        MarketplacePage.clickFilterCheckboxTypeDlc();
        String actualText = MarketplacePage.readFilterNotifictionFirstFilter();
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    private void testMultipleFilterCheckbox() {

        String expectedText1 = "DLC";
        String expectedText2 = "Strategy";
        MarketplacePage.clickFilterCheckboxTypeDlc();
        MarketplacePage.clickFilterCheckboxGenreStrategy();
        String actualText1 = MarketplacePage.readFilterNotifictionFirstFilter();
        String actualText2 = MarketplacePage.readFilterNotifictionSecondFilter();
        boolean result = actualText1.equals(expectedText1) && actualText2.equals(expectedText2);
        Assert.assertTrue(result);
    }
}
