package src;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String>  it = handler.iterator();
		String parentWindow=it.next();
		System.out.println("Parent window id:"+ parentWindow);
		System.out.println("Parent window id Title:"+driver.getTitle());
		String childWindow=it.next();
		System.out.println("child window id:"+ childWindow);
		driver.switchTo().window(childWindow);
		System.out.println("child window id Title:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window id Title:"+driver.getTitle());

	}

}
