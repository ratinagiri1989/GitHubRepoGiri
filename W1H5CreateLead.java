package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Verify;

import junit.framework.Assert;

public class W1H5CreateLead {

	public void createlead(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//launchbrowser();
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();        
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("ABCD Soft");
		driver.findElementById("createLeadForm_firstName").sendKeys("ratina");
		driver.findElementById("createLeadForm_lastName").sendKeys("giri");
		driver.findElementByClassName("smallSubmit").click();
		String Result=driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(Result);



	}

}
