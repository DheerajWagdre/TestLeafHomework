package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allwindowHandles = driver.getWindowHandles();
		int size = allwindowHandles.size();
		System.out.println(size);
		List<String> listWindow  = new ArrayList<String>();
		listWindow.addAll(allwindowHandles);
		String SecWind = listWindow.get(1);
		driver.switchTo().window(SecWind);
		String currentUrlSec = driver.getCurrentUrl();
		System.out.println(currentUrlSec);
	/*	driver.close();
		String PWind = listWindow.get(0);
		driver.switchTo().window(PWind);*/
		driver.quit();

	}

}
