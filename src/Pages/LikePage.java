package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LikePage {
	public WebElement searchBar(WebDriver driver) {
		
		//return driver.findElement(By.cssSelector("button[data-testid='search_input']"));

		return driver.findElement(By.className("_1frb"));
	}
	

	public WebElement searchBarButton(WebDriver driver) {
		
		return driver.findElement(By.cssSelector("button[data-testid='facebar_search_button']"));
	}	
	

	public WebElement pageLink(WebDriver driver) {
		
		return driver.findElement(By.linkText("Singleclic"));
	}

	public WebElement likeButton(WebDriver driver) {
		
		//		return driver.findElement(By.xpath("//*[@id=\"u_fetchstream_3_6\"]/div/div/div[1]/div/span/button"));

		return driver.findElement(By.cssSelector("button[data-testid='page_profile_like_button_test_id']"));
	}

}
