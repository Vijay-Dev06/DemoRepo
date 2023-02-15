package com.First_code.FirstCode;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import com.Pageobjectmanager.Page_object_manager;
import com.filereader.File_reader_manager;


public class RunnerClass extends base_Class_Methods {
	public static WebDriver driver = browserlaunch("chrome");
	public static Page_object_manager pom = new Page_object_manager(driver);

	public static void main(String[] args) throws Throwable {

		
//		String URL = File_reader_manager.getinstanceFRM().GetinstanceCR().geturl();
//		launchUrl(URL);
//		Clickbutton(pom.getInstanceLP().getLogin());
//		String username = File_reader_manager.getinstanceFRM().GetinstanceCR().getusername();
//		Input(pom.getInstanceLP().getEmail(),username);
//		String password = File_reader_manager.getinstanceFRM().GetinstanceCR().getpassword();
//		Input(pom.getInstanceLP().getPassword(), password);
//		Clickbutton(pom.getInstanceLP().getLoginButton());
//		Thread.sleep(1000);
//		getTitle();
//		Clickbutton(pom.getInstanceHP().getNew_design());
//		title(pom.getInstanceCAV().getTitle());
//		Robot r = new Robot();
//		Clickbutton(pom.getInstanceCAV().getSelectingRectangle());
//		Clickbutton(pom.getInstanceCAV().getCanvas());
//		Clickbutton(pom.getInstanceCAV().getColour());
//		String colour = File_reader_manager.getinstanceFRM().GetinstanceCR().getcolour();
//		Input(pom.getInstanceCAV().getColour(), colour);
//		r.keyPress(KeyEvent.VK_ENTER);
//		
	}

}
