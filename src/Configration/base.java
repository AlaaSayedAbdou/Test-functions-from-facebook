package Configration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base {

	public static WebDriver  Driver;
	public static String browser="C" ;
	
	public static String OsDirector() {
		String OS=System.getProperty("os.name").toLowerCase();
		
		if(OS.contains("win")) {
			return "Windos";
		}
		else if(OS.contains("nux")|OS.contains("nix"))
		{
			return "Linux";
		}
		else 
		{
			return "other";
		}
					
	
	}
	
	public static WebDriver LodDriver(String DriverName)
	{
		String os=OsDirector();
		//System.out.println(os);
		if(os.equals("Linux")) {
			
			return Driver;
		
		}
		else if(os.equals("Windos")) {
			//System.out.println(browser);
			if(browser.equals("C")) {
				String ChromePath=System.getProperty("user.dir")+"\\resource\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",ChromePath);
			//	System.setProperty("webdriver.chrome.driver", "G:/Testing/resources/chromedriver.exe");
				//to close the notification
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
				Driver=new ChromeDriver(option);
				return Driver;
				
			}
			else if(browser.equals("F"))
			{
				String firefoxDriverPath =System.getProperty("user.dir")+"\\resource\\geckodriver.exe";
				
				System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
				//System.setProperty("webdriver.gecko.driver","G:/Testing/resources/GeckoDriver.exe");
				/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette",true);
				Driver= new FirefoxDriver(capabilities); 
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
				Driver=new FirefoxDriver(option);*/
				Driver=new FirefoxDriver();
				return Driver;
			}
			else
			{
				System.out.println("Operating system not suport");
				
				 Driver.quit();
			}
			
		}
		else
		{
			System.out.println("Operating system not suport");
			
			 Driver.quit();
		}
		return Driver;
	}
}
