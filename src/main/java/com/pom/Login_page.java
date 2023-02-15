package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public WebDriver driver ;

	@FindBy (xpath = "(//a[text()='Log in'])[1]")
	private WebElement Login ;

	@FindBy (id ="email")
	private WebElement email;

	@FindBy (id ="current-password")
	private WebElement password;

	@FindBy (xpath ="//button[text()='Log in']")
	private WebElement loginButton ;


	public Login_page(WebDriver driver2) {
		this.driver = driver2 ;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin() {
		return Login;
	}


	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
