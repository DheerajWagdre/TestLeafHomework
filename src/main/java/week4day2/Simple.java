package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("dheerajwag92@gmail.com");
		driver.findElementById("pass").sendKeys("dheerajwag92@gmail");
		driver.findElementById("loginbutton").click();
		driver.findElementByName("q").sendKeys("TestLeaf",Keys.ENTER);
			
		driver.findElementByXPath("//div[@class='_3ko9']/following::div/span/button").click();
		
		//driver.findElementByXPath("//div[@class='_']/following::div/span/button").click();
		driver.findElementByXPath("//div[text()='TestLeaf']").click();
		driver.findElementByXPath("//span[text() ='Reviews']").click();
		WebElement revw= driver.findElementByXPath("//div[contains(text(),'reviews')]");
		String text= revw.getText(); 
		System.out.println(text);
		
	}

}
