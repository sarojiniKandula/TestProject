package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadPropertiesFile {
	
    static WebDriver driver;
	public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
    FileInputStream fis=new FileInputStream("C:\\Users\\kandu\\git\\TestProject\\TestProject\\src\\config.properties");
    prop.load(fis);
    String url=prop.getProperty("URL");
    System.out.println(url);
    System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
    driver.findElement(By.name(prop.getProperty("firstname_name"))).sendKeys(prop.getProperty("firstName"));
    driver.findElement(By.name(prop.getProperty("lastname_name"))).sendKeys(prop.getProperty("lastName"));
    driver.findElement(By.id(prop.getProperty("address_id"))).sendKeys(prop.getProperty("address1"));
    driver.findElement(By.id(prop.getProperty("address2_id"))).sendKeys(prop.getProperty("address2"));
    driver.findElement(By.name(prop.getProperty("city_id"))).sendKeys(prop.getProperty("city"));
    Select state=new Select(driver.findElement(By.id(prop.getProperty("state_id"))));
    state.selectByVisibleText("California");
    driver.findElement(By.id(prop.getProperty("zip_id"))).sendKeys(prop.getProperty("zip"));
    driver.findElement(By.id(prop.getProperty("dayphone1_id"))).sendKeys(prop.getProperty("dayphone1"));
    driver.findElement(By.id(prop.getProperty("dayphone2_id"))).sendKeys(prop.getProperty("dayphone2"));
    driver.findElement(By.id(prop.getProperty("dayphone3_id"))).sendKeys(prop.getProperty("dayphone3"));
    driver.findElement(By.id(prop.getProperty("email.id"))).sendKeys(prop.getProperty("email"));
    driver.findElement(By.name(prop.getProperty("retype_email.name"))).sendKeys(prop.getProperty("retypeEmail"));
    driver.findElement(By.id(prop.getProperty("userid.id"))).sendKeys(prop.getProperty("userId"));
    driver.findElement(By.id(prop.getProperty("password.id"))).sendKeys(prop.getProperty("password"));
    driver.findElement(By.id(prop.getProperty("rpass.id"))).sendKeys(prop.getProperty("rpass"));
    Select state1=new Select(driver.findElement(By.id(prop.getProperty("secQuetion.id"))));
    state1.selectByValue("2");
    driver.findElement(By.xpath(prop.getProperty("answer.xpath"))).sendKeys("answer");
    Select month=new Select(driver.findElement(By.id(prop.getProperty("month.id"))));
    month.selectByValue("2");
    Select day=new Select(driver.findElement(By.id(prop.getProperty("day.id"))));
    day.selectByValue("20");
    Select year=new Select(driver.findElement(By.id(prop.getProperty("year.id"))));
    year.selectByValue("1999");
    driver.findElement(By.xpath(prop.getProperty("checkbox.xpath"))).click();
    driver.findElement(By.xpath(prop.getProperty("btn.xpath"))).click();
  
   
	}

}
