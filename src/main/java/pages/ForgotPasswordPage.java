package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    WebDriver driver;
    private By email = By.id("email");
    private By submitButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setupEmail(String emailToSent){
        driver.findElement(email).sendKeys(emailToSent);
    }

    public EmailSentPage clickRetrievePasswordButton(){
        driver.findElement(submitButton).click();
        return new EmailSentPage(driver);
    }

}
