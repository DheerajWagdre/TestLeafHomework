package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseAndKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByLinkText("Droppable").click();
		
		WebElement Dragable = driver.findElementByLinkText("Drag me to my target");
		
		WebElement Dropable = driver.findElementByLinkText("Drop here");
		
		Actions dropable  =new Actions(driver);
		dropable.dragAndDrop(Dragable,Dropable).perform();
	}

}
