package Controll.Authontication;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Configration.ReadCradintial;
import Configration.base;

public class TestLogin {
	WebDriver driver =null;
	Pages.login login=new Pages.login();
	ReadCradintial readCredental =new ReadCradintial();
	String expectedUserName ="Alaa Sayed";
  @Test
  public void testLoginWithValieddata() throws InterruptedException{
	  
	 String [] configration =readCredental.configration();
	 driver =base.LodDriver(base.browser);
	 driver.manage().window().maximize();
	 
	 //open the url
	 
	 driver.get(configration[0]);
	 login.Email(driver).sendKeys(configration[1]);
	  

	 login.Password(driver).sendKeys(configration[2]);
	 Thread.sleep(4000);
	 login.buttonLogin(driver).click();
	 
	
	 
	 
	 //to assert user name 
	/* String  actualuserName= login.username(driver).getText();
	
	 assertEquals(actualuserName,expectedUserName,"the user name not found");*/
	 
	
	 
	  
  }
  
  @AfterTest
	public void closeUrl() {
		driver.quit();
	}
}
  