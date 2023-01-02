package apptests;

import static constants.Constants.PLACEHOLDER_TEXT_EMAIL_FIELD;
import static constants.Constants.PLACEHOLDER_TEXT_PASSWORD_FIELD;
import static constants.Constants.SCREEN_TITLE;
import static constants.Constants.TOAST_ERROR_MESSAGE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTestAndroid;
import commons.ReusableComponents;
import dataproviders.ConfigFileReader;
import io.qameta.allure.Description;
import screens.login.LoginScreen;
import screens.search.SearchScreen;
import screens.start.StartScreen;
import screens.start.StartScreenLocators;
import utils.RandomHelper;

public class StartTests extends BaseTestAndroid{
	
	ConfigFileReader configFileReader = new ConfigFileReader();
    LoginScreen loginScreen = new LoginScreen();
    ReusableComponents reusableComponents = new ReusableComponents();
    SearchScreen searchScreen = new SearchScreen();
    RandomHelper randomHelper = new RandomHelper();
    
    StartScreen screen = new StartScreen();
    
    
    JavascriptExecutor js;

    //@Title("Login with correct credentials")
    @Description("Verify login is successful with valid credentials")
    @Test(groups = {"SMOKE"})
    public void clickNextbutton() throws InterruptedException {
        
        screen.clickskipButton();
       
        screen.enterPhoneNumber();
        
        screen.clickRegisteroption();
        
        screen.clickoutstation();
        
        screen.clickbookingtype();
        
        screen.clickbookingtypeaspassenger();
        
        screen.clickvehiclemodel();
        
        screen.clickvehiclemodelasswift();
       
        screen.enterfirstname();
        
        screen.enterlastname();
        
        screen.entermobileNumber();
                      
        screen.enterEmail();
        
        screen.scroll();
        
        screen.enteraddress();
              
        screen.enterpassword();
        
        screen.enterConfirmpassword();
        
        screen.enterAdharNo();
        
        screen.enterDrivingLicenseNO();
        
        screen.scroll1();
        
        screen.entervehicleNo();
        
        //screen.enterReferralID();
        
        screen.clickRegisterButton();
        Thread.sleep(6000);
    }

    

	

}
