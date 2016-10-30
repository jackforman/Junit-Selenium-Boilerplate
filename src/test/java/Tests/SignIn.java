package Tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasketPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import static Tests.TestSuite.driverFactory;

/**
 * Created by jack.forman on 30/10/2016.
 */
public class SignIn {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private BasketPage basketpage = new BasketPage(driver);
    private SignInPage signInPage = new SignInPage(driver);

    @Before
    public void individualSetUp(){
        homepage.goTo();
    }

    /** Sign in as Registered User
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Fill in Email Address
     * Fill in Password
     * Click Sign In
     * Verify HomePage is Displayed
     */
    @Test
    public void signInAsRegisteredUser(){
        homepage.navigateToSignInPage();

    }

    /**Cannot sign in as unregistered customer
     * Pre-Conditions - Must have Email address and Password of unregistered customer
     * Navigate to Sign in Page
     * Fill in Email Address
     * Fill in Password
     * Click Sign in
     * Verify Error Message is Displayed
     */
    @Test
    public void signInAsUnRegisteredUser(){

    }
}
