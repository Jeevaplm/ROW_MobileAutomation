package screens.start;

import static screens.start.StartScreenLocators.click_skip;
import static screens.start.StartScreenLocators.Enter_pnumber;
import static screens.start.StartScreenLocators.Click_Register;
import static screens.start.StartScreenLocators.Click_outstation;
import static screens.start.StartScreenLocators.BookingType_select;
import static screens.start.StartScreenLocators.BookingType_select_passenger;
import static screens.start.StartScreenLocators.Vehiclemodal_select;
import static screens.start.StartScreenLocators.Vehiclemodal_select_vehiclemodel;
import static screens.start.StartScreenLocators.Firstname;
import static screens.start.StartScreenLocators.Lastname;
import static screens.start.StartScreenLocators.Mobilenumber;
import static screens.start.StartScreenLocators.Email;
import static screens.start.StartScreenLocators.address;
import static screens.start.StartScreenLocators.password;
import static screens.start.StartScreenLocators.confirmpassword;
import static screens.start.StartScreenLocators.AdharNo;
import static screens.start.StartScreenLocators.Driving_LicenseNo;
import static screens.start.StartScreenLocators.VehicleNo;
import static screens.start.StartScreenLocators.ReferralID;
import static screens.start.StartScreenLocators.Click_RegisterNowButton;
import static utils.MobileActions.clearAndfillInFieldWith;
import static utils.MobileActions.clickElementBy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import utils.MobileBrowserWait;

public class StartScreen extends MobileBrowserWait{

	public void clickskipButton() {
        waitUntilElementIsPresent(click_skip);
        clickElementBy(click_skip);
    }
	
	public void enterPhoneNumber() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(Enter_pnumber);
	        clearAndfillInFieldWith(Enter_pnumber, "9790079898");
	    }
	public void clickRegisteroption() {
        waitUntilElementIsPresent(Click_Register);
        clickElementBy(Click_Register);
    }
	
	public void clickoutstation() {
        waitUntilElementIsPresent(Click_outstation);
        clickElementBy(Click_outstation);
    }
	
	public void clickbookingtype() {
        waitUntilElementIsPresent(BookingType_select);
        clickElementBy(BookingType_select);
    }
	
	public void clickbookingtypeaspassenger() {
        waitUntilElementIsPresent(BookingType_select_passenger);
        clickElementBy(BookingType_select_passenger);
    }
	
	public void clickvehiclemodel() {
        waitUntilElementIsPresent(Vehiclemodal_select);
        clickElementBy(Vehiclemodal_select);
    }
	
	public void clickvehiclemodelasswift() {
        waitUntilElementIsPresent(Vehiclemodal_select_vehiclemodel);
        clickElementBy(Vehiclemodal_select_vehiclemodel);
    }
	
	public void enterfirstname() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(Firstname);
	        clearAndfillInFieldWith(Firstname, "Jeeva");
	        
	}
	
	public void enterlastname() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(Lastname);
	        clearAndfillInFieldWith(Lastname, "K");
	        
	}
	
	public void entermobileNumber() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(Mobilenumber);
	        clearAndfillInFieldWith(Mobilenumber, "9790079875");
	        
	}
	
	public void enterEmail() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(Email);
	        clearAndfillInFieldWith(Email, "jeevacseplm@gmail.com");   
	}
	
	public void enteraddress() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(address);
	        clearAndfillInFieldWith(address, "Bangalore");   
	}
	
	public void enterpassword() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(password);
	        clearAndfillInFieldWith(password, "jeevacseplm@8979");   
	}
	
	public void enterConfirmpassword() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(confirmpassword);
	        clearAndfillInFieldWith(confirmpassword, "jeevacseplm@8979");   
	}
	
	public void enterAdharNo() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(AdharNo);
	        clearAndfillInFieldWith(AdharNo, "5789 2456 7896 3254");   
	}
	
	public void enterDrivingLicenseNO() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(Driving_LicenseNo);
	        clearAndfillInFieldWith(Driving_LicenseNo, "TN578IURTG875");   
	}
	
	public void entervehicleNo() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(VehicleNo);
	        clearAndfillInFieldWith(VehicleNo, "KA 51 HK 5662");   
	}
	
	public void enterReferralID() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(ReferralID);
	        clearAndfillInFieldWith(ReferralID, "KA_02");   
	}
	
	public void clickRegisterButton() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(Click_RegisterNowButton);
	        clickElementBy(Click_RegisterNowButton);  
	}
	/*public void scrollpage() {
	TouchActions action = new TouchActions(driver);
    action.scroll(VehicleNo, 10, 100);
    action.perform();
	}*/
	
	public void scroll() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"address\").instance(0))"));
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).flingToEnd(1)"));
	}
	
	public void scroll1() {
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Click_RegisterNowButton\").instance(0))"));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).flingToEnd(1)"));
	}
	/*
	 * public void scroll() { Dimension dimensions =
	 * driver.manage().window().getSize(); int Startpoint = (int)
	 * (dimensions.getHeight() * 0.5); int scrollEnd = (int) (dimensions.getHeight()
	 * * 0.5); driver.swipe(200, Startpoint,200,scrollEnd,2000); }
	 */
    
}
