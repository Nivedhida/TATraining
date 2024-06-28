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

public class CreateOpty extends baseSalesForce{

	
	
	//@Test
	public void OptyDropdown () throws IOException, InterruptedException {
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		OptyLinkEle();
		ViewOptyDropDownEle();
	}
	
	//@Test
	public void CreateNewOpty () throws IOException, InterruptedException {
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		OptyLinkEle();
		Thread.sleep(5000);
		NewButtonEle(); 
		OptyNameTextEle();
		OptyAcctNameTextEle();
		OptyCloseDateEle();
		LeadSourceDropDownEle();
		StageDropDownEle();
		//PrimaryCampSourceTextEle();
		SaveOptyButtonEle();
		Thread.sleep(5000);
		OptyDetailHeaderEle();
		
		
	}
	
	//@Test
	public void PipelineReport () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		OptyLinkEle();
		Thread.sleep(5000);
		System.out.println("hi");
		PipelineLinkEle();
		Thread.sleep(10000);
		System.out.println("hi");
		PipelinePageHeaderEle();
		Thread.sleep(5000);
		System.out.println("hi");
	}
	
	@Test
	public void StuckOptyReport () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		OptyLinkEle();
		Thread.sleep(5000);
		
		StuckOptyLinkELe();
		Thread.sleep(10000);
		
		StuckOptyHeaderEle();
		Thread.sleep(5000);
		
	
	}
	
	public void SummaryReport () throws IOException, InterruptedException {
		
		fluentWaitTime();
		LoginPositive();
		PlusOptionMenuEle();
		Thread.sleep(5000);
		OptyLinkEle();
		Thread.sleep(5000);
		IntervalDropDownEle();
		IncludeDropDownEle();
		RunReportButtonEle();
		OptyReportPageHeader();
	
	}
	

	
	
	
	
	
}
