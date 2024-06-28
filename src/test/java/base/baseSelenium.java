package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseSelenium {

	
	public static WebDriver driver;
	public  Properties prop = new Properties();
	public  FileReader fr;
	boolean eleStatus = false;
	
	
	@BeforeTest
	public void setUp() throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\meniv\\eclipse-automationWorkspace\\SalesForceTestCases\\src\\test\\resources\\configfiles\\config.properties");
		prop.load(fr);
		
		if (driver == null) {
			FileReader fr1 = new FileReader("C:\\Users\\meniv\\eclipse-automationWorkspace\\SalesForceTestCases\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr1);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Successfully launched browser");
//			driver.get(prop.getProperty("url"));
//			System.out.println("Successfully launched applicatio");
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Successfully launched browser");
//			driver.get(prop.getProperty("url"));
//			System.out.println("Successfully launched browser");
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Successfully launched browser");
//			driver.get(prop.getProperty("url"));
//			System.out.println("Successfully launched browser");
		}
	}
	
	@BeforeMethod
	public void launchSFApplication() {
		driver.get(prop.getProperty("url"));
		System.out.println("Successfully launched browser");
	}
	
	public String getUserName () {
		String username = prop.getProperty("userName");
		return username;
	}
	
	public String getPassword () {
		String password = prop.getProperty("password");
		return password;
	}
	
	
	
	public boolean VerifyElement(WebElement ele) {
		
		if(ele.isDisplayed()) {
			System.out.println(" Element is available");	
			eleStatus = true;
		}
		else {
			System.out.println(" Element is Not Available");
			eleStatus = false;
		}
		return eleStatus;
	}
	
	public boolean clearTextBox(WebElement ele) {
		
		if(ele.isDisplayed()) {
			ele.clear();
			System.out.println(ele.getText()+" Textbox is cleared");
		eleStatus = true;
		}
		else { 
			System.out.println("Issue in clearing the textbox "+ele.getText());
			eleStatus = false;
		}
		return eleStatus;
	}
	
	
	public boolean SendTextBoxInput(WebElement ele, String input) {
		
		if(ele.isDisplayed()) {
			ele.clear();
		ele.sendKeys(input);
		System.out.println(ele.getText()+" input is entered");
		eleStatus = true;
		}
		else { 
			System.out.println("Issue in entering input "+ele.getText());
			eleStatus = false;
		}
		return eleStatus;
	}
	
	public void clickButton(WebElement ele) {
		
			ele.click();
			System.out.println(ele.getText()+" button is clicked");
	
	}
	
	public void checkBox(WebElement ele) {
		ele.click();
		if (ele.isSelected()) {
			System.out.println(ele+" is selected");
		}
		else {
			System.out.println("Issue in loading "+ele);
		}
		
	}
	
	public void dropdown(WebElement ele, int input) {
		Select selector = new Select(ele);
		selector.selectByIndex(input);
		WebElement valueSelected = selector.getFirstSelectedOption();
		System.out.println(valueSelected);
		//valueSelected.getAttribute(input)
//		if (valueSelected.getText().equals(input)) {
//			System.out.println(ele+" is selected");
//		}
//		else {
//			System.out.println("Issue in loading "+ele);
//		}
		
	}
	 
	public void dissolve() {
		 driver.close();
		
	}
	
	public void implicitWaitTime() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void explicitWaitTime() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
	
	public void fluentWaitTime() {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	}
	
	//@AfterTest
	public void tearDown() {
		driver.quit();
	}
//	public static void main(String[] args) throws IOException {
//		baseSetup bs = new baseSetup();
//		bs.setUp();
//	}
//	

}
