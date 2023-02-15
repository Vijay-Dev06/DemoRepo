package com.step_definition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import com.First_code.FirstCode.base_Class_Methods;
import com.Pageobjectmanager.Page_object_manager;
import com.filereader.File_reader_manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends base_Class_Methods{
	public static WebDriver driver = browserlaunch("chrome");
	public static Page_object_manager pom = new Page_object_manager(driver);

		@Given("^SetUp the given application$")
		public void setup_the_given_application() throws Throwable {
			
			String URL = File_reader_manager.getinstanceFRM().GetinstanceCR().geturl();
			launchUrl(URL);
		
		}

		@When("^User clicks on the login button$")
		public void user_clicks_on_the_login_button() throws Throwable {
		
			Clickbutton(pom.getInstanceLP().getLogin());
		}

		@When("^User will login using the email and password$")
		public void user_will_login_using_the_email_and_password() throws Throwable {
			
			String username = File_reader_manager.getinstanceFRM().GetinstanceCR().getusername();
			Input(pom.getInstanceLP().getEmail(),username);
			String password = File_reader_manager.getinstanceFRM().GetinstanceCR().getpassword();
			Input(pom.getInstanceLP().getPassword(), password);
			Clickbutton(pom.getInstanceLP().getLoginButton());
		
		}

		@Then("^Verify that home page is displayed$")
		public void verify_that_home_page_is_displayed() throws Throwable {
			
			getTitle();

		}

		@When("^User clicks on the New design file option in the home page$")
		public void user_clicks_on_the_New_design_file_option_in_the_home_page() throws Throwable {
			
			Clickbutton(pom.getInstanceHP().getNew_design());
		
		}

		@Then("^Verify that design page is opened$")
		public void verify_that_design_page_is_opened() throws Throwable {
			
			title(pom.getInstanceCAV().getTitle());
		
		}

		@When("^User draws a rectangle on the canvas$")
		public void user_draws_a_rectangle_on_the_canvas() throws Throwable {

			Clickbutton(pom.getInstanceCAV().getSelectingRectangle());
			Clickbutton(pom.getInstanceCAV().getCanvas());
		}

		@When("^User changes the color of the rectangle$")
		public void user_changes_the_color_of_the_rectangle() throws Throwable {
			
			Robot r = new Robot();
			Clickbutton(pom.getInstanceCAV().getColour());
			String colour = File_reader_manager.getinstanceFRM().GetinstanceCR().getcolour();
			Input(pom.getInstanceCAV().getColour(), colour);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			driver.close();
		}
	
}
