package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductDescription {
	WebDriver driver;
	By ClearQuantity=By.id("quantity");
	By YourName=By.xpath("//form[@id='review-form']/descendant::input[1]");
	By EmailAddress=By.xpath("//form[@id='review-form']/descendant::input[2]");
	By AddReviewHere=By.xpath("//form[@id='review-form']/descendant::textarea");
	By SubmitButton=By.xpath("//form[@id='review-form']/descendant::button");
	By SuccssfulReviewMessage=By.xpath("//span[text()=\"Thank you for your review.\"]");
	By  ProductName=By.xpath("//div[@class='product-information']/descendant::h2");
	By ProductCategory=By.xpath("//div[@class='product-information']/descendant::p[1]");
	By ProductAvailablity=By.xpath("//div[@class='product-information']/descendant::p[2]");
	By ProductCondition = By.xpath("//div[@class='product-information']/descendant::p[3]");
	By ProductBrand=By.xpath("//div[@class='product-information']/descendant::p[4]");
	By ProductAddToCart=By.xpath("//div[@class='product-information']/descendant::span/button");

	public void ClearQuantity() {
		driver.findElement(ClearQuantity).clear();
	}
	
	public void UpdateQuantity(String ProductCount) {	
		driver.findElement(ClearQuantity).sendKeys(ProductCount);		
	}
	//ClearQuantity();
	//UpdateQuantity("4");
	
	
	
	public void AddReview() {
		driver.findElement(YourName).sendKeys("Heellllo");
		driver.findElement(EmailAddress).sendKeys("test@123.com");
		driver.findElement(AddReviewHere).sendKeys("ReciewDone!");
		driver.findElement(SubmitButton).click();
		driver.findElement(SuccssfulReviewMessage).isDisplayed();	
	}

	public void ProductDescriptions() {
		driver.findElement(ProductName).getText();
		driver.findElement(ProductCategory).getText();
		driver.findElement(ProductAvailablity).getText();
		driver.findElement(ProductCondition).getText();
		driver.findElement(ProductBrand).getText();


	}

	public void AddToCart() {
		driver.findElement(ProductAddToCart).getText();
		driver.findElement(ProductAddToCart).click();
	}
	
	
}