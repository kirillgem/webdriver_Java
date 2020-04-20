package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    WebDriver driver;
    private By content  = By.id("content");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessText(){
        return driver.findElement(content).getText();
    }
}
