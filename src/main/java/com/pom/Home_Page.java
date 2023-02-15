package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver ;


	@FindBy (xpath ="(//span[text()='Recently viewed'])[1]")
	private WebElement Homepage_Verify;

	@FindBy (xpath ="//div[@data-testid='new-design-file-button']")
	private WebElement New_design;


	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);	}

	public WebElement getHomepage_Verify() {
		return Homepage_Verify;
	}

	public WebElement getNew_design() {
		return New_design;
	}

}
