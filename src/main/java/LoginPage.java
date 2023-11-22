import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage {

    public WebDriverWait wait;


    public LoginPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(css = ".skip-account span.label")
    public WebElement accountButton;

    @FindBy(linkText = "Log In")
    public WebElement logIn;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(css = "#send2.button")
    public WebElement loginButton;

    public void clickAccountButton() {
        accountButton.click();
    }

    public void clickLogIn() {
        logIn.click();
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();

    }

//        public void clickWhenReady(WebElement locator) {
//            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
//            element.click();
//        }

        public void fillInMandatoryField() {
           enterEmail("example@example.com");
           enterPassword("adr133");
       }

    }












