package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo1.opentaps.org");
		
		driver.manage().window().maximize();
	
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[@id='logout']/input").click();
		driver.close();
		
	}

}
