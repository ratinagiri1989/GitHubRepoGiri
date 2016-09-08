package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement Questions= driver.findElementById("userRegistrationForm:securityQ");
		Select dropdown=new Select(Questions);
		List <WebElement>option=dropdown.getOptions();
		dropdown.selectByIndex(option.size()-5);
		
		

	}

}
