package src;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabbedWindowHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> it = windowID.iterator();
		String windowName = it.next();
		System.out.println("First Window Name"+ windowName);
		driver.switchTo().window(windowName);
		System.out.println(driver.getCurrentUrl());
		String childWindowName = it.next();
		System.out.println("Second Window Name"+ childWindowName);
		driver.switchTo().window(childWindowName);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(windowName);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		

	}

}
