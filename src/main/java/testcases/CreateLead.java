package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLead extends SeMethods{
		
	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("class", "decorativeSubmit");
		click(loginButton);
		WebElement crmFsaLink = locateElement("linkText", "CRM/SFA");
		click(crmFsaLink);
		WebElement createLeadButton = locateElement("linkText", "Create Lead");
		click(createLeadButton);
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		click(companyName);
		type(companyName, "TechMahindra");
		
		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		click(firstName);
		type(firstName, "Balaji");
		
		WebElement lastName = locateElement("id", "createLeadForm_lastName");
		click(lastName);
		type(lastName, "Ramar");
		
		WebElement SourceDD = locateElement("id", "createLeadForm_dataSourceId");
		//click(SourceDD);
		selectDropDownUsingText(SourceDD,"Cold Call");
	
		WebElement MarketCampDD = locateElement("id", "createLeadForm_marketingCampaignId");
		selectDropDownUsingText(MarketCampDD,"Automobile");
		
		//WebElement industryDD = locateElement("id", "createLeadForm_industryEnumId");
		//selectDropDownUsingIndex(industryDD,40);

		WebElement createLeadButton2 = locateElement("name", "submitButton");
		click(createLeadButton2);
		
		closeBrowser();
		
		}
	
	

}
