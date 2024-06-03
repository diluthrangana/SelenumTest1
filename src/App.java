import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\test1\\src\\drivers\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the specified website
        driver.get("https://www.saucedemo.com/");
        
        // Wait for the page to load
        Thread.sleep(5000);

        // Enter the username
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user"); // Replace with actual username

        // Enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce"); // Replace with actual password

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Wait for some time to observe the result
        Thread.sleep(5000);

        // Quit the driver
        driver.quit();
    }
}
