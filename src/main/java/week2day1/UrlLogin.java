package week2day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class UrlLogin {

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
		
		
		
		    driver.findElementById("createLeadForm_birthDate-button").click();
		 
		   
		   List<WebElement> rows = driver.findElements(By.className("daysrow"));
		   System.out.println(rows.size());
		   List<WebElement> column = rows.get(1).findElements(By.tagName("td"));
		   System.out.println(column.get(2));
		   column.get(2).click();
		   
		   //driver.findElementByLinkText("Create Lead").click();
		//select create lead
		//driver.findElementByName("submitButton").click();	
	
	   
	}
	

	
}
