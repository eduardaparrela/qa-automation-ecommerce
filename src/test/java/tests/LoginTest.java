package tests;

import base.BaseTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void shouldLoginSuccessfully() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void shouldNotLoginWithInvalidPassword() {
     LoginPage loginPage = new LoginPage(driver);

     loginPage.login("standard_user", "senha_errada");

    Assertions.assertTrue(loginPage.getErrorMessage().contains("Username and password do not match"));
}
}