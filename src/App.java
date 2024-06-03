import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\test1\\src\\drivers\\chromedriver.exe");

        // Set ChromeOptions for incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        
        // Print the title of the page
        System.out.println(driver.getTitle());

        // Perform a search for "ebay"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ebay");
        searchBox.submit();
        
        // Wait for the search results to load
        Thread.sleep(3000);
        
        // Click on the first search result
        List<WebElement> searchResults = driver.findElements(By.cssSelector("h3"));
        if (!searchResults.isEmpty()) {
            searchResults.get(0).click();
        } else {
            System.out.println("No search results found for 'ebay'.");
            driver.quit();
            return;
        }

        // Wait for the first website to load
        Thread.sleep(5000);
        
        // Search for "pen" in the specified search box
        try {
            WebElement searchInput = driver.findElement(By.id("gh-ac"));
            searchInput.sendKeys("pen");
            searchInput.submit();
        } catch (Exception e) {
            System.out.println("Search box not found on the website.");
        }
        
        // Wait for the search results to load
        Thread.sleep(5000);

        // Quit the driver
        driver.quit();
    }
}
