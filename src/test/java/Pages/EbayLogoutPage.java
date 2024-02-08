package Pages;

import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class EbayLogoutPage {

	public EbayLogoutPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
}
