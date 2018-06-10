package week4day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Medium {

	private static final int OFF = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses",Keys.ENTER);
		
		Set<String> set = new LinkedHashSet<String>();
		List<WebElement> links = driver.findElementsByClassName("product-brand");
		for (WebElement each : links) {
			
			set.add(each.getText());
		}
		System.out.println(set);
		List<WebElement> discount = driver.findElementsByClassName("product-discountPercentage");
		int count=0;
		for (WebElement each : discount) {
			if(each.equals("(40% OFF)")) {
		count++;
		}
		}
		System.out.println(count);

//driver.findElementByClassName("brand-more").click();
		//driver.findElementByXPath("//ul[@class='FilterDirectory-list']/following::li/label/input");
		
		
		//WebElement brandName = driver.findElementByClassName("brand-list");
	}
	

}
