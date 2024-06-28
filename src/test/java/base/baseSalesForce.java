package base;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

public class baseSalesForce extends baseSelenium{

	baseSelenium bs = new baseSelenium();
	
	
/*===========================================Sales Force Login==========================================================================*/	
	
	public void LoginPositive() throws IOException, InterruptedException {
		
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
		Thread.sleep(5000);
		homeLogoEle();
		userNavButtonEle();		
		
	}
	
	public void Logout() {
		
		userNavButtonEle().click();
		logoutEle().click();
		logoEle();
	}
	
	
	public WebElement logoEle() {
		String logo = prop.getProperty("logoele");
		System.out.println(logo);
		WebElement logoEle = driver.findElement(By.xpath(logo));
		VerifyElement(logoEle);
		return logoEle;
	}
	
	public WebElement userNameEle() {
		WebElement userNameEle = driver.findElement(By.xpath(prop.getProperty("userNameEle")));
		VerifyElement(userNameEle);
		return userNameEle;
	}
	
	public WebElement passwordEle() {
		WebElement passwordEle = driver.findElement(By.xpath(prop.getProperty("passwordEle")));
		VerifyElement(passwordEle);
		return passwordEle;
	}
	
	public WebElement loginEle() {
		WebElement loginEle = driver.findElement(By.xpath(prop.getProperty("loginEle")));
		VerifyElement(loginEle);
		return loginEle;
	}
	
	public WebElement rememberMeEle() {
		
		WebElement rememberMeEle = driver.findElement(By.xpath(prop.getProperty("rememberMeEle")));
		VerifyElement(rememberMeEle);
		return rememberMeEle;
	}
		
	
	
	public WebElement passErrorEle() {
		WebElement passErrorEle = driver.findElement(By.xpath(prop.getProperty("passErrorEle")));
		//bs.VerifyElement(passErrorEle);
		return passErrorEle;
	}
	
	public WebElement loginErrorEle() {
		WebElement loginErrorEle = driver.findElement(By.xpath(prop.getProperty("loginErrorEle")));
		VerifyElement(loginErrorEle);
		return loginErrorEle;
	}
	
	
	public WebElement homeLogoEle() {
		WebElement homeLogoEle = driver.findElement(By.xpath(prop.getProperty("homeLogoEle")));
		VerifyElement(homeLogoEle);
		return homeLogoEle;

	}
	
	public WebElement userNavButtonEle() {
		WebElement userNavButtonEle = driver.findElement(By.xpath(prop.getProperty("userNavButtonEle")));
		VerifyElement(userNavButtonEle);
		return userNavButtonEle;

	}
	
	public WebElement logoutEle() {
		WebElement logoutEle = driver.findElement(By.xpath(prop.getProperty("logoutEle")));
		VerifyElement(logoutEle);
		return logoutEle;
	
	}
	
	public WebElement userNameTextValEle() {
		WebElement userNameTextValEle = driver.findElement(By.xpath(prop.getProperty("userNameTextVal")));
		VerifyElement(userNameTextValEle);
		return userNameTextValEle;
	}
	
	public WebElement forgotPassEle() {
		WebElement forgotPassEle = driver.findElement(By.xpath(prop.getProperty("forgotPassEle")));
		VerifyElement(forgotPassEle);
		return forgotPassEle;
	}
	
	public WebElement forgotPassHeaderEle() {
		WebElement forgotPassHeaderEle = driver.findElement(By.xpath(prop.getProperty("forgotPassHeaderEle")));
		VerifyElement(forgotPassHeaderEle);
		return forgotPassHeaderEle;
	}
	
	public WebElement forgotPassUNEle() {
		WebElement forgotPassUNEle = driver.findElement(By.xpath(prop.getProperty("forgotPassUNEle")));
		VerifyElement(forgotPassUNEle);
		return forgotPassUNEle;
	}
	
	public WebElement forgotPassConButtonEle() {
		WebElement forgotPassConButtonEle = driver.findElement(By.xpath(prop.getProperty("forgotPassConButtonEle")));
		VerifyElement(forgotPassConButtonEle);
		return forgotPassConButtonEle;
	}
	
	public WebElement forgotPassConfirmPageEle() {
		WebElement forgotPassConfirmPageEle = driver.findElement(By.xpath(prop.getProperty("forgotPassConfirmPageEle")));
		VerifyElement(forgotPassConfirmPageEle);
		return forgotPassConfirmPageEle;
	}
	
	public WebElement confirmTextEle() {
		WebElement confirmTextEle = driver.findElement(By.xpath(prop.getProperty("confirmTextEle")));
		VerifyElement(confirmTextEle);
		return confirmTextEle;
	}
	
/*=========================================== User Menu Drop Down =========================================================================*/
	
    
	public WebElement MyProfileEle() {
		WebElement MyProfileEle = driver.findElement(By.xpath(prop.getProperty("MyProfileEle")));
		VerifyElement(MyProfileEle);
		return MyProfileEle;
	}
	
	public WebElement MySettingsEle() {
		WebElement MySettingsEle = driver.findElement(By.xpath(prop.getProperty("MySettingsEle")));
		VerifyElement(MySettingsEle);
		return MySettingsEle;
	}
	
	public WebElement DeveloperConsoleEle() {
		WebElement DeveloperConsoleEle = driver.findElement(By.xpath(prop.getProperty("DeveloperConsoleEle")));
		VerifyElement(DeveloperConsoleEle);
		return DeveloperConsoleEle;
	}
	
	public WebElement SwitchToLightEle() {
		WebElement SwitchToLightEle = driver.findElement(By.xpath(prop.getProperty("SwitchToLightEle")));
		VerifyElement(SwitchToLightEle);
		return SwitchToLightEle;
	}
	
//--------------My Profile
	
	public WebElement MyProfileHeaderEle() {
		WebElement MyProfileHeaderEle = driver.findElement(By.xpath(prop.getProperty("MyProfileHeaderEle")));
		VerifyElement(MyProfileHeaderEle);
		return MyProfileHeaderEle;
	}
	
	public WebElement EditImgButtonEle() {
		WebElement EditImgButtonEle = driver.findElement(By.xpath(prop.getProperty("EditImgButtonEle")));
		VerifyElement(EditImgButtonEle);
		return EditImgButtonEle;
	}
	
	public WebElement EditProfileHeaderEle() {
		WebElement EditProfileHeaderEle = driver.findElement(By.xpath(prop.getProperty("EditProfileHeaderEle")));
		VerifyElement(EditProfileHeaderEle);
		return EditProfileHeaderEle;
	}
	
	public WebElement AboutTabEle() {
		WebElement AboutTabEle = driver.findElement(By.xpath(prop.getProperty("AboutTabEle")));
		VerifyElement(AboutTabEle);
		return AboutTabEle;
	}
	
	public WebElement AboutTabLastNameEle() {
		WebElement AboutTabLastNameEle = driver.findElement(By.xpath(prop.getProperty("AboutTabLastNameEle")));
		VerifyElement(AboutTabLastNameEle);
		return AboutTabLastNameEle;
	}
	
	public WebElement SaveAllButtonEle() {
		WebElement SaveAllButtonEle = driver.findElement(By.xpath(prop.getProperty("SaveAllButtonEle")));
		VerifyElement(SaveAllButtonEle);
		return SaveAllButtonEle;
	}	
	
	public WebElement LastNameMyProfilePageEle() {
		WebElement LastNameMyProfilePageEle = driver.findElement(By.xpath(prop.getProperty("LastNameMyProfilePageEle")));
		VerifyElement(LastNameMyProfilePageEle);
		return LastNameMyProfilePageEle;
	}
		
	public WebElement PostTextAreaEle() {
		WebElement PostTextAreaEle = driver.findElement(By.xpath(prop.getProperty("PostTextAreaEle")));
		VerifyElement(PostTextAreaEle);
		return PostTextAreaEle;
	}
	
	public WebElement TextAreaEle() {
		WebElement TextAreaEle = driver.findElement(By.xpath(prop.getProperty("TextAreaEle")));
		VerifyElement(TextAreaEle);
		return TextAreaEle;
	}
		
	public WebElement ShareButtonEle() {
		WebElement ShareButtonEle = driver.findElement(By.xpath(prop.getProperty("ShareButtonEle")));
		VerifyElement(ShareButtonEle);
		return ShareButtonEle;
	}
	
	public WebElement FileTabEle() {
		WebElement FileTabEle = driver.findElement(By.xpath(prop.getProperty("FileTabEle")));
		VerifyElement(FileTabEle);
		return FileTabEle;
	}
	
	public WebElement UploadFileFromCompEle() {
		WebElement UploadFileFromCompEle = driver.findElement(By.xpath(prop.getProperty("UploadFileFromCompEle")));
		VerifyElement(UploadFileFromCompEle);
		return UploadFileFromCompEle;
	}
	
	public WebElement ChooseFileButtonEle() {
		WebElement ChooseFileButtonEle = driver.findElement(By.xpath(prop.getProperty("ChooseFileButtonEle")));
		VerifyElement(ChooseFileButtonEle);
		return ChooseFileButtonEle;
	}
//----------My Settings	
	public WebElement MySettingsHeaderEle() {
		WebElement MySettingsHeaderEle = driver.findElement(By.xpath(prop.getProperty("MySettingsHeaderEle")));
		VerifyElement(MySettingsHeaderEle);
		return MySettingsHeaderEle;
	}
	public WebElement PersonalMenuEle() {
		WebElement PersonalMenuEle = driver.findElement(By.xpath(prop.getProperty("PersonalMenuEle")));
		VerifyElement(PersonalMenuEle);
		return PersonalMenuEle;
	}
	public WebElement LoginHistoryMenuEle() {
		WebElement LoginHistoryMenuEle = driver.findElement(By.xpath(prop.getProperty("LoginHistoryMenuEle")));
		VerifyElement(LoginHistoryMenuEle);
		return LoginHistoryMenuEle;
	}
	public WebElement LoginHistoryHeaderEle() {
		WebElement LoginHistoryHeaderEle = driver.findElement(By.xpath(prop.getProperty("LoginHistoryHeaderEle")));
		VerifyElement(LoginHistoryHeaderEle);
		return LoginHistoryHeaderEle;
	}
	public WebElement LoginHistoryDownloadEle() {
		WebElement LoginHistoryDownloadEle = driver.findElement(By.xpath(prop.getProperty("LoginHistoryDownloadEle")));
		VerifyElement(LoginHistoryDownloadEle);
		return LoginHistoryDownloadEle;
	}
	
	public WebElement DisplayLayoutMenuEle() {
		WebElement DisplayLayoutMenuEle = driver.findElement(By.xpath(prop.getProperty("DisplayLayoutMenuEle")));
		VerifyElement(DisplayLayoutMenuEle);
		return DisplayLayoutMenuEle;
	}
		
	public WebElement CustomMyTabMenuEle() {
		WebElement CustomMyTabMenuEle = driver.findElement(By.xpath(prop.getProperty("CustomMyTabMenuEle")));
		VerifyElement(CustomMyTabMenuEle);
		return CustomMyTabMenuEle;
	}
	
	public WebElement CutomTabHeaderEle() {
		WebElement CutomTabHeaderEle = driver.findElement(By.xpath(prop.getProperty("CutomTabHeaderEle")));
		VerifyElement(CutomTabHeaderEle);
		return CutomTabHeaderEle;
	}
	public WebElement CustomAppDropDownEle() {
		WebElement CustomAppDropDownEle = driver.findElement(By.xpath(prop.getProperty("CustomAppDropDownEle")));
		VerifyElement(CustomAppDropDownEle);
		return CustomAppDropDownEle;
	}
	public WebElement AvailableTabEle() {
		WebElement AvailableTabEle = driver.findElement(By.xpath(prop.getProperty("AvailableTabEle")));
		VerifyElement(AvailableTabEle);
		return AvailableTabEle;
	}
	public WebElement ReportsOptionEle() {
		WebElement ReportsOptionEle = driver.findElement(By.xpath(prop.getProperty("ReportsOptionEle")));
		VerifyElement(ReportsOptionEle);
		return ReportsOptionEle;
	}
	public WebElement AddArrowButtonEle() {
		WebElement AddArrowButtonEle = driver.findElement(By.xpath(prop.getProperty("AddArrowButtonEle")));
		VerifyElement(AddArrowButtonEle);
		return AddArrowButtonEle;
	}
	public WebElement SaveTabsButtonEle() {
		WebElement SaveTabsButtonEle = driver.findElement(By.xpath(prop.getProperty("SaveTabsButtonEle")));
		VerifyElement(SaveTabsButtonEle);
		return SaveTabsButtonEle;
	}
	public WebElement ReportsTabEle() {
		WebElement ReportsTabEle = driver.findElement(By.xpath(prop.getProperty("ReportsTabEle")));
		VerifyElement(ReportsTabEle);
		return ReportsTabEle;
	}
	
//-------Email Tab
	public WebElement EmailMenuEle() {
		WebElement EmailMenuEle = driver.findElement(By.xpath(prop.getProperty("EmailMenuEle")));
		VerifyElement(EmailMenuEle);
		return EmailMenuEle;
	}
	public WebElement MyEmailSettingMenuEle() {
		WebElement MyEmailSettingMenuEle = driver.findElement(By.xpath(prop.getProperty("MyEmailSettingMenuEle")));
		VerifyElement(MyEmailSettingMenuEle);
		return MyEmailSettingMenuEle;
	}
	public WebElement EmailSettingHeaderEle() {
		WebElement EmailSettingHeaderEle = driver.findElement(By.xpath(prop.getProperty("EmailSettingHeaderEle")));
		VerifyElement(EmailSettingHeaderEle);
		return EmailSettingHeaderEle;
	}
	public WebElement EmailNameInputEle() {
		WebElement EmailNameInputEle = driver.findElement(By.xpath(prop.getProperty("EmailNameInputEle")));
		VerifyElement(EmailNameInputEle);
		EmailNameInputEle.clear();
		EmailNameInputEle.sendKeys("Nivedhida");
		return EmailNameInputEle;
	}
	public WebElement EmailIdInputEle() {
		WebElement EmailIdInputEle = driver.findElement(By.xpath(prop.getProperty("EmailIdInputEle")));
		VerifyElement(EmailIdInputEle);
		
		return EmailIdInputEle;
	}
	public WebElement AutoBCCRadioEle() {
		WebElement AutoBCCRadioEle = driver.findElement(By.xpath(prop.getProperty("AutoBCCRadioEle")));
		VerifyElement(AutoBCCRadioEle);
		checkBox(AutoBCCRadioEle);
		return AutoBCCRadioEle;
	}
	public WebElement SaveEmailButtonEle() {
		WebElement SaveEmailButtonEle = driver.findElement(By.xpath(prop.getProperty("SaveEmailButtonEle")));
		VerifyElement(SaveEmailButtonEle);
		clickButton(SaveEmailButtonEle);
		return SaveEmailButtonEle;
	}
	public WebElement ConfirmEmailMessageEle() {
		WebElement ConfirmEmailMessageEle = driver.findElement(By.xpath(prop.getProperty("ConfirmEmailMessageEle")));
		VerifyElement(ConfirmEmailMessageEle);
		System.out.println(ConfirmEmailMessageEle.getText());
		return ConfirmEmailMessageEle;
	}
	
	
	 
	 
/*========================================Create Account=================================================================================*/
	
	
/*========================================Create Opty====================================================================================*/	
	
	public WebElement PlusOptionMenuEle() {
		WebElement PlusOptionMenuEle = driver.findElement(By.xpath(prop.getProperty("PlusOptionMenuEle")));
		VerifyElement(PlusOptionMenuEle);
		PlusOptionMenuEle.click();
		WebElement AllTabsPageHeaderEle = driver.findElement(By.xpath(prop.getProperty("AllTabsPageHeaderEle")));
		VerifyElement(AllTabsPageHeaderEle);
		
		System.out.println(AllTabsPageHeaderEle.getText());
		return PlusOptionMenuEle;
	}
	
	public WebElement OptyLinkEle() {
		WebElement OptyLinkEle = driver.findElement(By.xpath(prop.getProperty("OptyLinkEle")));
		VerifyElement(OptyLinkEle);
		
		OptyLinkEle.click();
		WebElement OptyPageHeaderEle = driver.findElement(By.xpath(prop.getProperty("OptyPageHeaderEle")));
		VerifyElement(OptyPageHeaderEle);
		return OptyLinkEle;
	}
	public WebElement ViewOptyDropDownEle() {
		WebElement ViewOptyDropDownEle = driver.findElement(By.xpath(prop.getProperty("ViewOptyDropDownEle")));
		VerifyElement(ViewOptyDropDownEle);
		
		return ViewOptyDropDownEle;
	}
		
//------------- Create New Opty
	
	public WebElement NewButtonEle() {
		WebElement NewButtonEle = driver.findElement(By.xpath(prop.getProperty("NewButtonEle")));
		VerifyElement(NewButtonEle);
		NewButtonEle.click();
		
		WebElement NewOptyPageHeaderEle = driver.findElement(By.xpath(prop.getProperty("NewOptyPageHeaderEle")));
		VerifyElement(NewOptyPageHeaderEle);
		
		return NewButtonEle;
		
	}
	
	public WebElement OptyNameTextEle() {
		WebElement OptyNameTextEle = driver.findElement(By.xpath(prop.getProperty("OptyNameTextEle")));
		VerifyElement(OptyNameTextEle);
		String OppNameValue = "testOppprtunity";
		SendTextBoxInput(OptyNameTextEle, OppNameValue);
		return OptyNameTextEle;
	}
	
	public WebElement OptyAcctNameTextEle() {
		WebElement OptyAcctNameTextEle = driver.findElement(By.xpath(prop.getProperty("OptyAcctNameTextEle")));
		VerifyElement(OptyAcctNameTextEle);
		String AcctNameValue = "automerge1";
		SendTextBoxInput(OptyAcctNameTextEle, AcctNameValue);
		return OptyAcctNameTextEle;
	}
	
	public WebElement OptyCloseDateEle() {
		WebElement OptyCloseDateEle = driver.findElement(By.xpath(prop.getProperty("OptyCloseDateEle")));
		WebElement body = driver.findElement(By.xpath(prop.getProperty("body")));
		VerifyElement(OptyCloseDateEle);
		String DateValue = "2/22/2025";
		SendTextBoxInput(OptyCloseDateEle, DateValue);
		body.click();
		return OptyCloseDateEle;
	}
	
	public WebElement LeadSourceDropDownEle() {
		WebElement LeadSourceDropDownEle = driver.findElement(By.xpath(prop.getProperty("LeadSourceDropDownEle")));
		VerifyElement(LeadSourceDropDownEle);
	//	String DropDownValue = "Phone Inquiry";
	//	dropdown(LeadSourceDropDownEle, DropDownValue);
		return LeadSourceDropDownEle;
	}
	
	public WebElement StageDropDownEle() {
		WebElement StageDropDownEle = driver.findElement(By.xpath(prop.getProperty("StageDropDownEle")));
		VerifyElement(StageDropDownEle);
	//	String DropDownValue = "Prospecting";
	//	dropdown(StageDropDownEle, DropDownValue);
		return StageDropDownEle;
	}
	
	
//	public WebElement PrimaryCampSourceTextEle() {
//		WebElement PrimaryCampSourceTextEle = driver.findElement(By.xpath(prop.getProperty("PrimaryCampSourceTextEle")));
//		VerifyElement(PrimaryCampSourceTextEle);
//		String SourceValue = "phone";
//		SendTextBoxInput(PrimaryCampSourceTextEle, SourceValue);
//		return PrimaryCampSourceTextEle;
//	}
	
	public WebElement SaveOptyButtonEle() {
		WebElement SaveOptyButtonEle = driver.findElement(By.xpath(prop.getProperty("SaveOptyButtonEle")));
		VerifyElement(SaveOptyButtonEle);
		SaveOptyButtonEle.click();
		return SaveOptyButtonEle;
	}
	
	public WebElement OptyDetailHeaderEle() {
		WebElement OptyDetailHeaderEle = driver.findElement(By.xpath(prop.getProperty("OptyDetailHeaderEle")));
		VerifyElement(OptyDetailHeaderEle);
		return OptyDetailHeaderEle;
	}
	
//-----------------Pipeline
	
	public WebElement PipelineLinkEle() {
		WebElement PipelineLinkEle = driver.findElement(By.xpath(prop.getProperty("PipelineLinkEle")));
		VerifyElement(PipelineLinkEle);
		PipelineLinkEle.click();
		return PipelineLinkEle;
	}
	
	public WebElement PipelinePageHeaderEle() {
		WebElement PipelinePageHeaderEle = driver.findElement(By.xpath(prop.getProperty("PipelinePageHeaderEle")));
		VerifyElement(PipelinePageHeaderEle);
		return PipelinePageHeaderEle;
	}
	
//------------------Stuck Opty
	
	public WebElement StuckOptyLinkELe() {
		WebElement StuckOptyLinkELe = driver.findElement(By.xpath(prop.getProperty("StuckOptyLinkELe")));
		VerifyElement(StuckOptyLinkELe);
		StuckOptyLinkELe.click();
		return StuckOptyLinkELe;
	}
	
	public WebElement StuckOptyHeaderEle() {
		WebElement StuckOptyHeaderEle = driver.findElement(By.xpath(prop.getProperty("StuckOptyHeaderEle")));
		VerifyElement(StuckOptyHeaderEle);
		return StuckOptyHeaderEle;
	}
	

//-------------------Quarterly Summary
	
	public WebElement IntervalDropDownEle() {
		WebElement IntervalDropDownEle = driver.findElement(By.xpath(prop.getProperty("IntervalDropDownEle")));
		VerifyElement(IntervalDropDownEle);
		//String DropDownValue = "Current FQ";
		//dropdown(IntervalDropDownEle, DropDownValue);
		return IntervalDropDownEle;
	}
	
	public WebElement IncludeDropDownEle() {
		WebElement IncludeDropDownEle = driver.findElement(By.xpath(prop.getProperty("IncludeDropDownEle")));
		VerifyElement(IncludeDropDownEle);
	//	String DropDownValue = "Open Opportunities";
	//	dropdown(IncludeDropDownEle, DropDownValue);
		return IncludeDropDownEle;
	}
	
	
	public WebElement RunReportButtonEle() {
		WebElement RunReportButtonEle = driver.findElement(By.xpath(prop.getProperty("RunReportButtonEle")));
		VerifyElement(RunReportButtonEle);
		RunReportButtonEle.click();
		return RunReportButtonEle;
	}
	
	public WebElement OptyReportPageHeader() {
		WebElement OptyReportPageHeader = driver.findElement(By.xpath(prop.getProperty("OptyReportPageHeader")));
		VerifyElement(OptyReportPageHeader);
		return OptyReportPageHeader;
	}
	
	
/*============================================== Leads =================================================================================*/
	
	
	public WebElement LeadsLinkEle() {
		WebElement LeadsLinkEle = driver.findElement(By.xpath(prop.getProperty("LeadsLinkEle")));
		VerifyElement(LeadsLinkEle);
		LeadsLinkEle.click();
		return LeadsLinkEle;
	}
	
	public WebElement LeadsPageHeaderEle() {
		WebElement LeadsPageHeaderEle = driver.findElement(By.xpath(prop.getProperty("LeadsPageHeaderEle")));
		VerifyElement(LeadsPageHeaderEle);
		return LeadsPageHeaderEle;
	}
	
	
	public WebElement LeadsDropDownEle() {
		WebElement LeadsDropDownEle = driver.findElement(By.xpath(prop.getProperty("LeadsDropDownEle")));
		//String DropDownValue = "Open Opportunities";
		VerifyElement(LeadsDropDownEle);
		LeadsDropDownEle.click();
		String dropdownvalues =  LeadsDropDownEle.getText();
		System.out.println(dropdownvalues);
		return LeadsDropDownEle;
	}
	
	
	public WebElement GoButtonEle() {
		WebElement GoButtonEle = driver.findElement(By.xpath(prop.getProperty("GoButtonEle")));
		VerifyElement(GoButtonEle);
		GoButtonEle.click();
		return GoButtonEle;
	}
	
	
			
	public WebElement NewLeadButtonEle() {
		WebElement NewLeadButtonEle = driver.findElement(By.xpath(prop.getProperty("NewLeadButtonEle")));
		VerifyElement(NewLeadButtonEle);
		NewLeadButtonEle.click();
		return NewLeadButtonEle;
	}
	
	public WebElement NewLeadPageHeaderEle() {
		WebElement NewLeadPageHeaderEle = driver.findElement(By.xpath(prop.getProperty("NewLeadPageHeaderEle")));
		VerifyElement(NewLeadPageHeaderEle);
		return NewLeadPageHeaderEle;
	}
	
	public WebElement LastNameTextEle() {
		WebElement LastNameTextEle = driver.findElement(By.xpath(prop.getProperty("LastNameTextEle")));
		VerifyElement(LastNameTextEle);
		String LastNameValue = "ABCD";
		SendTextBoxInput(LastNameTextEle, LastNameValue);
		return LastNameTextEle;
	}
	public WebElement CompNameTextEle() {
		WebElement CompNameTextEle = driver.findElement(By.xpath(prop.getProperty("CompNameTextEle")));
		VerifyElement(CompNameTextEle);
		String CompNameValue = "ABCD";
		SendTextBoxInput(CompNameTextEle, CompNameValue);
		return CompNameTextEle;
	}
	public WebElement SaveLeadButtonEle() {
		WebElement SaveLeadButtonEle = driver.findElement(By.xpath(prop.getProperty("SaveLeadButtonEle")));
		VerifyElement(SaveLeadButtonEle);
		SaveLeadButtonEle.click();
		return SaveLeadButtonEle;
	}
	public WebElement LeadDetailHeaderEle() {
		WebElement LeadDetailHeaderEle = driver.findElement(By.xpath(prop.getProperty("LeadDetailHeaderEle")));
		VerifyElement(LeadDetailHeaderEle);
		return LeadDetailHeaderEle;
	}

/*====================================== Contacts =====================================================================================*/
	
			public WebElement ContactsLinkEle() {
				WebElement ContactsLinkEle = driver.findElement(By.xpath(prop.getProperty("ContactsLinkEle")));
				VerifyElement(ContactsLinkEle);
				ContactsLinkEle.click();
				return ContactsLinkEle;
			}
			
			public WebElement ContactNewButtonEle() {
				WebElement ContactNewButtonEle = driver.findElement(By.xpath(prop.getProperty("ContactNewButtonEle")));
				VerifyElement(ContactNewButtonEle);
				ContactNewButtonEle.click();
				return ContactNewButtonEle;
			}
			
			public WebElement ConLastNameTextEle() {
				WebElement ConLastNameTextEle = driver.findElement(By.xpath(prop.getProperty("ConLastNameTextEle")));
				VerifyElement(ConLastNameTextEle);
				String NameValue = "ABCD";
				SendTextBoxInput(ConLastNameTextEle, NameValue);
				return ConLastNameTextEle;
			}
			public WebElement ConAcctNameTextEle() {
				WebElement ConAcctNameTextEle = driver.findElement(By.xpath(prop.getProperty("ConAcctNameTextEle")));
				VerifyElement(ConAcctNameTextEle);
				String CompNameValue = "automerge1";
				SendTextBoxInput(ConAcctNameTextEle, CompNameValue);
				return ConAcctNameTextEle;
			}
			public WebElement ConSaveButtonEle() {
				WebElement ConSaveButtonEle = driver.findElement(By.xpath(prop.getProperty("ConSaveButtonEle")));
				VerifyElement(ConSaveButtonEle);
				ConSaveButtonEle.click();
				return ConSaveButtonEle;
			}
			public WebElement ContactDetailHeaderEle() {
				WebElement ContactDetailHeaderEle = driver.findElement(By.xpath(prop.getProperty("ContactDetailHeaderEle")));
				VerifyElement(ContactDetailHeaderEle);
				return ContactDetailHeaderEle;
			}
			
			
			public WebElement ConCreateNewViewLinkEle() {
				WebElement ConCreateNewViewLinkEle = driver.findElement(By.xpath(prop.getProperty("ConCreateNewViewLinkEle")));
				VerifyElement(ConCreateNewViewLinkEle);
				ConCreateNewViewLinkEle.click();
				return ConCreateNewViewLinkEle;
			}
			
			public WebElement ConCreateNewViewHeaderEle() {
				WebElement ConCreateNewViewHeaderEle = driver.findElement(By.xpath(prop.getProperty("ConCreateNewViewHeaderEle")));
				VerifyElement(ConCreateNewViewHeaderEle);
				return ConCreateNewViewHeaderEle;
			}
			
			public WebElement ConViewNameTextEle() {
				WebElement ConViewNameTextEle = driver.findElement(By.xpath(prop.getProperty("ConViewNameTextEle")));
				VerifyElement(ConViewNameTextEle);
				String CompNameValue = "ABCD";
				SendTextBoxInput(ConViewNameTextEle, CompNameValue);
				return ConViewNameTextEle;
			}
			
			public WebElement ConViewUniqNameTextEle() {
				WebElement ConViewUniqNameTextEle = driver.findElement(By.xpath(prop.getProperty("ConViewUniqNameTextEle")));
				VerifyElement(ConViewUniqNameTextEle);
				String CompNameValue = "ABCD";
				SendTextBoxInput(ConViewUniqNameTextEle, CompNameValue);
				return ConViewUniqNameTextEle;
			}
			
			public WebElement ConViewSaveButtonEle() {
				WebElement ConViewSaveButtonEle = driver.findElement(By.xpath(prop.getProperty("ConViewSaveButtonEle")));
				VerifyElement(ConViewSaveButtonEle);
				ConViewSaveButtonEle.click();
				return ConViewSaveButtonEle;
			}
			 
			
					
			public WebElement ConRecentlyCreatedDropDownEle() {
				WebElement ConRecentlyCreatedDropDownEle = driver.findElement(By.xpath(prop.getProperty("ConRecentlyCreatedDropDownEle")));
				VerifyElement(ConRecentlyCreatedDropDownEle);
			//	String DropDownValue = "Open Opportunities";
			//	dropdown(IncludeDropDownEle, DropDownValue);
				return ConRecentlyCreatedDropDownEle;
			}
	
			public WebElement MyContactsDropDownEle() {
				WebElement MyContactsDropDownEle = driver.findElement(By.xpath(prop.getProperty("MyContactsDropDownEle")));
				VerifyElement(MyContactsDropDownEle);
			int DropDownValue = 5;
				dropdown(MyContactsDropDownEle, DropDownValue);
				return MyContactsDropDownEle;
			}
			
	
			
	
			public WebElement ContactNameLinkEle() {
				WebElement ContactNameLinkEle = driver.findElement(By.xpath(prop.getProperty("ContactNameLinkEle")));
				VerifyElement(ContactNameLinkEle);
				ContactNameLinkEle.click();
				return ContactNameLinkEle;
			}
	
			public WebElement ViewErrorEle() {
				WebElement ViewErrorEle = driver.findElement(By.xpath(prop.getProperty("ViewErrorEle")));
				VerifyElement(ViewErrorEle);
				return ViewErrorEle;
			}
	
			public WebElement ViewCancelButtonEle() {
				WebElement ViewCancelButtonEle = driver.findElement(By.xpath(prop.getProperty("ViewCancelButtonEle")));
				VerifyElement(ViewCancelButtonEle);
				ViewCancelButtonEle.click();
				return ViewCancelButtonEle;
			}
			
			
			
			public WebElement ConSaveandNewButtonEle() {
				WebElement ConSaveandNewButtonEle = driver.findElement(By.xpath(prop.getProperty("ConSaveandNewButtonEle")));
				VerifyElement(ConSaveandNewButtonEle);
				ConSaveandNewButtonEle.click();
				return ConSaveandNewButtonEle;
			}
			
			public WebElement ConNewContactHeaderEle() {
				WebElement ConNewContactHeaderEle = driver.findElement(By.xpath(prop.getProperty("ConNewContactHeaderEle")));
				VerifyElement(ConNewContactHeaderEle);
				return ConNewContactHeaderEle;
			}
			
			
//	public static void main(String[] args) throws IOException {
//		
//		baseSalesForce bSale = new baseSalesForce();
//		bSale.LoginPositive();
//	}

}
