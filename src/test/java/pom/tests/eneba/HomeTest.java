package pom.tests.eneba;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.eneba.Homepage;
import pom.tests.TestBase;
public class HomeTest extends TestBase{

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        Homepage.open("https://www.eneba.com/lt/");
        Homepage.acceptPrivacyConfirmation();
    }
}
