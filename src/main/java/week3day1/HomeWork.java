package week3day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class HomeWork {

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
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByLinkText("Lookup").click();
		
		
	}
	

	
}
