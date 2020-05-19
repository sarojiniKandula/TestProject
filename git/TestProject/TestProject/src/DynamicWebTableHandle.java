package src;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com//");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			driver.findElement(By.id("menu_admin_UserManagement")).click();
			driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
			List<WebElement> rows = driver.findElements(By.tagName("tr"));
			System.out.println(rows.size());
			int i=1;
			System.out.println(driver.findElement(By.xpath("//tr["+i+"]//td[5]")).getText());
			 String status = null;
			 int statusCount=0;	
			 for(i=1; i<rows.size();i++)
			 {
				status=driver.findElement(By.xpath("//tr["+i+"]//td[5]")).getText();
				System.out.println(status);
			 }
			 if(status.equals("Enabled"))
			 {
				 statusCount=statusCount+1;
			 }
			 System.out.println(statusCount);
						
	}
		 
	

}
