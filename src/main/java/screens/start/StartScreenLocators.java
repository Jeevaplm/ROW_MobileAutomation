package screens.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartScreenLocators {
	
	protected static final By click_skip = By.className("android.widget.TextView");
	
	protected static final By Enter_pnumber = By.className("android.widget.EditText");
	
	protected static final By Click_Register = By.xpath("//android.widget.TextView[@text='Register']");

	//protected static final By Click_Register = By.xpath("");
	
	protected static final By Click_outstation = By.xpath("//android.widget.TextView[@text='Out station']");

	//Outstation Registration Page
	
	protected static final By BookingType_select = By.xpath("//android.widget.EditText[@text='Select']");
	
	protected static final By BookingType_select_passenger = By.xpath("//android.widget.CheckedTextView[@text='Passenger']");
		
	protected static final By Vehiclemodal_select = By.xpath("//android.widget.EditText[@text='Select']");
	
	protected static final By Vehiclemodal_select_vehiclemodel = By.xpath("//android.widget.CheckedTextView[@text='Swift Dzire (4 seater)']");
	
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
	
	//protected static final By Click_RegisterNowButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.widget.Button/android.widget.TextView");
	
	
	
	

}
