package screens.rowlogin;

import static screens.rowlogin.RowLoginScreenLocators.Enter_pnumber;
import static screens.rowlogin.RowLoginScreenLocators.click_skip;
import static screens.rowlogin.RowLoginScreenLocators.Click_Signin;
import static utils.MobileActions.clearAndfillInFieldWith;
import static utils.MobileActions.clickElementBy;

import utils.MobileBrowserWait;

public class RowLoginScreen extends MobileBrowserWait {
	
	public void clickskipButton() {
        waitUntilElementIsPresent(click_skip);
        clickElementBy(click_skip);
    }
	
	public void enterPhoneNumber() {
	       // log.info("Entering email address {}", userName);
	        waitUntilElementIsPresent(Enter_pnumber);
	        clearAndfillInFieldWith(Enter_pnumber, "9345954215");
	    }
	
	public void clickSigninButton() {
        waitUntilElementIsPresent(Click_Signin);
        clickElementBy(Click_Signin);
    }

}
