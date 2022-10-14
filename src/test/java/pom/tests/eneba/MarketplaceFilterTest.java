package pom.tests.eneba;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.Common;
import pom.pages.eneba.HomePage;
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
            String actualText = "";
            String expectedText = "DLC";
            MarketplacePage.clickFilterCheckboxTypeDlc();
            Common.sleep(2000);
            actualText = MarketplacePage.readFilterNotifictionFirstFilter();
            Assert.assertEquals(actualText, expectedText);

        }
        @Test
        private void testMultipleFilterCheckbox() {

            String actualText1 = "";
            String actualText2 = "";
            String expectedText1 = "DLC";
            String expectedText2 = "Strategy";
            MarketplacePage.clickFilterCheckboxTypeDlc();
            Common.sleep(2000);
            MarketplacePage.clickFilterCheckboxGenreStrategy();
            Common.sleep(2000);
            actualText1 = MarketplacePage.readFilterNotifictionFirstFilter();
            actualText2 = MarketplacePage.readFilterNotifictionSecondFilter();
            boolean result = actualText1.equals(expectedText1) && actualText2.equals(expectedText2);
            Assert.assertTrue(result);
        }
}
