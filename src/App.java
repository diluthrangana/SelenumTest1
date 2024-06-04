import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

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
        usernameField.sendKeys("standard_user");

        // Enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        Thread.sleep(1000);

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Wait for the page to load
        Thread.sleep(5000);

        // Generate a random number less than 6
        Random rand = new Random();
        int randomIndex = rand.nextInt(6); // random number between 0 (inclusive) and 6 (exclusive)

        // Construct the id for the random item
        String randomItemId = "item_" + randomIndex + "_title_link";

        // Find the random item link by id and click it
        try {
            WebElement randomItemLink = driver.findElement(By.id(randomItemId));
            randomItemLink.click();

            // Wait for the item page to load
            Thread.sleep(3000);

            // Click the "add-to-cart" button
            WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));
            addToCartButton.click();

            // Wait for the "add-to-cart" action to complete
            Thread.sleep(2000);

            // Click the "shopping_cart_link" button
            WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
            cartButton.click();

            // Wait for the cart page to load
            Thread.sleep(3000);

            // Click the "checkout" button
            WebElement checkoutButton = driver.findElement(By.id("checkout"));
            checkoutButton.click();

            // Wait for the checkout page to load
            Thread.sleep(3000);

            // Fill in the input fields
            WebElement firstNameField = driver.findElement(By.id("first-name"));
            firstNameField.sendKeys("Diluth");

            WebElement lastNameField = driver.findElement(By.id("last-name"));
            lastNameField.sendKeys("Rangana");

            WebElement postalCodeField = driver.findElement(By.id("postal-code"));
            postalCodeField.sendKeys("70100");

            Thread.sleep(1000);

            // Click the "continue" button
            WebElement continueButton = driver.findElement(By.id("continue"));
            continueButton.click();

            // Wait for the page to load
            Thread.sleep(3000);

            // Click the "finish" button
            WebElement finishButton = driver.findElement(By.id("finish"));
            finishButton.click();

            // Wait for the finish action to complete
            Thread.sleep(2000);

            // Click the "back home" button
            WebElement backHomeButton = driver.findElement(By.id("back-to-products"));
            backHomeButton.click();

            // Wait for the home page to load
            Thread.sleep(3000);

            // Click the burger menu button
            WebElement burgerMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenuButton.click();

            // Wait for the menu to open
            Thread.sleep(2000);

            // Click the logout link
            WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
            logoutLink.click();

        } catch (Exception e) {
            System.out.println("Element with id " + randomItemId + " not found.");
        }

        // Wait for some time to observe the result
        Thread.sleep(5000);

        // Quit the driver
        driver.quit();
    }
}
