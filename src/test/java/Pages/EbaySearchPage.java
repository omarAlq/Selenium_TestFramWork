package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class EbaySearchPage {

	public EbaySearchPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//span[@class=\"s-item__price\"]")
	public List<WebElement> prices;
	
	public String pricePerItem() {
		StringBuilder stringBuilder = new StringBuilder();
	        for (WebElement element : prices) {
	        stringBuilder.append(element.getText()).append(" ");
	        }
	      return stringBuilder.toString();
	}
	
}
