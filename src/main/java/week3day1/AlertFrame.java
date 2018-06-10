package week3day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		//driver.findElementByLinkText("Try it").click();
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Balaji");
		driver.switchTo().alert().accept();
	String text = driver.findElementById("demo").getText();
	System.out.println(text);
	if(text.contains("Balaji"))
	{
	System.out.println("text matched");	

	}
	else
	{
	System.out.println("text doesnt match");	
	}
	}

}