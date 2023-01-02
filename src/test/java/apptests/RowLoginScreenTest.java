package apptests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basetest.BaseTestAndroid;
import commons.ReusableComponents;
import dataproviders.ConfigFileReader;
import io.qameta.allure.Description;
import screens.login.LoginScreen;
import screens.rowlogin.RowLoginScreen;
import screens.search.SearchScreen;
import screens.start.StartScreen;
import utils.RandomHelper;

public class RowLoginScreenTest extends BaseTestAndroid{
	
	ConfigFileReader configFileReader = new ConfigFileReader();
    LoginScreen loginScreen = new LoginScreen();
    ReusableComponents reusableComponents = new ReusableComponents();
    SearchScreen searchScreen = new SearchScreen();
    RandomHelper randomHelper = new RandomHelper();
    
    RowLoginScreen logscreen = new RowLoginScreen();
    
    
    JavascriptExecutor js;

    //@Title("Login with correct credentials")
    @Description("Verify login is successful with valid credentials")
    @Test(groups = {"SMOKE"})
    public void SignIn() throws InterruptedException {
        
        logscreen.clickskipButton();
        logscreen.enterPhoneNumber();
        logscreen.clickSigninButton();
        
        Thread.sleep(5000);
        
        
    }
        
        

}
