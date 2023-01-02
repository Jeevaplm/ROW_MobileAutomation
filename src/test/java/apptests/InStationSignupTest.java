package apptests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basetest.BaseTestAndroid;
import commons.ReusableComponents;
import dataproviders.ConfigFileReader;
import io.qameta.allure.Description;
import screens.instation.InStationScreen;
import screens.login.LoginScreen;
import screens.search.SearchScreen;
import screens.start.StartScreen;
import utils.RandomHelper;

public class InStationSignupTest extends BaseTestAndroid {
	
	ConfigFileReader configFileReader = new ConfigFileReader();
    LoginScreen loginScreen = new LoginScreen();
    ReusableComponents reusableComponents = new ReusableComponents();
    SearchScreen searchScreen = new SearchScreen();
    RandomHelper randomHelper = new RandomHelper();
    
    InStationScreen instationscreen = new InStationScreen();
    
    
    //@Title("Login with correct credentials")
    @Description("Verify login is successful with valid credentials")
    @Test(groups = {"SMOKE"})
    public void clickNextbutton() throws InterruptedException {
        
    	instationscreen.clickskipButton();
              
    	instationscreen.clickRegisteroption();
        
    	instationscreen.clickoutstation();
        
    	instationscreen.clickbookingtype();
        
    	instationscreen.clickbookingtypeaspassenger();
               
    	instationscreen.enterfirstname();
        
    	instationscreen.enterlastname();
        
    	instationscreen.entermobileNumber();
                      
    	instationscreen.enterEmail();
        
    	instationscreen.scroll();
        
    	instationscreen.enteraddress();
              
    	instationscreen.enterpassword();
        
    	instationscreen.enterConfirmpassword();
        
    	instationscreen.enterAdharNo();
        
    	instationscreen.enterDrivingLicenseNO();
        
    	instationscreen.scroll1();
        
    	instationscreen.entervehicleNo();
        
        //screen.enterReferralID();
        
    	instationscreen.clickRegisterButton();
        Thread.sleep(6000);
    }


}
