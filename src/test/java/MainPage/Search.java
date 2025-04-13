package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

	WebDriver driver;
	By Product=By.xpath("//a[text()=\" Products\"]");
	By ProductLabel=By.xpath("//h2[text()=\"All Products\"]");
	By InputSearch=By.xpath("//input[@placeholder=\"Search Product\"]");
	By SearchButton=By.xpath("//button[@type=\"button\"]");
	
	
	public void ProductPage() {
		VerifyProductLabel();
		EnterSearch();
		ClickSearchButton();
	}
	
	public void VerifyProductLabel() {
		 driver.findElement(ProductLabel).isDisplayed();
	}

	public void EnterSearch() {
		driver.findElement(InputSearch).sendKeys("top");
	}
	
	public void ClickSearchButton() {
		driver.findElement(SearchButton).click();
	}
	


}
