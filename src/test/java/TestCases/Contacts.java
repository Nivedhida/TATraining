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

import base.baseSalesForce;
public class Contacts extends baseSalesForce{
	//@Test
	public void CreateNewContact  () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		ContactsLinkEle();
		ContactNewButtonEle();
		ConLastNameTextEle();
		ConAcctNameTextEle();
		ConSaveButtonEle();
		ContactDetailHeaderEle();
		
	}
	
	//@Test
	public void CreateNewView  () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		ContactsLinkEle();
		ConCreateNewViewLinkEle();
		ConCreateNewViewHeaderEle();
		ConViewNameTextEle();
		ConViewUniqNameTextEle();
		ConViewSaveButtonEle();
		
	}
	
	//@Test
	public void RecentlyCreatedContact  () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		ContactsLinkEle();
		ConRecentlyCreatedDropDownEle();
		
		
	}
	//@Test
	public void MyContactsView  () throws IOException, InterruptedException {
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		ContactsLinkEle();
		Thread.sleep(5000);
		MyContactsDropDownEle();
		Thread.sleep(5000);
		System.out.println("Hi");
	}
	
	//@Test
	public void ViewAContact  () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		ContactsLinkEle();
		Thread.sleep(5000);
		ContactNameLinkEle();
	}
	//@Test
	public void ErrorMessage  () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		ContactsLinkEle();
		ConCreateNewViewLinkEle();
		ConCreateNewViewHeaderEle();
		//ConViewNameTextEle();
		ConViewUniqNameTextEle();
		ConViewSaveButtonEle();
		ViewErrorEle();
	}
//	@Test
	public void CancelButton  () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		ContactsLinkEle();
		ConCreateNewViewLinkEle();
		ConCreateNewViewHeaderEle();
		ConViewNameTextEle();
		ConViewUniqNameTextEle();
		ViewCancelButtonEle();
		
	}
	
	@Test
	public void SaveAndNewButton  () throws IOException, InterruptedException {
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		ContactsLinkEle();
		ContactNewButtonEle();
		ConLastNameTextEle();
		ConAcctNameTextEle();
		ConSaveandNewButtonEle();
		ContactDetailHeaderEle();
		ConNewContactHeaderEle();
	}
	
	
	

	

}
