package pom.tests.eneba;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.eneba.LoginPage;
import pom.tests.TestBase;
import pom.utils.TestListener;

import static pom.pages.Common.sleep;

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
        return new Object[][]{
                {"dejoh63107@haizail.com", "dejoh63107"},
                {"doesNotExist@haizail.com", "BadPassword"},
        };
    }

    @Test(dataProvider = "DataProviderForLoginInputFields")
    private void testTwoInputFields(String input1, String input2) {

        String actualLoggedInEmail;

        LoginPage.enterEmail(input1);
        LoginPage.enterPassword(input2);
        LoginPage.clickButtonLogin();
        sleep(19000);
        actualLoggedInEmail = LoginPage.readLoggedInUsernameEmail();

        Assert.assertEquals(actualLoggedInEmail, input1);
    }

}