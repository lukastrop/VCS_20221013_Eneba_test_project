package pom.pages;
import org.openqa.selenium.By;
public class Locators {

    public static class Eneba {

            public static class Home{
                public static By formPrivacyConfirmation = By.xpath("//*[@id='app']/div/div[1]/div");
                public static By buttonConfirm =
                        By.xpath("//*[@id='app']/div/div[1]/div/div/button[1]");
            }

    }

}
