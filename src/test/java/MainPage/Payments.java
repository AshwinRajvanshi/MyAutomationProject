package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payments {

	/*
	 * driver.findElement(By.xpath("//input[@name=\"name_on_card\"]")).sendKeys(
	 * "Testing123");
	 * driver.findElement(By.xpath("//input[@name=\"card_number\"]")).sendKeys(
	 * "123456789");
	 * driver.findElement(By.xpath("//input[@name=\"cvc\"]")).sendKeys("1234");
	 * driver.findElement(By.xpath("//input[@name=\"expiry_month\"]")).sendKeys("01"
	 * ); driver.findElement(By.xpath("//input[@name=\"expiry_year\"]")).sendKeys(
	 * "1996");
	 * driver.findElement(By.xpath("//button[text()=\"Pay and Confirm Order\"]")).
	 * click();
	 */
	
	WebDriver driver;
	By NameOnCard=By.xpath("//input[@name=\"name_on_card\"]");
	By CardNumber=By.xpath("//input[@name=\"card_number\"]");
	By CVC= By.xpath("By.xpath(\"//input[@name=\\\"cvc\\\"]\"))");
	By ExpiryMonth=By.xpath("//input[@name=\"expiry_month\"]");
	By ExpiryYear=By.xpath("//input[@name=\"expiry_year\"]");
	By PayAndConfirm = By.xpath("//div[@class='col-md-12 form-group']/descendant::button");
	
	public void PaymentPageDetailsFill() {
		EnterNameOnCard();
		EnterCardNumber();
		EnterCVC();
		ExpiryMonth();
		ExpiryYear();
		ClickPayAndConfirm();
	}
	
	
	public void EnterNameOnCard() {
		driver.findElement(NameOnCard).sendKeys("Testing123");
	}
	
	public void EnterCardNumber() {
		driver.findElement(CardNumber).sendKeys("971712932");
	}
	
	public void EnterCVC() {
		driver.findElement(CVC).sendKeys("123");
	}
	
	public void ExpiryMonth() {
		driver.findElement(ExpiryMonth).sendKeys("01");
	}
	
	
	public void ExpiryYear() {
		driver.findElement(ExpiryYear).sendKeys("2029");
	}
	public void ClickPayAndConfirm() {
		driver.findElement(PayAndConfirm).click();
	}
	
	
	
	
	
	
	
}
