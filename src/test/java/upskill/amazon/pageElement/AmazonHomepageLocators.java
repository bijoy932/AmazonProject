package upskill.amazon.pageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomepageLocators {
	
	//Selenium Page Factory
	
	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search Amazon']")
	public WebElement txtbxSearch;
	
	
	//Search Button
	@FindBy(xpath="//input[@type='submit']")
	public WebElement btnSearch;
	
	

}
