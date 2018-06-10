package week2day1;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver	= new ChromeDriver();
		//get url
		driver.get("http://leaftaps.com/opentaps/");
		//enter user name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click submit button
		driver.findElementByClassName("decorativeSubmit").click();
		//select CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		//select create lead
		driver.findElementByLinkText("Create Lead").click();
		//enter company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		//enter lead first name
		driver.findElementById("createLeadForm_firstName").sendKeys("Balaji");
		//enter last name
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramara");
		//select create lead
		WebElement dropdown1 = driver.findElementById("createLeadForm_dataSourceId");
		Select dd1 = new Select(dropdown1);
		dd1.selectByVisibleText("Existing Customer");
		WebElement dropdown2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd2 = new Select(dropdown2);
		dd2.selectByIndex(3);
		WebElement dropdown3 = driver.findElementById("createLeadForm_industryEnumId");
		Select dd3 = new Select(dropdown3);
		List<WebElement> allOptions = dd3.getOptions();
		
		for(WebElement eachOption : allOptions)
		{
			System.out.println(eachOption.getText());
		}
		int count = allOptions.size();
		System.out.println(count);
		
	}

}
