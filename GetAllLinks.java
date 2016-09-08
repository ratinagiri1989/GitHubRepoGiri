package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/#gfe_rd=cr&gws_rd=ssl");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List <WebElement>AllLinks=driver.findElementsByTagName("a");
		int i=0;
		for (WebElement links : AllLinks) {
			System.out.println(links.isDisplayed());
			System.out.println(links.getText());
			
			if (links.getText().contains("a")) {
				i=i+1;
				
				System.out.println("No.of Links contains a ="+i);
				
			}
			
		}
	}

}
