package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectMethods extends SeMethods {	

	@BeforeMethod(groups= {"smoke","sanity","regression"})
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}

	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}

}
