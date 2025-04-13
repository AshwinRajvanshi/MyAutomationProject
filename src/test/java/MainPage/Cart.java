package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cart {
	WebDriver driver;
	By CartPageLink=By.xpath("//a[text()=\" Cart\"]");
	By EmptyCart=By.xpath("//span[@id=\"empty_cart\"]/descendant::b[text()=\"Cart is empty!\"]");
	By LabelShoppingCart=By.xpath("//div[@class=\"breadcrumbs\"]/descendant::li[2]");
	By ProceedToCheckout=By.xpath("//a[text()=\"Proceed To Checkout\"]");
	By DeleteCart = By.xpath("//a[@class=\"cart_quantity_delete\"]");
	
	
	public void CartPage() {
		driver.findElement(CartPageLink).click();
	}
	
	public void ShoppingCartLabelVerify() {
		driver.findElement(LabelShoppingCart).isDisplayed();
		System.out.print(driver.findElement(LabelShoppingCart).isDisplayed());

	}
	
	public void CartEmpty() {
		driver.findElement(EmptyCart).getText();
	}

	public void ProceedToCheckout() {
		driver.findElement(ProceedToCheckout).click();
	}
	
	public void DeleteFromCart() {
		driver.findElement(DeleteCart).click();
	}
}
