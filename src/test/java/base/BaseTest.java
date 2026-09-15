package base;


import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import java.time.Duration;
    
    public class BaseTest {

    protected WebDriver driver;

   @BeforeEach
public void setUp() {

    ChromeOptions options = new ChromeOptions();

    Map<String, Object> prefs = new HashMap<>();

    prefs.put("credentials_enable_service", false);
    prefs.put("profile.password_manager_enabled", false);
    prefs.put("profile.password_manager_leak_detection", false);

    options.setExperimentalOption("prefs", prefs);

    options.addArguments(
            "--disable-features=PasswordLeakDetection,PasswordManagerOnboarding",
            "--disable-save-password-bubble",
            "--incognito"
    );

    driver = new ChromeDriver(options);

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://www.saucedemo.com/");
}
}





