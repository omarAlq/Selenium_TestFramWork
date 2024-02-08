package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class EbayHomePage {

	public EbayHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath ="//input[@id=\"gh-ac\"]")
	public WebElement searchBox;
	
	@FindBy (xpath = "//input[@id=\"gh-btn\"]")
	public WebElement searchBtn;
	
}
