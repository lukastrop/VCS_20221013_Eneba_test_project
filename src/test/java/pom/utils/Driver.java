package pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver(setUpOptions()));
        driver.get().manage().deleteAllCookies();


    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void close() {
        driver.get().quit();
    }

    private static ChromeOptions setUpOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
//        options.addArguments("headless");
        return options;
    }
}