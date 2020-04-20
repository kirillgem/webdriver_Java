package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //Handler
        homePage = new HomePage(driver);

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        WebElement inputsLinks = driver.findElement(By.linkText("Inputs"));
//        inputsLinks.click();

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        WebElement inputsLinks = driver.findElement(By.linkText("Shifting Content"));
//        inputsLinks.click();
//
//        WebElement menuElements = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menuElements.click();
//
//        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
//        System.out.println("Menu items: " + menuItems.size());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    public static void main(String args[]){
//        BaseTests test = new BaseTests();
//        test.setUp();
//    }
}
