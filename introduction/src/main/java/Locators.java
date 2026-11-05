import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    private static final String URL = "https://rahulshettyacademy.com/locatorspractice/";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        // Set a wait time configuration so the "findElement" action will wait until this time before failing
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Get the username field by its id
        String userNameId = "inputUsername";
        WebElement userNameField = driver.findElement(By.id(userNameId));

        // Type on field
        userNameField.sendKeys("Julio");

        // Do the same for password field but now selecting by its name
        String passwordName = "inputPassword";
        WebElement passwordField = driver.findElement(By.name(passwordName));
        passwordField.sendKeys("password");

        // Do the same for button and perform a click
        String buttonClassName = "signInBtn";
        WebElement signInBtn = driver.findElement(By.className(buttonClassName));
        signInBtn.click();

        // Capture the error message after failing login
        // In this case, we're going to use the CSS Selector: p = because it's a p HTML tag (it could be a button, h1, etc.)
        // and error = that's the class name
        String errorCssLocator= "p.error";
        
        WebElement errorMessageAfterFailingLogin = driver.findElement(By.cssSelector(errorCssLocator));
        System.out.println(errorMessageAfterFailingLogin.getText());
    }
}
