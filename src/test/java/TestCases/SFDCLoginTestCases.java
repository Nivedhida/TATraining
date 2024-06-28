package TestCases;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseSalesForce;
import base.baseSelenium;

public class SFDCLoginTestCases extends baseSalesForce {

	//@Test
	public void loginErrorMeesage1() throws InterruptedException {
	
	fluentWaitTime();
		
	// Verifying Elements in login page	
	logoEle();
	userNameEle();
	passwordEle();
	loginEle();
		
	//Step 2: 
	SendTextBoxInput(userNameEle(), getUserName());
	
	//Step 3:
	clearTextBox(passwordEle());
	Thread.sleep(5000);
	
	//Step 4:
	loginEle().click();
	Thread.sleep(5000);
	//Step 5:
	passErrorEle();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String errorMsg = passErrorEle().getText();
	String actualErrorMsg = "Please enter your password.";
	System.out.println(errorMsg);
	System.out.println(actualErrorMsg);
	if(errorMsg.equals(actualErrorMsg)) {
		System.out.println(actualErrorMsg+" Message is Displayed");
		System.out.println("TestCase PASSED");
	}
	else {
		System.out.println("TestCase FAILED");
	}
	
	}
	
	
	//@Test
	public void loginToSalesForce2(){
	
		fluentWaitTime();
		
		// Verifying Elements in login page	
		logoEle();
		userNameEle();
		passwordEle();
		loginEle();
		
		//Step 2: 
		SendTextBoxInput(userNameEle(), getUserName());
		SendTextBoxInput(passwordEle(), getPassword());
		
		loginEle().click();
		
		homeLogoEle();
		userNavButtonEle();	
		
	}
	
	//@Test
	public void CheckRemeberMe3() throws InterruptedException {
		//Step 1:	
		fluentWaitTime();
		
		// Verifying Elements in login page	
		logoEle();
		userNameEle();
		passwordEle();
		loginEle();
		
		//Step 2: 
		SendTextBoxInput(userNameEle(), getUserName());
		SendTextBoxInput(passwordEle(), getPassword());
		
		
		rememberMeEle().click();
		
		checkBox(rememberMeEle());
		
		
		loginEle().click();
		
		Thread.sleep(5000);
		homeLogoEle();
		Thread.sleep(5000);
		System.out.println("Hi");
		userNavButtonEle().click();

		logoutEle().click();
		Thread.sleep(5000);
		userNameTextValEle();
		
		String retainedUN = userNameTextValEle().getText();
		String actualUN = prop.getProperty("userName");
		
		if(retainedUN.equals(actualUN)) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case FAILED");
		}
	}
	
	//@Test
	public void testForgotPassword () throws InterruptedException{
		
		//Step 1:	
				fluentWaitTime();
				
				// Verifying Elements in login page	
				logoEle();
				userNameEle();
				passwordEle();
				
				forgotPassEle().click();
				
				
				forgotPassHeaderEle();
				
				forgotPassUNEle().sendKeys(prop.getProperty("userName"));
				
				
				forgotPassConButtonEle().click();
				
				forgotPassConfirmPageEle();
				confirmTextEle();
				
				String forgotPassText = "We’ve sent you an email with a link to finish resetting your password.";
				String actualText = confirmTextEle().getText();

				if (forgotPassText.equals(actualText)) {
					System.out.println("password reset link is sent to the registered email");
					System.out.println("TestCase PASSED");
				}
				else {
					System.out.println("TestCase FAILED");
				}
		
	}
	
	@Test
	public void validateLoginErrorMessage() {
		
		fluentWaitTime();
		
		// Verifying Elements in login page	
		logoEle();
		SendTextBoxInput(userNameEle(), prop.getProperty("userName"));
		SendTextBoxInput(passwordEle(), "asdfgh");
		loginEle().click();
		loginErrorEle();
		
		String actualErrorText = loginErrorEle().getText();
		String loginErrorText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

		if(loginErrorText.equals(actualErrorText)) {
			System.out.println(actualErrorText+" Message is Displayed");
			System.out.println("TestCase PASSED");
		}
		else {
			System.out.println("TestCase FAILED");
		}


	}
	

//	public static void main(String[] args) {
//		
//		System.out.println("Hi");
//	}

}
