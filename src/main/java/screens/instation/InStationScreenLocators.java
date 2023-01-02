package screens.instation;

import org.openqa.selenium.By;

public class InStationScreenLocators {
	
    protected static final By click_skip = By.className("android.widget.TextView");
	
	protected static final By Click_Register = By.xpath("//android.widget.TextView[@text='Register']");
	
	protected static final By Click_InStation = By.xpath("//android.widget.TextView[@text='In station']");
	
    protected static final By InStation_BookingType_select = By.xpath("//android.widget.EditText[@text='Select']");
	
	protected static final By InStation_BType_select_Auto = By.xpath("//android.widget.CheckedTextView[@text='Auto']");
		
    protected static final By Firstname = By.xpath("//android.widget.EditText[@text='First Name']");
	
	protected static final By Lastname = By.xpath("//android.widget.EditText[@text='Last Name']");
	
	protected static final By Mobilenumber = By.xpath("//android.widget.EditText[@text='Mobile Number']");
	
	protected static final By Email = By.xpath("//android.widget.EditText[@text='Email']");
	
	protected static final By address = By.xpath("//android.widget.EditText[@text='Address']");
	
	protected static final By password = By.xpath("//android.widget.EditText[@text='Password']");
	
	protected static final By confirmpassword = By.xpath("//android.widget.EditText[@text='Confirm Password']");
	
	protected static final By AdharNo = By.xpath("//android.widget.EditText[@text='AadharNo.']");
	
	protected static final By Driving_LicenseNo = By.xpath("//android.widget.EditText[@text='Driving LicenseNo.']");
	
	protected static final By VehicleNo = By.xpath("//android.widget.EditText[@text='Vehicle No']");
	
	protected static final By ReferralID = By.xpath("//android.widget.TextView[@text='Referral Id (Optional)']");
	
	//protected static final By Click_RegisterNowButton = By.xpath("//android.widget.TextView[@text='Register Now']");
	protected static final By Click_RegisterNowButton = By.className("android.widget.Button");
	
	

}
