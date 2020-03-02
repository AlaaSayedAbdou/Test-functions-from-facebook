package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {

	public WebElement Email(WebDriver driver) {
		
		return driver.findElement(By.name("email"));
		
	}

	public WebElement Password(WebDriver driver) {
		
		return driver.findElement(By.name("pass"));
		
	}

	public WebElement buttonLogin(WebDriver driver) {
		// return driver.findElement(By.cssSelector("value[type='submit']"));
	 return driver.findElement(By.cssSelector("input[value='Log In'][type='submit']"));
	//	return driver.findElement(By.name("login"));
		//return driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
	  
	//	return driver.findElement(By.xpath("//*[@id=\"u_0_4\"]"));

	}
	//to do assertion on user name
	
	public WebElement username(WebDriver driver) {
		
		
		return driver.findElement(By.cssSelector(".linkWrap.noCount"));
	}
	
	//to search on singleclic
	



}
