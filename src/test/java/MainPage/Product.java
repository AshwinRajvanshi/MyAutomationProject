package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Product {
	
	WebDriver driver;
	By labelViewCart=By.xpath("//u[text()='View Cart']");
	By ContinueShopping=By.xpath("//*[text()=\"Continue Shopping\"]");
	By ViewProduct=By.xpath("(//a[text()=\"View Product\"])[1]\")");
	By AddtoCart=By.xpath("//a[text()=\"Add to cart\"]");
	By AllProduct=By.xpath("//h2[text()=\"All Products\"]");
	By ProductPage=By.xpath("//a[normalize-space(text())=\"Products\"]");

	public void ClickOnProduct() {
		driver.findElement(ProductPage).click();
	}
	
	public void VerifyLabelAllProducts() {
		String ActualAllProduct=driver.findElement(AllProduct).getText();
		String ExpectedAllProduct="ALL PRODUCTS";
		Assert.assertEquals(ActualAllProduct, ExpectedAllProduct);
	}
	
	public void AddTocart() {
		driver.findElement(AddtoCart).click();
	}
	
	public void ViewProducts() {
		driver.findElement(ViewProduct).click();

	}
	
	public void Continueshopping() {
		driver.findElement(ContinueShopping).click();

	}

	public void viewCart() {
		driver.findElement(labelViewCart).click();

	}
	
	
	
}
