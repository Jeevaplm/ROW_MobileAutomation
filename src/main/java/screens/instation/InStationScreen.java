package screens.instation;

import static screens.instation.InStationScreenLocators.AdharNo;
import static screens.instation.InStationScreenLocators.InStation_BookingType_select;
import static screens.instation.InStationScreenLocators.InStation_BType_select_Auto;
import static screens.instation.InStationScreenLocators.Click_Register;
import static screens.instation.InStationScreenLocators.Click_RegisterNowButton;
import static screens.instation.InStationScreenLocators.Click_InStation;
import static screens.instation.InStationScreenLocators.Driving_LicenseNo;
import static screens.instation.InStationScreenLocators.Email;
import static screens.instation.InStationScreenLocators.Firstname;
import static screens.instation.InStationScreenLocators.Lastname;
import static screens.instation.InStationScreenLocators.Mobilenumber;
import static screens.instation.InStationScreenLocators.ReferralID;
import static screens.instation.InStationScreenLocators.VehicleNo;
import static screens.instation.InStationScreenLocators.address;
import static screens.instation.InStationScreenLocators.click_skip;
import static screens.instation.InStationScreenLocators.confirmpassword;
import static screens.instation.InStationScreenLocators.password;
import static utils.MobileActions.clearAndfillInFieldWith;
import static utils.MobileActions.clickElementBy;

import io.appium.java_client.MobileBy;
import utils.MobileBrowserWait;

public class InStationScreen extends MobileBrowserWait {
	
	public void clickskipButton() {
        waitUntilElementIsPresent(click_skip);
        clickElementBy(click_skip);
    }
	
	public void clickRegisteroption() {
        waitUntilElementIsPresent(Click_Register);
        clickElementBy(Click_Register);
    }
	
	public void clickoutstation() {
        waitUntilElementIsPresent(Click_InStation);
        clickElementBy(Click_InStation);
    }
	
	public void clickbookingtype() {
        waitUntilElementIsPresent(InStation_BookingType_select);
        clickElementBy(InStation_BookingType_select);
    }
	
	public void clickbookingtypeaspassenger() {
        waitUntilElementIsPresent(InStation_BType_select_Auto);
        clickElementBy(InStation_BType_select_Auto);
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
	
	
	public void scroll() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"address\").instance(0))"));
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).flingToEnd(1)"));
	}
	
	public void scroll1() {
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Click_RegisterNowButton\").instance(0))"));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).flingToEnd(1)"));
	}

}
