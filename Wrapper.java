package week1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Wrapper {

	RemoteWebDriver driver;
	public void launchBrowser(String browser, String Url){
		try{
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		catch(WebDriverException e){
			
			System.out.println("Browser not opened");
		}
		finally{
			snapshot();		
			
		}
		
}
	public void snapshot(){
		File snap = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(snap, new File("./images/giri.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}