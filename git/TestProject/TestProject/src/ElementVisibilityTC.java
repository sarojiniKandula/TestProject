package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2934&ru=");
		boolean b1=driver.findElement(By.className("btn")).isDisplayed();
		System.out.println(b1);
		boolean b2=driver.findElement(By.className("btn")).isEnabled();
		System.out.println(b2);
		boolean b3=driver.findElement(By.name("acceptq1")).isSelected();
		System.out.println(b3);
		
		
		
		
		
		

	}

}
