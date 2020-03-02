package Controll.Authontication;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Configration.ReadCradintial;
import Configration.base;

public class LikePage {WebDriver driver =null;
Pages.login login=new Pages.login();
Pages.LikePage likePage=new Pages.LikePage();
ReadCradintial readCredental =new ReadCradintial();
String expectedUserName ="Alaa Sayed";
@BeforeTest
public void login() throws InterruptedException{
	 String [] configration =readCredental.configration();
	 driver =base.LodDriver(base.browser);
	 driver.manage().window().maximize();
	 
	 //open the url
	 
	 driver.get(configration[0]);
	 login.Email(driver).sendKeys(configration[1]);
	  

	 login.Password(driver).sendKeys(configration[2]);
	 Thread.sleep(4000);
	 login.buttonLogin(driver).click();
	 
}


@Test
public void Like() throws InterruptedException{
	  
		
		 Thread.sleep(4000);
		 
		 likePage.searchBar(driver).sendKeys("singleclic");
		
		// Thread.sleep(4000);
		 
		 likePage.searchBarButton(driver).click();

		Thread.sleep(4000);
		likePage.pageLink(driver).click();
			
		 Thread.sleep(4000);

		 likePage.likeButton(driver).click();

		 
		 
		  
	  }

@AfterTest
public void closeUrl() {
	driver.quit();
}
}
