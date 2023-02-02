package upskill.amazon.page.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElement.AmazonHomepageLocators;
import upskill.utilities.SetupDrivers;

public class AmazonHomepageActions {
	
	AmazonHomepageLocators AmazonHomepageLocatorsObj;
	
	
	public AmazonHomepageActions(){
		AmazonHomepageLocatorsObj=new AmazonHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver,AmazonHomepageLocatorsObj);
		
	}
	
	public void SearchBlutoth(){
		AmazonHomepageLocatorsObj.txtbxSearch.sendKeys("blutoth");
		AmazonHomepageLocatorsObj.btnSearch.click();
	}
	
	public void SearchPhones(){
		AmazonHomepageLocatorsObj.txtbxSearch.sendKeys("phones");
		AmazonHomepageLocatorsObj.btnSearch.click();
		
		
	}

}
