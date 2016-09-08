package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
				
		driver.get("https://www.google.com/intl/en/mail/help/about.html");
		
		driver.findElementById("gmail-sign-in").click();
		driver.findElementByName("Email").sendKeys("giriselenium789");
		driver.findElementById("next").click();
		driver.findElementById("Passwd").sendKeys("mercurykiller");
		driver.findElementByXPath(".//*[@id='signIn']").click();
		driver.findElementByXPath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span").click();
		driver.findElementByXPath(".//*[@id='gb_71']").click();
		
		driver.close();
	}

}
