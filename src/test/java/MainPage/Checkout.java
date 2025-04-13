package MainPage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Checkout {
	
	WebDriver driver;
	By Deliveryaddress_title = By.xpath("//h2[text()=\"Address Details\"]");
	By Deliverypage_subheading =By.xpath("//ul[@class='address item box']/descendant::li[2]");
	By Deliveryaddress_firstname_address_lastname =By.xpath("//ul[@class='address item box']/descendant::li[3]");
	By Deliveryaddress_address1_address_address2=By.xpath("//ul[@class='address item box']/descendant::li[4]");
	By Deliveryaddress1_address1_address_address2=By.xpath("//ul[@class='address item box']/descendant::li[5]");
	By Deliveryaddress2_address1_address_address2=By.xpath("//ul[@class='address item box']/descendant::li[6]");
	By DeliveryCountry=By.xpath("//ul[@class='address item box']/descendant::li[7]");
	By DeliveryMobileN=By.xpath("//ul[@class='address item box']/descendant::li[8]");
	
	By Billingaddress_title = By.xpath("//ul[@class='address alternate_item box']/descendant::li[1]");
	By Billingpage_subheading =By.xpath("//ul[@class='address alternate_item box']/descendant::li[2]");
	By Billingaddress_firstname_address_lastname =By.xpath("//ul[@class='address alternate_item box']/descendant::li[3]");
	By Billingaddress_address1_address_address2=By.xpath("//ul[@class='address alternate_item box']/descendant::li[4]");
	By Billingaddress1_address1_address_address2=By.xpath("//ul[@class='address alternate_item box']/descendant::li[5]");
	By Billingaddress2_address1_address_address2=By.xpath("//ul[@class='address alternate_item box']/descendant::li[6]");
	By BillingCountry=By.xpath("//ul[@class='address alternate_item box']/descendant::li[7]");
	By BillingMobileN=By.xpath("//ul[@class='address alternate_item box']/descendant::li[8]");
	By ReviewYourOrder=By.xpath("//h2[text()=\"Review Your Order\"]");
	By EnterReviewMessage=By.xpath("//textarea[@name=\"message\"]");
	By PlaceOrder=By.xpath("//a[text()=\"Place Order\"]");
	
	
	public void VerifyBillingandDelieveryAddress() {
		driver.findElement(Deliveryaddress_title).getText();
		driver.findElement(Billingaddress_title).getText();
		driver.findElement(Deliverypage_subheading).getText();
		driver.findElement(Billingpage_subheading).getText();
		Assert.assertEquals(Deliverypage_subheading, Billingpage_subheading, "MatchingSub-heading");
		driver.findElement(Deliveryaddress_firstname_address_lastname).getText();
		driver.findElement(Billingaddress_firstname_address_lastname).getText();
		Assert.assertEquals(Deliveryaddress_firstname_address_lastname, Billingaddress_firstname_address_lastname, "MatchingSub-heading");

		driver.findElement(Deliveryaddress_address1_address_address2).getText();
		driver.findElement(Billingaddress_address1_address_address2).getText();
		Assert.assertEquals(Deliveryaddress_address1_address_address2, Billingaddress_address1_address_address2, "MatchingSub-heading");

		driver.findElement(Deliveryaddress1_address1_address_address2).getText();		
		driver.findElement(Billingaddress1_address1_address_address2).getText();
		Assert.assertEquals(Deliveryaddress1_address1_address_address2, Billingaddress1_address1_address_address2, "MatchingSub-heading");

		driver.findElement(Deliveryaddress2_address1_address_address2).getText();
		driver.findElement(Billingaddress2_address1_address_address2).getText();
		Assert.assertEquals(Deliveryaddress2_address1_address_address2, Billingaddress2_address1_address_address2, "MatchingSub-heading");

		driver.findElement(DeliveryCountry).getText();
		driver.findElement(BillingCountry).getText();
		driver.findElement(DeliveryMobileN).getText();
		driver.findElement(BillingMobileN).getText();
		Assert.assertEquals(DeliveryCountry, BillingCountry, "MatchingSub-heading");
		Assert.assertEquals(DeliveryMobileN, BillingMobileN, "MatchingSub-heading");
	}
	
	public void VerifyReviewYourOrderLabel() {
		 String ActaulReviewOrder=driver.findElement(ReviewYourOrder).getText(); 
		 String ExpectedReviewOrder="Review Your Order";
		 Assert.assertEquals(ActaulReviewOrder,ExpectedReviewOrder);
	}

	public void ReviewMessgae() {
		 driver.findElement(EnterReviewMessage).sendKeys("Your Review");
	}
	
	public void PlaceOrderbutton() {
		  driver.findElement(PlaceOrder).click();

	}
}
