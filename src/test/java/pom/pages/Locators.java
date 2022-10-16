package pom.pages;

import org.openqa.selenium.By;
import scala.util.control.Exception;

public class Locators {


    public static class Eneba {

        public static class Home {
            public static By formPrivacyConfirmation = By.xpath("//*[@id='app']/div/div[1]/div");
            public static By buttonConfirm = By.xpath("//*[@id='app']/div/div[1]/div/div/button[1]");
            public static By DiscountTimerPopup = By.xpath("//*[@id='app']/div[1]/div[2]");
            public static By DiscountTimerPopupCloseButton = By.xpath("//*[@id='app']/div/div[2]/button");
            public static By NewsletterPopup = By.xpath("//*[@id='app']/div[1]/dialog");
            public static By NewsletterPopupCloseButton = By.xpath("//*[@id='app']/div[1]/dialog/button");
        }

        public static class LoginPage {
            public static By inputEmail = By.xpath("//*[@id='username']");
            public static By inputPassword = By.xpath("//*[@id='password']");
            public static By buttonLogin = By.xpath("//*[@id='app']/div/main/div/div/form/button");
            public static By loggedInUsernameEmail = By.xpath("//*[@id='app']/header/div[1]/span[4]/div/button[1]/span/span/span");
            public static By LoginInfoError = By.xpath("//*[@id='app']/div/main/div/div/form/div[2]");
        }

        public static class MarketplacePage {
            public static By CheckboxProductTypeFilterDlc = By.xpath("//*[@id='app']/main/div/div[1]/aside/form/ul[1]/li[2]/label/span[2]");
            public static By CheckboxProductGenreFilterStrategy = By.xpath("//*[@id='app']/main/div/div[1]/aside/form/ul[4]/li[5]/label/span[1]");
            public static By SelectedFilter1 = By.xpath("//*[@id='app']/main/div/div[1]/section/div[1]/ul/li[2]/span/strong");
            public static By SelectedFilter2 = By.xpath("//*[@id='app']/main/div/div[1]/section/div[1]/ul/li[3]/span/strong");
            public static By FirstItemFromProductList = By.xpath("//*[@id='app']/main/div/div[1]/section/div[2]/div[2]/div[1]/div");
            public static By SecondItemFromProductList = By.xpath("//*[@id='app']/main/div/div[1]/section/div[2]/div[2]/div[2]/div");
            public static By ProductCountInCart = By.xpath("//*[@id='app']/main/div[2]/div[2]/ul/li");
            public static By AddToCartButton = By.xpath("//*[@id='app']/main/div/div/div/div/div[4]/div/div/div/div/div[3]/div[2]/button");
            public static By ViewCartButtonInPopUp = By.xpath("/html/body/div[5]/div/div/a");
            public static By ContinueShoppingButtonInPopUp = By.xpath("/html/body/div[5]/div/div/a");
            public static By RemoveTopItemFromCartButton = By.xpath("//*[@id='app']/main/div[2]/div[1]/div[1]/ul/li[1]/button");
            public static By YourCartIsEmptyMessage = By.xpath("//*[@id='app']/main/div[2]/h2");
        }

        public static class WishlistPage {
            public static By AddFirstProductToWishlistButton = By.xpath("//*[@id='app']/main/div/div[1]/section/div[2]/div[2]/div[1]/span/button");
            public static By AddSecondProductToWishlistButton = By.xpath("//*[@id='app']/main/div/div[1]/section/div[2]/div[2]/div[2]/span/button");
            public static By AddThirdProductToWishlistButton = By.xpath("//*[@id='app']/main/div/div[1]/section/div[2]/div[2]/div[3]/span/button");
            public static By WishlistButton = By.xpath("//*[@id='app']/header/div[1]/span[2]");
            public static By FirstWishlistItemName = By.xpath("//*[@id='app']/main/div/div/div[3]/section/div[2]/div[2]/div[1]/div/div[2]/div/div[1]");
            public static By SecondWishlistItemName = By.xpath("//*[@id='app']/main/div/div/div[3]/section/div[2]/div[2]/div[2]/div/div[2]/div/div[1]");
            public static By ThirdWishlistItemName = By.xpath("//*[@id='app']/main/div/div/div[3]/section/div[2]/div[2]/div[3]/div/div[2]/div/div[1]");
            public static By FirstProductName = By.xpath("//*[@id='app']/main/div/div[1]/section/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/span");
            public static By SecondProductName = By.xpath("//*[@id='app']/main/div/div[1]/section/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/span");
            public static By ThirdProductName = By.xpath("//*[@id='app']/main/div/div[1]/section/div[2]/div[2]/div[3]/div/div[2]/div/div[1]/span");
        }

    }
}
