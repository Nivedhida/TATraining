package TestCases;


import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui; 


import base.baseSalesForce;
import base.baseSelenium;

public class UserMenuDropDown extends baseSalesForce {
	
	//@Test
	public void userMenuDropdown() throws IOException, InterruptedException {
		LoginPositive();
		userNavButtonEle().click();
		fluentWaitTime();
		MyProfileEle();
		MySettingsEle();
		DeveloperConsoleEle();
		SwitchToLightEle();
		
	}
	//@Test
	public void myProfile() throws IOException, InterruptedException {
		fluentWaitTime();
		LoginPositive();
		userNavButtonEle().click();
		MyProfileEle().click();
		
		MyProfileHeaderEle();
		
//		EditImgButtonEle().click();
//		EditProfileHeaderEle();
		
		//Alert alert = driver.switchTo().alert();
		//System.out.println(driver.switchTo().frame(1).getTitle());
		
//		AboutTabEle().click();
//		SendTextBoxInput(AboutTabLastNameEle(), prop.getProperty("lastName"));
//		SaveAllButtonEle().click();

		

		PostTextAreaEle().click();
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		TextAreaEle().sendKeys("new textarea");
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		ShareButtonEle().click();
		System.out.println("hi clicked");
		
		WebElement fileele = driver.findElement(By.xpath("//span[@class='publisherattachtext ']/parent::a[@title='File' and @href='javascript:void(0);']"));
		if(fileele.isDisplayed()) {
			System.out.println("file element is available");
			fileele.click();
			Thread.sleep(5000);
		}
		fileele.click();
	//	FileTabEle().click();
	UploadFileFromCompEle().click();
	Thread.sleep(5000);
	WebElement chooseele = driver.findElement(By.id("chatterFile"));
	if(chooseele.isDisplayed()) {
		System.out.println("choose file is available");
		Thread.sleep(5000);
		chooseele.click();
		Thread.sleep(5000);
		chooseele.click();
	}
		//ChooseFileButtonEle().click();
		
		
	}
	
	//@Test
	public void mysettings() throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		userNavButtonEle().click();
		MySettingsEle().click();
		MySettingsHeaderEle();
		PersonalMenuEle().click();
		LoginHistoryMenuEle().click();;
		LoginHistoryHeaderEle();
		LoginHistoryDownloadEle();
		
		
//		 DisplayLayoutMenuEle().click();
//		 CustomMyTabMenuEle().click();
//		 CutomTabHeaderEle();
//		 CustomAppDropDownEle();
//		 Select select = new Select(CustomAppDropDownEle());
//		 select.selectByVisibleText("Salesforce Chatter");
//		 AvailableTabEle();
//		 Select select1 = new Select(AvailableTabEle());
//		 select1.selectByVisibleText("Reports");
//		 Thread.sleep(5000);
//		 AddArrowButtonEle().click();
//		 Thread.sleep(5000);
//		 SaveTabsButtonEle().click();
//		// ReportsTabEle();
		 
		 EmailMenuEle().click();
		 MyEmailSettingMenuEle().click();
		 EmailSettingHeaderEle();
		 Thread.sleep(5000);
		 EmailNameInputEle();
		 Thread.sleep(5000);
		 EmailIdInputEle();
		 Thread.sleep(5000);
		 AutoBCCRadioEle();
		 Thread.sleep(5000);
		 SaveEmailButtonEle();
		 Thread.sleep(5000);
		 ConfirmEmailMessageEle();
		Thread.sleep(5000);
	}
	
	@Test
	public void developersConsole() throws InterruptedException, IOException {
	
		LoginPositive();
		userNavButtonEle().click();
		fluentWaitTime();
		String currentWin = driver.getWindowHandle();
		DeveloperConsoleEle().click();
		Thread.sleep(5000);
		Set<String> wh = driver.getWindowHandles();
		//String child = wh(1);
	//	driver.switchTo().window(child);		
		driver.close();
		
	}
	
	
	public void logout() {
		Logout();
	}
	
	
}


		





