package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class W1H4Irctcuntilcaptcha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\21048\\Desktop\\Selenium\\Setup\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("userRegistrationForm:userName").sendKeys("ratina");
		driver.findElementById("userRegistrationForm:password").sendKeys("Hexaware");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Hexaware");
		WebElement SQA=driver.findElementById("userRegistrationForm:securityQ");
		Select dropdown=new Select(SQA);
		List <WebElement>SQAs=dropdown.getOptions();
		dropdown.selectByIndex(SQAs.size()-1);
		driver.findElementByName("userRegistrationForm:securityAnswer").sendKeys("Madurai");
		WebElement Lang=driver.findElementById("userRegistrationForm:prelan");
		Select dropdown2=new Select(Lang);
		List <WebElement>Langs=dropdown2.getOptions();
		dropdown2.selectByIndex(Langs.size()-2);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Ratinagiri");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Rhamachandran");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement DOB=driver.findElementById("userRegistrationForm:dobDay");
		Select dropdown3=new Select(DOB);
		dropdown3.selectByVisibleText("07");
		WebElement MOB=driver.findElementById("userRegistrationForm:dobMonth");
		Select dropdown4=new Select(MOB);
		dropdown4.selectByVisibleText("MAY");
		WebElement YOB=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropdown5=new Select(YOB);
		dropdown5.selectByVisibleText("1989");
		driver.findElementById("userRegistrationForm:email").sendKeys("giriselenium789@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9894658789");
		WebElement Nation=driver.findElementById("userRegistrationForm:nationalityId");
		Select dropdown6=new Select(Nation);
		dropdown6.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("BBH Medavakkam");
		WebElement Country=driver.findElementById("userRegistrationForm:countries");
		Select dropdown7=new Select(Country);
		dropdown7.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("625002",Keys.TAB);
		Thread.sleep(5000);
		//driver.findElementByName("userRegistrationForm:statesName").sendKeys("TAMIL NADU");
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Madurai");
		Thread.sleep(5000);
		WebElement PO =driver.findElementById("userRegistrationForm:postofficeName");
		Select dropdown8=new Select(PO);
		dropdown8.selectByVisibleText("Tallakulam H.O");
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:landline").sendKeys("9894658789");
		
		}
		
		
		

		}
		
		

	


