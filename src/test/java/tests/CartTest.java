package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import base.BaseTest;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;  

public class CartTest extends BaseTest {
   
    @Test
    public void shouldAddProductToCart() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.addProductToCart();
        inventoryPage.goToCart();

        Assertions.assertTrue(cartPage.isBackpackDisplayed());
    }

    @Test
    public void shouldRemoveProductFromCart() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.addProductToCart();
        inventoryPage.goToCart();

        cartPage.removeProduct();

        Assertions.assertFalse(cartPage.isBackpackDisplayed());
    }
}

