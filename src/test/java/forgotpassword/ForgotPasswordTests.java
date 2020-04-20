package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testSuccessForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setupEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getSuccessText().contains("Your e-mail's been sent!"), "Forgot password Alert text incorrect");
    }
}
