package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void shouldCompleteCheckoutSuccessfully() {

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.addProductToCart();

        inventoryPage.goToCart();

        cartPage.clickCheckout();

        checkoutPage.fillCheckoutData(
                "Maria",
                "Parrela",
                "01234"
        );

    
        checkoutPage.clickContinue();
        

        System.out.println("URL: " + driver.getCurrentUrl());

        if (checkoutPage.isErrorMessageDisplayed()) {
            System.out.println(
                    "Erro do formulário: " + checkoutPage.getErrorMessage()
            );
        }

        Assertions.assertTrue(
                driver.getCurrentUrl().contains("checkout-step-two"),
                "O teste não avançou para a página de resumo do checkout"
        );

        checkoutPage.clickFinish();

        Assertions.assertEquals(
                "Thank you for your order!",
                checkoutPage.getSuccessMessage()
        );
    }
}