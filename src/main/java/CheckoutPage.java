import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class CheckoutPage extends BasePage {

    public WebDriverWait wait;


    public CheckoutPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//a[text()='Food']")
    private WebElement foodMenu;

    @FindBy(css = ".product-info button")
    private WebElement addToCart;

    @FindBy(css = ".product-cart-actions input")
    private WebElement selectQtyCart;

    @FindBy(css = ".product-cart-actions button")
    private WebElement updateQuantityButton;

    @FindBy(id = "city")
    private WebElement cityCart;

    @FindBy(id = "postcode")
    private WebElement postCode;

    @FindBy(id = "region_id")
    public WebElement cartRegion;

    @FindBy(css = ".method-checkout-cart-methods-onepage-bottom button")
    private WebElement cartCheckout;

    @FindBy(css = ".step-title")
    public WebElement stepTitleElement;

    @FindBy(id = "onepage-guest-register-button")
    private WebElement guest;

    @FindBy(id = "billing:firstname")
    public WebElement firstnameInput;

    @FindBy(id = "billing:middlename")
    private WebElement middlenameInput;

    @FindBy(id = "billing:lastname")
    public WebElement lastnameInput;

    @FindBy(id = "billing:company")
    private WebElement companyInput;

    @FindBy(id = "billing:email")
    private WebElement emailInput;

    @FindBy(id = "billing:street1")
    public WebElement street1Input;

    @FindBy(id = "billing:street2")
    private WebElement street2Input;

    @FindBy(id = "billing:city")
    public WebElement cityInput;

    @FindBy(css = ".method-checkout-cart-methods-onepage-bottom button")
    private WebElement checkoutButton;

    @FindBy(id = "onepage-guest-register-button")
    private WebElement guestRegisterButton;

    @FindBy(id = "billing:region_id")
    public WebElement billingRegion;

    @FindBy(id = "billing:postcode")
    public WebElement billingPostcode;

    @FindBy(id = "billing:telephone")
    public WebElement billingTelephone;

    @FindBy(css = "#shipping-method-buttons-container button")
    public WebElement shippingButton;

    @FindBy(css = "#billing-buttons-container button")
    public WebElement billingButton;

    @FindBy(css = "#payment-buttons-container button")
    public WebElement paymentButton;

    @FindBy(css = ".button.btn-checkout")
    public WebElement checkoutOrderButton;

    @FindBy(css = ".sub-title")
    public WebElement subTitleElement;

    @FindBy(id = "advice-required-entry-billing:firstname")
    public WebElement requiredFirstName;

    @FindBy(id = "advice-required-entry-billing:lastname")
    public WebElement requiredLastName;

    @FindBy(id = "advice-required-entry-billing:street1")
    public WebElement requiredStreet1;

    @FindBy(id = "advice-required-entry-billing:city")
    public WebElement requiredCity;

    @FindBy(id = "advice-required-entry-billing:postcode")
    public WebElement requiredBillingPostcode;

    @FindBy (id = "advice-required-entry-billing:telephone")
    public WebElement requiredBillingTelephone;

    @FindBy (id = "advice-validate-select-billing:region_id")
    public WebElement requiredBillingRegion;


//    driver.findElement(By.id("city")).sendKeys("alabama");

//    driver.findElement(By.id("postcode")).sendKeys("12345");

    public void getFoodMenu() {
        foodMenu.click();
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    private void clickSelectQtyCart() {
        selectQtyCart.clear();
        selectQtyCart.sendKeys("2");
    }

    private void updateQuantityButton() {
        updateQuantityButton.click();
    }

    public void setCityCart() {
        cityCart.sendKeys("alabama");
    }

    public void setPostCode() {
        postCode.sendKeys("12345");
    }

    public void setCartRegion() {
        cartRegion.click();
    }

    public void clickProceedToCheckout() {
        cartCheckout.click();
    }

    public void clickGuest() {
        guest.click();
    }

    public void enterFirstname(String firstname) {
        firstnameInput.sendKeys(firstname);
    }

    public void enterMiddlename(String middlename) {
        middlenameInput.sendKeys(middlename);
    }

    public void enterLastname(String lastname) {
        lastnameInput.sendKeys(lastname);
    }

    public void enterCompany(String company) {
        companyInput.sendKeys(company);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterStreet1(String street1) {
        street1Input.sendKeys(street1);
    }

    public void enterStreet2(String street2) {
        street2Input.sendKeys(street2);
    }

    public void enterCity(String city) {
        cityInput.sendKeys(city);
    }

    public void setBillingPostCode() {
        billingPostcode.sendKeys("12345");
    }

    public void setBillingTelephone() {
        billingTelephone.sendKeys("0123456789");
    }

    public void clickShippingButton() {
        shippingButton.click();
    }

    public void clickBillingButton() {
        billingButton.click();
    }

    public void clickPaymentButton() {
        paymentButton.click();
    }

    public void clickPlaceOrderButton() {
        checkoutOrderButton.click();
    }


    public void selectOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    }

    public void addItemToCart() {
        getFoodMenu();
        clickAddToCart();
    }

    public void addOneMoreProductToCart() {
        clickSelectQtyCart();
        updateQuantityButton();
    }

    public void cartInfo() {
        setCityCart();
        setPostCode();
        setCartRegion();
        selectOption(cartRegion, "Alabama");
        clickProceedToCheckout();


//    wait.until(ExpectedConditions.elementToBeClickable(stepTitleElement));
//    assertEquals(, stepTitleElement.getText());
    }

    public void fillInMandatoryField() {
        enterFirstname("Test");
        enterMiddlename("Test2");
        enterLastname("Test3");
        enterCompany("Test5");
        enterEmail("asdf@example.com");
        enterStreet1("adresa mea");
        enterStreet2("adresa mea 2");
        enterCity("Alabama City");
        selectOption(billingRegion, "Alabama");
        setBillingPostCode();
        setBillingTelephone();
        wait.until(ExpectedConditions.elementToBeClickable(billingButton));

    }

    public void continueButtons() {
        clickBillingButton();
        clickWhenReady(shippingButton);
        clickWhenReady(paymentButton);
        clickWhenReady(checkoutOrderButton);


//        wait.until(ExpectedConditions.elementToBeClickable(shippingButton));
//        clickShippingButton();
//        wait.until(ExpectedConditions.elementToBeClickable(paymentButton));
//        clickPaymentButton();
//        wait.until(ExpectedConditions.elementToBeClickable(checkoutOrderButton));
//        clickPlaceOrderButton();


    }


    public void clickWhenReady(WebElement locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void assertTextWhenReady(WebElement locator, String expectedText) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(locator, expectedText));
        } catch (Exception e) {
            System.out.println("Element or text not visible or incorrect");
        }
        assertEquals(expectedText, locator.getText());
    }

    public void fillMandatoryFieldsExcept(WebElement fieldToSkip) {

        addItemToCart();
        cartInfo();
        clickGuest();
        fillInMandatoryField();
        fieldToSkip.clear();
        billingButton.click();
    }

//
//    .findElement(By.xpath(".//following-sibling::div"));
//    public void checkIfCheckoutFieldIsMandatory(WebElement locator) throws InterruptedException {
//        addItemToCart();
//        addPreliminaryInfo();
//        clickBtnRegister();
//        fillMandatoryFields();
//        locator.clear();
//        clickWhenReady(billingButton);
//        WebElement target = locator.findElement(By.xpath(".//following-sibling::div"));
//        assertWhenReady(target, "This is a required field.");

//    public void checkIfCheckoutSelectIsMandatory(WebElement locator) throws InterruptedException {
//        addItemToCart();
//        addPreliminaryInfo();
//        clickBtnRegister();
//        fillMandatoryFields();
//        locator.findElement(By.xpath(".//option")).click();
//        clickWhenReady(billingButton);
//        WebElement target = locator.findElement(By.xpath(".//following-sibling::div"));
//        assertWhenReady(target, "Please select an option.");
//    }


    public void fillMandatoryFieldsExceptSelect(WebElement fieldToSkip) {

        addItemToCart();
        cartInfo();
        clickGuest();
        fillInMandatoryField();
        selectOption(fieldToSkip,"Please select region, state or province");
        billingButton.click();
    }

}








