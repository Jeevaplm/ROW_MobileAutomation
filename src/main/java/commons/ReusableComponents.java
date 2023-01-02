package commons;

import utils.MobileBrowserWait;
import static utils.MobileActions.getTextFromElement;
import static commons.ReusableComponentsLocators.*;

public class ReusableComponents extends MobileBrowserWait{
	
	 public String getScreenTitle() {
	        //log.info("Getting screen title");
	        waitUntilElementIsPresent(PAGE_TITLE_CLASS_NAME);
	       return getTextFromElement(PAGE_TITLE_CLASS_NAME);
	    }

}
