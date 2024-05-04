import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaClasse {
    private WebDriver driver;
    @BeforeEach
    void SetUp(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--no-sandbox");
        //options.addArguments("--headless"); //!!!should be enabled for Jenkins
        driver = new ChromeDriver(options);
     }
    @AfterEach
    void TearDown(){
        driver.quit();
    }
    @Test
    void MonTest() {
        String page = "http://www.google.fr";
        driver.get(page);
        WebElement premierBtn = driver.findElement(By.cssSelector("#L2AGLb > div"));
        premierBtn.click();
    }
}
