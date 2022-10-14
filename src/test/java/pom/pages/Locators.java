package pom.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {


    public static class Eneba {


        public static class Home{
                public static By formPrivacyConfirmation = By.xpath("//*[@id='app']/div/div[1]/div");
                public static By buttonConfirm =
                        By.xpath("//*[@id='app']/div/div[1]/div/div/button[1]");


            }
        public static class LoginPage{
           public static By inputEmail= By.xpath("//*[@id='username']");
            public static By inputPassword = By.xpath("//*[@id='password']");
                public static By buttonLogin = By.xpath("//*[@id='app']/div/main/div/div/form/button");
                public static By loggedInUsernameEmail = By.xpath("//*[@id='app']/header/div[1]/span[4]/div/button[1]/span/span/span");
            }
        public static class MarketplacePage{
            public static By CheckboxProductTypeFilterDlc = By.xpath("//*[@id='app']/main/div/div[1]/aside/form/ul[1]/li[2]/label/span[2]");
            public static By CheckboxProductGenreFilterStrategy = By.xpath("//*[@id='app']/main/div/div[1]/aside/form/ul[4]/li[5]/label/span[1]");
            public static By SelectedFilter1 = By.xpath("//*[@id='app']/main/div/div[1]/section/div[1]/ul/li[2]/span/strong");
            public static By SelectedFilter2 = By.xpath("//*[@id='app']/main/div/div[1]/section/div[1]/ul/li[3]/span/strong");
        }
    }

}
