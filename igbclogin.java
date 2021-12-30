package igbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class igbclogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","F://chromedriver_win32//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://igbc.in/igbc/showAccountRegistrationForm.htm?emailId=User+Email+Id&password=Password");
driver.findElement(By.id("salutaion1")).click();
driver.findElement(By.id("f name")).sendKeys("yelusuri");
driver.findElement(By.id("m name")).sendKeys("vinod");
driver.findElement(By.id("l name")).sendKeys("kumar");
driver.findElement(By.id("disp.name")).sendKeys("vinodkumar");





	}
 
}
