package automationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.gecko.driver","C:/IEDriverServer.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://gomemberqa.aptean.com/GmMaster502/Contents/ObjMaint.aspx?obj=Person&Form=Person_Maint&FormNew=Person_New");
driver.findElement(By.xpath("//input[@id='txtUserID']")).sendKeys("gombrs");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Aptean123*");
driver.findElement(By.xpath("//input[@title='Login']")).click();

driver.findElement(By.xpath("//input[@Id='LastName']")).sendKeys("testdata");
driver.findElement(By.xpath("//input[@Id='Address1']")).sendKeys("Sanramon");
driver.findElement(By.xpath("//input[@Id='City']")).sendKeys("Sanramon");
//WebElement option = driver.findElement(By.id("State"));

Select sel = new Select(driver.findElement(By.id("State")));
sel.selectByValue("CA");


	}


	
}
