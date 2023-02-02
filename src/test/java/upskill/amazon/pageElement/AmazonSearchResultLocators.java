package upskill.amazon.pageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultLocators {
	
	//Validate Blutoth Items
	@FindBy(xpath="//span[@class='a-size-medium a-text-italic']")
	public WebElement txtBlutoth;
	
	
	//Validate Phones Items
	@FindBy(xpath="//span[contains(text(), 'phones') ]")
	public WebElement txtPhones;

}
