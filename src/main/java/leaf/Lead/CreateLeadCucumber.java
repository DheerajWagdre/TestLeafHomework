package leaf.Lead;


import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLeadCucumber extends ProjectMethods{

	@Test(groups="smoke")
	public void createLead() {	
		login();
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Gopinath");
		type(locateElement("id", "createLeadForm_lastName"), "Jayakumar");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
		System.out.println("CreateLead");
		closeApp();
		
	}
	
}


