package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class makePost {


	public WebElement postAria(WebDriver driver) {
		
	//return driver.findElement(By.cssSelector("input[contains(@aria-label,'What's on your mind, Alaa?')]"));
		//return driver.findElement(By.cssSelector("input[contains(@title,'What's on your mind, Alaa?')]"));

	//return driver.findElement(By.cssSelector("input[data-testid='status-attachment-mentions-input']"));
	//return driver.findElement(By.cssSelector("._1mwp.navigationFocus._395._1mwq._4c_p._5bu_._3t-3._34nd._21mu._5yk1"));

		return driver.findElement(By.name("xhpc_message"));

	}


	/*public WebElement textArea(WebDriver driver) {
		
		return driver.findElement(By.xpath("//a[@action='cancel']"));
		
	}*/
	public WebElement sharbutton(WebDriver driver) {
		
		 // return driver.findElement(By.cssSelector("value[value='Log In'][type='submit']"));
		return driver.findElement(By.cssSelector("button[data-testid='react-composer-post-button']"));
		
	}
}
