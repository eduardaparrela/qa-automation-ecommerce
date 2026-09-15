package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By successMessage = By.className("complete-header");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void fillCheckoutData(
        String firstName,
        String lastName,
        String postalCode
) {
    WebElement firstNameElement = wait.until(
            ExpectedConditions.elementToBeClickable(firstNameField ));

    firstNameElement.sendKeys(firstName);

  wait.until(driver ->
        firstName.equals(
                driver.findElement(firstNameField)
                        .getDomProperty("value")
        )
);

    WebElement lastNameElement = wait.until(
            ExpectedConditions.elementToBeClickable(lastNameField));

    lastNameElement.sendKeys(lastName);

    wait.until(driver ->
            lastName.equals(
                    driver.findElement(lastNameField)
                            .getDomProperty("value")
            )
    );

    WebElement postalCodeElement = wait.until(
            ExpectedConditions.elementToBeClickable(postalCodeField)
    );

    postalCodeElement.sendKeys(postalCode);

    wait.until(driver ->
            postalCode.equals(
                    driver.findElement(postalCodeField)
                            .getDomProperty("value")
            )
    );
}
    

    public void clickContinue() {
        wait.until(
                ExpectedConditions.elementToBeClickable(continueButton))
                .click();
    }

    public void clickFinish() {
        wait.until(
                ExpectedConditions.elementToBeClickable(finishButton))
                .click();
    }

    public String getSuccessMessage() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(successMessage))
                .getText();
    }

    public String getErrorMessage() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(errorMessage))
                .getText();
    }

    public boolean isErrorMessageDisplayed() {
        return !driver.findElements(errorMessage).isEmpty();
    }
}