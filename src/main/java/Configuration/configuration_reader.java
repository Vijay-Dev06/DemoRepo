package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configuration_reader {
	
	public  Properties p ;
	
		public configuration_reader() throws Throwable {
			File f = new File("E:\\\\eclipse workspace\\\\FirstCode\\\\Resource\\\\configuration.properties");
			FileInputStream fis = new FileInputStream(f);

			p = new Properties();
			p.load(fis);
			
		}
		
	
	public String geturl() {

		String url = p.getProperty("url");
		return url ;
		
	}	

	
		public String getusername()   {
			String Email = p.getProperty("email");
			return Email ;
		
		}
		public String getpassword()  {
			
			String password = p.getProperty("password");
			return password ;
		}
	
		public String getcolour() {
			
			String colour = p.getProperty("colour");
			return colour ;
		}
		
		
	}
	
	
	

