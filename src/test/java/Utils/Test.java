package Utils;

import Pages.EbayHomePage;
import Pages.EbaySearchPage;

public class Test {

	public static void main(String[] args) {
		
		ebaySearchDemo();
		
		}

		public static void ebaySearchDemo() {
			
			EbayHomePage ebayHomePage = new EbayHomePage();
			EbaySearchPage ebaySearchPage = new EbaySearchPage();
			BrowserUtilities browserUtilities = new BrowserUtilities();
			
			Driver.getDriver().get("https://www.ebay.com/");
			
			browserUtilities.waitForElementToBeVisible(ebayHomePage.searchBox);
			ebayHomePage.searchBox.sendKeys(PropertiesReader.getProperty("search_word"));
			
			browserUtilities.waitForElementToBeVisible(ebayHomePage.searchBtn);
			ebayHomePage.searchBtn.click();
			
				
//			browserUtilities.waitForAllElementsToBeVisible(ebaySearchPage.priceList);
			
			System.out.println(ebaySearchPage.pricePerItem());
			
		}
	
}
