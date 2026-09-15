package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By checkoutButton = By.id("checkout");
    private By removeButton = By.id("remove-sauce-labs-backpack");
    private By backpackProductName =
            By.xpath("//div[text()='Sauce Labs Backpack']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickCheckout() {
        wait.until(
                ExpectedConditions.elementToBeClickable(checkoutButton)
        ).click();
    }

    public void removeProduct() {
        wait.until(
                ExpectedConditions.elementToBeClickable(removeButton)
        ).click();

        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(
                        backpackProductName
                )
        );
    }

    public boolean isBackpackDisplayed() {
        return !driver.findElements(backpackProductName).isEmpty();
    }
}