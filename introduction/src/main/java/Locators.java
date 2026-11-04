import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    private static final String URL = "https://rahulshettyacademy.com/locatorspractice/";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        // Get the username field by it's id
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
    }
}
