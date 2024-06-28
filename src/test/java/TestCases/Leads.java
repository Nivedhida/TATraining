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

public class Leads extends baseSalesForce{

	
	//@Test
	public void LeadsTab  () throws IOException, InterruptedException {
	
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		LeadsLinkEle();
		LeadsPageHeaderEle();

	
	}
	//@Test
	public void LeadsSelectView  () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		LeadsLinkEle();
		LeadsPageHeaderEle();
		LeadsDropDownEle();
		
	}
	//@Test
	public void LeadsDefaultView () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		LeadsLinkEle();
		LeadsPageHeaderEle();
		LeadsDropDownEle();
		int value = 1;
		dropdown(LeadsDropDownEle(), value);
		PlusOptionMenuEle();
		Thread.sleep(5000);
		LeadsLinkEle();
		LeadsPageHeaderEle();
		LeadsDropDownEle();
		//System.out.println(LeadsDropDo);
		
	}
	//@Test
	public void TodaysLeads  () throws IOException, InterruptedException {
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		LeadsLinkEle();
		LeadsPageHeaderEle();
		System.out.println("Hi");
		LeadsDropDownEle();
		int value = 3;
		System.out.println("Hi");
		dropdown(LeadsDropDownEle(), value);
		System.out.println("Hi");
		GoButtonEle();
		
	}
	@Test
	public void NewLead  () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		LeadsLinkEle();
		LeadsPageHeaderEle();

		NewLeadButtonEle();
		NewLeadPageHeaderEle();
		LastNameTextEle();
		CompNameTextEle();
		System.out.println("Hi");
		SaveLeadButtonEle(); 
		Thread.sleep(5000);
		LeadDetailHeaderEle();
		System.out.println("Hi");
		
		
	}
	
	
}
