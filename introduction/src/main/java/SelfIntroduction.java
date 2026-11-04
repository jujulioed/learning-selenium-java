import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {
    public static void main(String[] args) {

        // Invoking Browser

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
