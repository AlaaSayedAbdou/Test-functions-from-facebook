package Controll.Authontication;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Configration.ReadCradintial;
import Configration.base;

public class MakePost {

	WebDriver driver =null;
	Pages.login login=new Pages.login();
	Pages.makePost makepost=new Pages.makePost();
	ReadCradintial readCredental =new ReadCradintial();


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
	public void writePost() throws InterruptedException{

		

		makepost.postAria(driver).sendKeys("test");
		Thread.sleep(5000);
		makepost.sharbutton(driver).click();





	}

	@AfterTest
	public void closeUrl() {
		driver.quit();
	}
}
