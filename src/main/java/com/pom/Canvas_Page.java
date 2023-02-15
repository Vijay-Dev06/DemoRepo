package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Canvas_Page {

public WebDriver driver ;
	
	@FindBy (xpath ="//div[contains(@data-testid,'rectangle')]")
	private WebElement selectingRectangle; 
	
	@FindBy (xpath = "//*[@id='fullscreen-root']/div/div/div[1]/div/div/canvas")
	private WebElement Canvas ;
	
	@FindBy (xpath ="(//div[@class='cachedSubtree'])[14]/div/div/div/div/div/div/following::input" )
	private WebElement colour;

	@FindBy(xpath = "//div[@id=\"fullscreen-filename\"]/div/span")
	private WebElement Title;

	
	public WebElement getTitle() {
		return Title;
	}

	public Canvas_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getSelectingRectangle() {
		return selectingRectangle;
	}

	public WebElement getCanvas() {
		return Canvas;
	}

	public WebElement getColour() {
		return colour;
	}
	
//  @FindBy (xpath = "(//input[contains(@class,'transform_panel')])[1]")
	
	
}
