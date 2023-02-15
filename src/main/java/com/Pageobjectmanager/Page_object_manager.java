package com.Pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.Canvas_Page;
import com.pom.Home_Page;
import com.pom.Login_page;

public class Page_object_manager {

	public static WebDriver driver ;

	private Login_page LP; 
	private Home_Page HP ; 
	private Canvas_Page CAV ; 


	public Page_object_manager(WebDriver driver2) {
		Page_object_manager.driver = driver2 ;
	}

	public Login_page getInstanceLP() {

		if (LP==null) {
			LP = new Login_page(driver);
		} return LP ;
	}

	public Home_Page getInstanceHP() {

		if (HP==null) {
			HP = new Home_Page(driver);
		}	return HP ;
	}


	public Canvas_Page getInstanceCAV() {

		if (CAV==null) {
			CAV = new Canvas_Page(driver);
		}return CAV ;
	}

}
