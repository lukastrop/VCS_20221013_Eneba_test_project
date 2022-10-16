package pom.tests.eneba;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.Common;
import pom.pages.eneba.MarketplacePage;
import pom.tests.TestBase;
import pom.utils.TestListener;

@Listeners(TestListener.class)
public class ShoppingCartTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        MarketplacePage.open("https://www.eneba.com/store/games");
    }

    @Test
    private void testSingleItemInShoppingCart() {

        MarketplacePage.clickFirstItemFromProductList();
        Common.sleep(5000);
        MarketplacePage.clickAddToCartButton();
        Common.sleep(5000);
        MarketplacePage.clickViewCartButtonInPopUp();
        Common.sleep(5000);
        String expectedText = "1 product";
        String actualText = MarketplacePage.readProductCountInCart();
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @Test
    private void testMultipleItemsInShoppingCart() {

        MarketplacePage.clickFirstItemFromProductList();
        MarketplacePage.clickAddToCartButton();
        MarketplacePage.clickContinueShoppingButton();
        MarketplacePage.BackToMainMarketplacePage();
        MarketplacePage.clickSecondItemFromProductList();
        MarketplacePage.clickAddToCartButton();
        MarketplacePage.clickViewCartButtonInPopUp();

        String expectedText = "2 products";
        String actualText = MarketplacePage.readProductCountInCart();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Test
    private void removeItemsFromShoppingCart() {

        MarketplacePage.clickFirstItemFromProductList();
        MarketplacePage.clickAddToCartButton();
        MarketplacePage.clickContinueShoppingButton();
        MarketplacePage.BackToMainMarketplacePage();
        MarketplacePage.clickSecondItemFromProductList();
        MarketplacePage.clickAddToCartButton();
        MarketplacePage.clickViewCartButtonInPopUp();
        MarketplacePage.clickRemoveTopItemFromCartButton();
        MarketplacePage.clickRemoveTopItemFromCartButton();
        String expectedText = "Your cart is empty";
        String actualText = MarketplacePage.readYourCartIsEmptyMessage();
        Assert.assertTrue(actualText.contains(expectedText));


    }

}


