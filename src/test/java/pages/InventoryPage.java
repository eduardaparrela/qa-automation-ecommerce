package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By addBackpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartButton = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addProductToCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(addBackpackButton)
        ).click();
    }

    public void goToCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(cartButton)
        ).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}