package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateLead {

	public static RemoteWebDriver driver;
	@Given("Invoke LeafTap application")
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
@And("Enter the UserName as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
@And("Enter the PassWord as (.*)")
	public void enterPassWord(String Pass) {
		driver.findElementById("password").sendKeys(Pass);
	}
@And("Click on Login button")
	public void Login() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
@And("Select CRM/SFA")
public void selectCRMFSA() {
	driver.findElementByLinkText("CRM/SFA").click();
}
@And("Select Create Lead button")
public void selectCreateLead() {
	driver.findElementByLinkText("Create Lead").click();
}	
	
@And("Enter CompanyName as (.*)")
public void enterCompanyName(String compName) {
	driver.findElementById("createLeadForm_companyName").sendKeys(compName);
}	
@And("Enter First Name as (.*)")
public void enterFirstName(String firstName) {
	driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
}	
@And("Enter Last Name as (.*)")
public void enterLastName(String lastName) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
}	
@And("Click on Create Lead button")
public void clickCreateLead() {
	driver.findElementByClassName("smallSubmit").click();	
}

@Then("Verify lead created successfully")
public void verifyCreateLead() {
	System.out.println("Lead created successfully");	
}
	
}
