import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest extends Hooks {

    public LoginPage loginPage;
    public WebDriverWait wait;

    @Before
    public void SetupPageObject() {
        loginPage = new LoginPage(driver);
        wait = new WebDriverWait(driver, 10);
    }


    @Test
    public void loginTest() throws InterruptedException {
    loginPage.clickAccountButton();
    loginPage.clickLogIn();
    loginPage.fillInMandatoryField();
    loginPage.clickLoginButton();
    }

}