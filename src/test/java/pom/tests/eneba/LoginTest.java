package pom.tests.eneba;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.eneba.LoginPage;
import pom.tests.TestBase;
import pom.utils.TestListener;



@Listeners(TestListener.class)
public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://my.eneba.com/lt/login?ref=%2Flt%2F");

    }

    @DataProvider(name = "DataProviderForLoginInputFields")
    public Object[][] provideDataForLoginInputFields() {
        return new Object[][]{{"dejoh63107@haizail.com", "dejoh63107"}, {"sapavi4753@haboty.com", "sapavi4753"},};
    }

    @Test(dataProvider = "DataProviderForLoginInputFields")
    private void PositiveLoginTest(String input1, String input2) {

        String actualLoggedInEmail;

        LoginPage.enterEmail(input1);
        LoginPage.enterPassword(input2);
        LoginPage.clickButtonLogin();
        actualLoggedInEmail = LoginPage.readLoggedInUsernameEmail();
        Assert.assertEquals(actualLoggedInEmail, input1);
    }

    @Test
    private void NegativeLoginTest() {

        LoginPage.enterEmail("NotEmail");
        LoginPage.enterPassword("NotPassword");
        LoginPage.clickButtonLogin();
        Assert.assertTrue(LoginPage.isLoginErrorMessagedisplayed());

    }
}