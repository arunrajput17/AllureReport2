package allureReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


@Listeners({AllureListener.class})
public class Tests extends BaseClass{
	
	
public WebDriver driver;
	
	@BeforeClass 
	public void setUp() {
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
		driver.get("https://demo.nopcommerce.com/");
		
	}
	
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=1, description="Verify Logo presence on Home Page")
	@Description("Verify Logo presence on Home Page........")
	@Epic("EP001")
	@Feature("Feature1: Logo")
	@Story("Story:Logo Presence")
	@Step("Verify logo Presence")
	public void logoPresence() throws InterruptedException
	{
		boolean dispStatus=driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
		Assert.assertEquals(dispStatus, true);
	}
	
	@Severity(SeverityLevel.BLOCKER)	
	@Test(priority=2, description="Verify login")
	@Description("Verify login with Valid Credentials........")
	@Epic("EP001")
	@Feature("Feature2: Login")
	@Story("Story:Valid login")
	@Step("Verify login")
	public void loginTest() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("pavanoltraining@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store123");

	}
		
	@Severity(SeverityLevel.NORMAL)	
	@Test(priority=3, description="Verify user Registration")
	@Description("Verify user Registration........")
	@Epic("EP001")
	@Feature("Feature3: Registration")
	@Story("Story:User registration")
	
	public void registrationTest()
	{
		throw new SkipException("Skipping this Test");
	}
	

	@AfterClass
	public void tearDown()
	{	
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//This below code used before BaseClass 
////	WebDriver driver;
//	
//	//After base class
//	public WebDriver driver;
//	
//	@BeforeClass
//	public void setUp()
//	{
//		BaseClass bs = new BaseClass();
//		bs.initialize_driver();
//		System.out.println("intialized");
//		
//		driver.get("http://demo.nopcommerce.com/");
//		System.out.println("site open");
//	}
//	
//	
//	
//	// This below code used before BaseClass now moved to BaseClass
////	@BeforeClass
////	public void setUp()
////	{
////		
////		// Using WebDriverManager for defining browser to be used
////		WebDriverManager.chromedriver().setup();
//////		WebDriverManager.firefoxdriver().setup();
//////		WebDriverManager.edgedriver().setup();
//////		WebDriverManager.operadriver().setup();
//////		WebDriverManager.phantomjs().setup();
//////		WebDriverManager.iedriver().setup();
//////		WebDriverManager.chromiumdriver().setup();
////		
////		
////		//To use particular version of browser only
//////		WebDriverManager.chromedriver().browserVersion("85.0.4183.87").setup();
////		
////
////		
////		//To get the current version of driver
////		System.out.println("Current version of chrome is : "+WebDriverManager.chromedriver().getDownloadedDriverVersion());
////		
////
////		
//////		System.setProperty("webdriver.chrome.driver", "D:\\Day Shift\\Selenium_Prequisites\\WebDrivers\\chromedriver.exe");
////		driver = new ChromeDriver();
//////		driver = new FirefoxDriver();
////		
////		
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////		driver.get("http://demo.nopcommerce.com/");
////		
////	}
////	
//	
//	@Test(priority=1, description="Verify Logo presence on Home Page TestNG annotation")
//	@Description("Verify Logo presence on Home Page Allure annotation.......")	//Allure annotation
//	@Epic("EP001")	//Allure annotation
//	@Feature("Feature1: Logo")	//Allure annotation
//	@Story("Story: Logo Presence")	//Allure annotation
//	@Step("Step to Verify logo presence")	//Allure annotation
//	@Severity(SeverityLevel.MINOR)	//Allure annotation
//	public void logoPresence()
//	{
//		Boolean status = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
//		Assert.assertTrue(status);
//	}
//	
//	
//	@Test(priority=2)
//	@Description("Verify Login Allure annotation.......")	//Allure annotation
//	@Epic("EP001")	//Allure annotation
//	@Feature("Feature2: Login")	//Allure annotation
//	@Story("Story: Valid Login")	//Allure annotation
//	@Step("Step to Verify login")	//Allure annotation
//	@Severity(SeverityLevel.BLOCKER)	//Allure annotation
//	public void loginTest()
//	{
//		
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("Jamie");
//		driver.findElement(By.id("Password")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//		
//		Assert.assertEquals(driver.getTitle(), "noCommerce demo store");
//		
//	}
//	
//	
//	@Test(priority=3, description="Verify Registration form TestNG Test")
//	@Description("Verify Registration form annotation.......")	//Allure annotation
//	@Epic("EP001")	//Allure annotation
//	@Feature("Feature3: Registration")	//Allure annotation
//	@Story("Story: User Registration")	//Allure annotation
//	@Step("Step to Registration Process")	//Allure annotation
//	@Severity(SeverityLevel.NORMAL)	//Allure annotation
//	public void registrationTest()
//	{
//		
//		throw new SkipException("Skipping this test");
//				
//	}
//	
//	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}

	

}
