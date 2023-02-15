package com.First_code.FirstCode;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class base_Class_Methods {

		
		public static WebDriver driver;
			
		public static WebDriver browserlaunch(String name) {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse workspace\\FirstCode\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return driver;
		}
		
		public static void Clickbutton(WebElement element) {
			element.click();
		}
		
		public static void close() {
				driver.close();
			}
		
		public static void quit() {
				driver.quit();
			}
		
		public static void launchUrl(String Link) {
				driver.get(Link);
			}
		
		public static void Input(WebElement element, String text) {
			element.sendKeys(text);
			
		}
				
		public static void getTitle() {
			String title = driver.getTitle();
			System.out.println("The HomePage "+title);
		}
		
		

			public static void title(WebElement element) {
				String title = element.getText();
				System.out.println("Document title bar :"+title);
			
			}
			
			
		}

	

