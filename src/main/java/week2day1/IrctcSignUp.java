	package week2day1;
	
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	public class IrctcSignUp {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			driver.findElementByLinkText("Sign up").click();
			
			
			
			driver.findElementByName("userRegistrationForm:userName").sendKeys("dhwagdre123");
			driver.findElementByLinkText("Check Availability").click();
			driver.findElementByName("userRegistrationForm:password").sendKeys("DheerajIBM321");
			driver.findElementByName("userRegistrationForm:confpasword").sendKeys("DheerajIBM321");
			WebElement securityquestion =driver.findElementById("userRegistrationForm:securityQ");
			Select sq = new Select(securityquestion);
			sq.selectByVisibleText("What is your pet name?");
			driver.findElementByName("userRegistrationForm:securityAnswer").sendKeys("CAT");
			
			
			driver.findElementByName("userRegistrationForm:firstName").sendKeys("Dheeraj");
			driver.findElementByName("userRegistrationForm:middleName").sendKeys("K");
			driver.findElementByName("userRegistrationForm:lastName").sendKeys("Wagdre");
			
			WebElement bitrthdate =driver.findElementById("userRegistrationForm:dobDay");
			Select bd = new Select(bitrthdate);
			bd.selectByVisibleText("01");
			WebElement birthmonth =driver.findElementById("userRegistrationForm:dobMonth");
			Select bm = new Select(birthmonth);
			bm.selectByVisibleText("MAY");
			WebElement birthyear =driver.findElementById("userRegistrationForm:dateOfBirth");
			Select by1 = new Select(birthyear);
			by1.selectByVisibleText("1992");
			
			WebElement occupation =driver.findElementById("userRegistrationForm:occupation");
			Select occu = new Select(occupation);
			occu.selectByVisibleText("Public");
			
			driver.findElementByName("userRegistrationForm:uidno").sendKeys("785320105722");
			driver.findElementByName("userRegistrationForm:idno").sendKeys("ACKPW10231A");
			
			WebElement country =driver.findElementById("userRegistrationForm:countries");
			Select cou = new Select(country);
			cou.selectByVisibleText("India");
			
			driver.findElementByName("userRegistrationForm:email").sendKeys("dheerajwag92@gmail.com");
			driver.findElementByName("userRegistrationForm:mobile").sendKeys("7204398949");
			//driver.findElementByName("userRegistrationForm:isdCode").sendKeys("123");
			
			WebElement nationality =driver.findElementById("userRegistrationForm:nationalityId");
			Select nation = new Select(nationality);
			nation.selectByVisibleText("India");
			
			
		//residential Address
			//flat/door/block no
			driver.findElementByName("userRegistrationForm:address").sendKeys("1/757");
			driver.findElementByName("userRegistrationForm:street").sendKeys("2nd Main Road");
			driver.findElementByName("userRegistrationForm:area").sendKeys("sabari Nagar");
			driver.findElementByName("userRegistrationForm:pincode").sendKeys("600125",Keys.TAB);
			Thread.sleep(3000);
			
			//driver.findElementByName("userRegistrationForm:statesName").sendKeys("TAMIL NADU");
			
			WebElement city =driver.findElementById("userRegistrationForm:cityName");
			Select ct = new Select(city);
			ct.selectByVisibleText("Kanchipuram");
			WebElement postaloffice =driver.findElementById("userRegistrationForm:postofficeName");
			Select po = new Select(postaloffice);
			po.selectByVisibleText("Mugalivakkam S.O");
			driver.findElementByName("userRegistrationForm:landline").sendKeys("044483759");
			
		
		}
	
	}
