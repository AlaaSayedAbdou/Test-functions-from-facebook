package Controll.Authontication;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Configration.base;

public class TestRegistration {
	
	Pages.Registration registration=new Pages.Registration();
	Configration.ReadCradintial readconfigration =new Configration.ReadCradintial();
	WebDriver driver=null;
	int expectedPass=6;
	
  @Test
  public void TestPasswordValidationOnRegistration() throws InterruptedException{
	  String [] data =readconfigration.configRegistration();
	  driver=base.LodDriver(base.browser);
	  driver.manage().window().maximize();
	  
	  driver.get(data[0]);
	  
	  registration.firsName(driver).sendKeys(data[1]);
	  
	  registration.lastName(driver).sendKeys(data[2]);
	  
	  registration.email(driver).sendKeys(data[3]);
	  
	  registration.reEmail(driver).sendKeys(data[3]);

	
	  int actualPassLegnth=data[4].length();
	  
	  registration.password(driver).sendKeys(data[4]);

	  registration.birthdayDay(driver);
	  
	  registration.birthdayMonth(driver);
	  
	  registration.birthdayYear(driver);
	  Thread.sleep(2000);
	 
	  registration.gender(driver).click();
	  
	  registration.SignInButton(driver).click();
	  if(actualPassLegnth <6) {
		  assertEquals(actualPassLegnth,expectedPass,"you must enter password 6 or more than 6");

	  }
	 //  assertThat("you must enter pass more than or equal 6", actualPassLegnth, greaterThan(1000));

	  
	  
	  
	  
	  
	  
  }
}
