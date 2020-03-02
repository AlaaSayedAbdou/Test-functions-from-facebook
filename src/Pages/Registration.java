package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	public WebElement firsName (WebDriver driver) {
		return driver.findElement(By.id("u_0_m"));
	}
	
	public WebElement lastName (WebDriver driver) {
		return driver.findElement(By.id("u_0_o"));
	}
	
	public WebElement email (WebDriver driver) {
		return driver.findElement(By.id("u_0_r"));
	}
	
	public WebElement reEmail (WebDriver driver) {
		return driver.findElement(By.id("u_0_u"));
	}
	
	public WebElement password (WebDriver driver) {
		return driver.findElement(By.id("u_0_w"));
	}
	
	public WebElement rePassword (WebDriver driver) {
		return driver.findElement(By.id("u_0_u"));
	}
	
	public void birthdayDay (WebDriver driver) {
		Select dropdown = new Select(driver.findElement(By.id("day")));
		 dropdown.selectByValue("5");
		
	}
	
	public void birthdayMonth (WebDriver driver) {
		Select dropdown = new Select(driver.findElement(By.id("month")));
		 dropdown.selectByValue("5");
	}
	
	public void birthdayYear (WebDriver driver) {
		Select dropdown = new Select(driver.findElement(By.id("year")));
		 dropdown.selectByValue("1997");
	}
	
	public WebElement yourBronoun (WebDriver driver) {
		return driver.findElement(By.id("js_tc"));
	}
	
	public WebElement gender (WebDriver driver) {
		return driver.findElement(By.id("u_0_9"));
	}
	
	public WebElement SignInButton (WebDriver driver) {
		return driver.findElement(By.id("u_0_13"));
	}
	
	 
	
	

}
