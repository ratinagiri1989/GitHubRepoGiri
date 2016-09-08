package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class W1H6GoogleMyName {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\21048\\Desktop\\Selenium\\Setup\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("gsfi")).sendKeys("ratinagiri");
		driver.findElement(By.className("sbico")).click();
		//Create list
		Thread.sleep(5000);
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		int i = links.size();
		System.out.println("No of links: "+i);
				
				
		for (WebElement names : links) {
			
			String str = names.getText();
//			System.out.println(names.getText());
						if(str.contains("ratinagiri")||str.contains("RATINAGIRI")||str.contains("Ratinagiri")||str.contains("Ratina Giri")){
								if(str.length()>50){
					System.out.println(str);
				}
						}
					}
				
	}
	}