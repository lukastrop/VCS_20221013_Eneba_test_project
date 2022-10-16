package pom.tests.eneba;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.eneba.WishlistPage;
import pom.tests.TestBase;
import pom.utils.TestListener;

import java.util.Arrays;
import java.util.List;

@Listeners(TestListener.class)
public class WishlistTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        WishlistPage.open("https://www.eneba.com/lt/store/games");
    }

    @Test
    private void addItemsToWishlist() {

        WishlistPage.ClickAddFirstProductToWishlistButton();
        WishlistPage.ClickAddSecondProductToWishlistButton();
        WishlistPage.ClickAddThirdProductToWishlistButton();
        List<String> productNamesList = Arrays.asList(WishlistPage.readFirstProductName(), WishlistPage.readSecondProductName(), WishlistPage.readThirdProductName());
        WishlistPage.ClickWishlistButton();
        List<String> wishlistedProductNamesList = Arrays.asList(WishlistPage.readFirstWishlistItemName(), WishlistPage.readSecondWishlistItemName(), WishlistPage.readThirdWishlistItemName());
        Assert.assertTrue(productNamesList.containsAll(wishlistedProductNamesList));


    }


}

