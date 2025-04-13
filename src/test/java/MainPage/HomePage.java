package MainPage;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage {
		String ActualURL="https://automationexercise.com/";
		String URL="https://automationexercise.com/";
		WebDriver driver = new ChromeDriver();
		String UserName="test21";
		String Email="test12@xyz.com";
		String Password="Ashwin";
	
		@Test
		public void OpenWebSite() {
		driver.manage().window().maximize();
		String CurrentURL= driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, ActualURL);
		}
		
		@Test
		public void RegisterUser() {
			OpenWebSite();
			driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
			String ActualVerifyLabelNewUserSignUp=driver.findElement(By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]")).getText();
			System.out.println(ActualVerifyLabelNewUserSignUp);
			String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
			Assert.assertEquals(ActualVerifyLabelNewUserSignUp, ExpectedVerifyLabelNewUserSignUp);
			driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys(UserName);
			driver.findElement(By.xpath("(//*[@name=\"email\"])[2]")).sendKeys("test11@xyz.com");
			driver.findElement(By.xpath("(//*[text()=\"Signup\"])")).click();
			String ActualVerifyEnterAccountInformation=driver.findElement(By.xpath("(//*[text()=\"Enter Account Information\"])")).getText();
			String ExpectedEnterAccountInformation="ENTER ACCOUNT INFORMATION";
			Assert.assertEquals(ActualVerifyEnterAccountInformation, ExpectedEnterAccountInformation);
			driver.findElement(By.xpath("//input[@value='Mr']")).click();
			driver.findElement(By.id("password")).sendKeys("Ashwin");
			
			Select DropDownDay=new Select(driver.findElement(By.xpath("//select[@id='days']")));
			DropDownDay.selectByIndex(4);
			
			Select DropDownMonth=new Select(driver.findElement(By.id("months")));
			DropDownMonth.selectByIndex(2);
			
			Select DropDownYear= new Select(driver.findElement(By.id("years")));
			DropDownYear.selectByIndex(2);
			
			driver.findElement(By.id("newsletter")).click();
			driver.findElement(By.id("optin")).click();
			
			
			
			driver.findElement(By.id("first_name")).sendKeys("Test");
			driver.findElement(By.id("last_name")).sendKeys("Tester");
			driver.findElement(By.id("company")).sendKeys("XYZ");
			driver.findElement(By.id("address1")).sendKeys("XYZ");
			driver.findElement(By.id("address2")).sendKeys("XYZ1");
			
			
			Select DropDownCountry= new Select(driver.findElement(By.id("country")));
			DropDownCountry.selectByVisibleText("Canada");
			
			driver.findElement(By.id("state")).sendKeys("Uttarpradesh");
			driver.findElement(By.id("city")).sendKeys("Ghaziabad");
			driver.findElement(By.id("zipcode")).sendKeys("201017");
			driver.findElement(By.id("mobile_number")).sendKeys("8008000800");
			driver.findElement(By.xpath("(//*[text()=\"Create Account\"])")).click();
			
			String ActaualAccountcreated=driver.findElement(By.xpath("(//*[text()=\"Account Created!\"])")).getText();
			String ExpectedAccouuntCreated="ACCOUNT CREATED!";
			Assert.assertEquals(ActaualAccountcreated, ExpectedAccouuntCreated);
			driver.findElement(By.xpath("(//*[text()=\"Continue\"])")).click();
			String ActaulLoggedin=driver.findElement(By.xpath("(//*[text()=\" Logged in as \"])")).getText();
			System.out.println(ActaulLoggedin);
			Assert.assertTrue(ActaulLoggedin.contains(UserName));
			driver.findElement(By.xpath("(//*[text()=\" Delete Account\"])")).click();
			String ActualDeletedVerify=driver.findElement(By.xpath("(//*[text()=\"Account Deleted!\"])")).getText();
			String ExpectedDeletedVerify="ACCOUNT DELETED!";
			Assert.assertEquals(ActualDeletedVerify, ExpectedDeletedVerify);
			driver.close();
			
			
			
			
			
			
		}
		
		@Test
		public void LoginWithCorrectEmailPassword() {
			OpenWebSite();
			driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
			String ActualVerifyLabelNewUserSignUp=driver.findElement(By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]")).getText();
			System.out.println(ActualVerifyLabelNewUserSignUp);
			String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
			Assert.assertEquals(ActualVerifyLabelNewUserSignUp, ExpectedVerifyLabelNewUserSignUp);
			driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys(UserName);
			driver.findElement(By.xpath("(//*[@name=\"email\"])[2]")).sendKeys(Email);
			driver.findElement(By.xpath("(//*[text()=\"Signup\"])")).click();
			String ActualVerifyEnterAccountInformation=driver.findElement(By.xpath("(//*[text()=\"Enter Account Information\"])")).getText();
			String ExpectedEnterAccountInformation="ENTER ACCOUNT INFORMATION";
			Assert.assertEquals(ActualVerifyEnterAccountInformation, ExpectedEnterAccountInformation);
			driver.findElement(By.xpath("//input[@value='Mr']")).click();
			driver.findElement(By.id("password")).sendKeys(Password);
			
			Select DropDownDay=new Select(driver.findElement(By.xpath("//select[@id='days']")));
			DropDownDay.selectByIndex(4);
			
			Select DropDownMonth=new Select(driver.findElement(By.id("months")));
			DropDownMonth.selectByIndex(2);
			
			Select DropDownYear= new Select(driver.findElement(By.id("years")));
			DropDownYear.selectByIndex(2);
			
			driver.findElement(By.id("newsletter")).click();
			driver.findElement(By.id("optin")).click();
			
			
			
			driver.findElement(By.id("first_name")).sendKeys("Test");
			driver.findElement(By.id("last_name")).sendKeys("Tester");
			driver.findElement(By.id("company")).sendKeys("XYZ");
			driver.findElement(By.id("address1")).sendKeys("XYZ");
			driver.findElement(By.id("address2")).sendKeys("XYZ1");
			
			
			Select DropDownCountry= new Select(driver.findElement(By.id("country")));
			DropDownCountry.selectByVisibleText("Canada");
			
			driver.findElement(By.id("state")).sendKeys("Uttarpradesh");
			driver.findElement(By.id("city")).sendKeys("Ghaziabad");
			driver.findElement(By.id("zipcode")).sendKeys("201017");
			driver.findElement(By.id("mobile_number")).sendKeys("8008000800");
			driver.findElement(By.xpath("(//*[text()=\"Create Account\"])")).click();
			
			String ActaualAccountcreated=driver.findElement(By.xpath("(//*[text()=\"Account Created!\"])")).getText();
			String ExpectedAccouuntCreated="ACCOUNT CREATED!";
			Assert.assertEquals(ActaualAccountcreated, ExpectedAccouuntCreated);
			driver.findElement(By.xpath("(//*[text()=\"Continue\"])")).click();
			driver.findElement(By.xpath("//*[text()=\" Logout\"]")).click();
			driver.findElement(By.xpath("(//*[@name=\"email\"])[1]")).sendKeys(Email);
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
			driver.findElement(By.xpath("//*[text()=\"Login\"]")).click();
			String ActaulLoggedin=driver.findElement(By.xpath("(//*[text()=\" Logged in as \"])")).getText();
			System.out.println(ActaulLoggedin);
			Assert.assertTrue(ActaulLoggedin.contains(UserName));	
			driver.findElement(By.xpath("(//*[text()=\" Delete Account\"])")).click();
			String ActualDeletedVerify=driver.findElement(By.xpath("(//*[text()=\"Account Deleted!\"])")).getText();
			String ExpectedDeletedVerify="ACCOUNT DELETED!";
			Assert.assertEquals(ActualDeletedVerify, ExpectedDeletedVerify);
			driver.close();
			
			
			
			
		}
		
		@Test
		public void LoginwithIncorrectEmailPassword() {
		OpenWebSite();
		driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
		String ActualVerifyLabelNewUserSignUp=driver.findElement(By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]")).getText();
		System.out.println(ActualVerifyLabelNewUserSignUp);
		String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
		Assert.assertEquals(ActualVerifyLabelNewUserSignUp, ExpectedVerifyLabelNewUserSignUp);
		driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]/following-sibling::form/input[2]")).sendKeys("Incorrect@ashwin.com");
		driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]/following-sibling::form/input[3]")).sendKeys("Incorrect");
		driver.findElement(By.xpath("//*[text()=\"Login\"]")).click();
		String ActualIncorrectUsernamePassword=driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getText();
		String ExpectedIncorrectUsernamePassword="Your email or password is incorrect!";
		Assert.assertEquals(ActualIncorrectUsernamePassword, ExpectedIncorrectUsernamePassword);
		driver.close();
		
		
		
		
		
		}
		
		@Test
		public void LogoutUser() {
			OpenWebSite();
			driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
			String ActualVerifyLabelNewUserSignUp=driver.findElement(By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]")).getText();
			System.out.println(ActualVerifyLabelNewUserSignUp);
			String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
			Assert.assertEquals(ActualVerifyLabelNewUserSignUp, ExpectedVerifyLabelNewUserSignUp);
			driver.findElement(By.xpath("//h2[text()=\"New User Signup!\"]/following-sibling::form/input[2]")).sendKeys("test12223");
			driver.findElement(By.xpath("//h2[text()=\"New User Signup!\"]/following-sibling::form/input[3]")).sendKeys("test@12223.com");
			driver.findElement(By.xpath("//h2[text()=\"New User Signup!\"]/following-sibling::form/button")).click();
			String ActualVerifyEnterAccountInformation=driver.findElement(By.xpath("(//*[text()=\"Enter Account Information\"])")).getText();
			String ExpectedEnterAccountInformation="ENTER ACCOUNT INFORMATION";
			Assert.assertEquals(ActualVerifyEnterAccountInformation, ExpectedEnterAccountInformation);
			driver.findElement(By.xpath("//input[@value='Mr']")).click();
			driver.findElement(By.id("password")).sendKeys(Password);
			
			Select DropDownDay=new Select(driver.findElement(By.xpath("//select[@id='days']")));
			DropDownDay.selectByIndex(4);
			
			Select DropDownMonth=new Select(driver.findElement(By.id("months")));
			DropDownMonth.selectByIndex(2);
			
			Select DropDownYear= new Select(driver.findElement(By.id("years")));
			DropDownYear.selectByIndex(2);
			
			driver.findElement(By.id("newsletter")).click();
			driver.findElement(By.id("optin")).click();
			
			
			
			driver.findElement(By.id("first_name")).sendKeys("Test");
			driver.findElement(By.id("last_name")).sendKeys("Tester");
			driver.findElement(By.id("company")).sendKeys("XYZ");
			driver.findElement(By.id("address1")).sendKeys("XYZ");
			driver.findElement(By.id("address2")).sendKeys("XYZ1");
			
			
			Select DropDownCountry= new Select(driver.findElement(By.id("country")));
			DropDownCountry.selectByVisibleText("Canada");
			
			driver.findElement(By.id("state")).sendKeys("Uttarpradesh");
			driver.findElement(By.id("city")).sendKeys("Ghaziabad");
			driver.findElement(By.id("zipcode")).sendKeys("201017");
			driver.findElement(By.id("mobile_number")).sendKeys("8008000800");
			driver.findElement(By.xpath("(//*[text()=\"Create Account\"])")).click();
			
			String ActaualAccountcreated=driver.findElement(By.xpath("(//*[text()=\"Account Created!\"])")).getText();
			String ExpectedAccouuntCreated="ACCOUNT CREATED!";
			Assert.assertEquals(ActaualAccountcreated, ExpectedAccouuntCreated);
			driver.findElement(By.xpath("(//*[text()=\"Continue\"])")).click();
			driver.findElement(By.xpath("//*[text()=\" Logout\"]")).click();
			driver.findElement(By.xpath("(//*[@name=\"email\"])[1]")).sendKeys("test@12223.com");
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
			driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]/following-sibling::form/button")).click();
			driver.findElement(By.xpath("//*[text()=\" Logout\"]")).click();
			String ActualLoginLabelVerify=driver.findElement(By.xpath("//*[text()=(\"Login to your account\")]")).getText();
			String ExpectedLoginLabelVerify="Login to your account";
			driver.close();
			
		}
		
		@Test
		public void RegisterwithExistingEmailAddress() {
			OpenWebSite();
			driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
			String ActualVerifyLabelNewUserSignUp=driver.findElement(By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]")).getText();
			System.out.println(ActualVerifyLabelNewUserSignUp);
			String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
			Assert.assertEquals(ActualVerifyLabelNewUserSignUp, ExpectedVerifyLabelNewUserSignUp);
			driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("test12223");
			driver.findElement(By.xpath("(//*[@name=\"email\"])[2]")).sendKeys("test@12223.com");
			driver.findElement(By.xpath("(//*[text()=\"Signup\"])")).click();
			String ActualAlert=driver.findElement(By.xpath("//p[text()=\"Email Address already exist!\"]")).getText();
			String ExpectedAlert="Email Address already exist!";
			Assert.assertEquals(ActualAlert, ExpectedAlert);
			
		}
		
		@Test
		
		public void ContactUsForm() {
			OpenWebSite();
			driver.findElement(By.xpath("//a[text()=\" Contact us\"]")).click();
			String ActualGetinTouch=driver.findElement(By.xpath("//*[text()=\"Get In Touch\"]")).getText();
			String ExpectedGetInTouch="GET IN TOUCH";
			Assert.assertEquals(ActualGetinTouch, ExpectedGetInTouch);
			driver.findElement(By.xpath("//form[@class=\"contact-form row\"]/child::div[1]")).sendKeys("Ashwin");
			driver.findElement(By.xpath("//form[@class=\"contact-form row\"]/child::div[2]")).sendKeys("test@123.com");
			driver.findElement(By.xpath("//form[@class=\"contact-form row\"]/child::div[3]")).sendKeys("Testing");
			driver.findElement(By.xpath("//form[@class=\"contact-form row\"]/child::div[4]")).sendKeys("Testing");
			//driver.findElement(By.xpath("//input[@type=\"file\"]")).click();
			WebElement uploadFile = driver.findElement(By.xpath("//input[@type=\"file\"]"));
			uploadFile.sendKeys("C:\\Users\\AR104445\\eclipse-workspace\\AutomationExcercise\\src\\test\\java\\MainPage\\touch.txt");
			driver.findElement(By.xpath("//form[@class=\"contact-form row\"]/child::div/input[@value='Submit']")).click();
			
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
			String ActualSuccessMessage= driver.findElement(By.xpath("//div[text()=\"Success! Your details have been submitted successfully.\"]")).getText();
			String ExpectedSuccessMessage="Success! Your details have been submitted successfully.";
			Assert.assertEquals(ActualSuccessMessage, ExpectedSuccessMessage);
			driver.findElement(By.xpath("//span[text()=\" Home\"]")).click();
			driver.get(URL);
			String CurrentURL= driver.getCurrentUrl();
			Assert.assertEquals(CurrentURL, ActualURL);
			driver.close();
			
		}
		
		
		@Test
		public void VerifyTestcasePage() {
			OpenWebSite();
			driver.findElement(By.xpath("//*[text()=\" Test Cases\"]")).click();
			String ActualVerifyTestcaseLabel=driver.findElement(By.xpath("//*[text()=\"Test Cases\"]")).getText();
			String ExpectedTestcaseLabel="TEST CASES";
			Assert.assertEquals(ActualVerifyTestcaseLabel, ExpectedTestcaseLabel);
			driver.close();
		}
		
		@Test
		public void VerifyallProductsandProductDetailPage() {
			OpenWebSite();
			driver.findElement(By.xpath("//a[text()=\" Products\"]")).click();
			String ActualAllProduct=driver.findElement(By.xpath("//h2[text()=\"All Products\"]")).getText();
			String ExpectedAllProduct="ALL PRODUCTS";
			Assert.assertEquals(ActualAllProduct, ExpectedAllProduct);
			driver.findElement(By.xpath("(//a[text()=\"View Product\"])[1]")).click();
			String URL1=driver.getCurrentUrl();
			System.out.println(URL1);
			driver.findElement(By.xpath("//h2[text()='Blue Top']")).isDisplayed();
			driver.findElement(By.xpath("//span[text()='Rs. 500']")).isDisplayed();
			driver.findElement(By.xpath("//b[text()='Availability:']")).isDisplayed();
			driver.findElement(By.xpath("//b[text()='Condition:']")).isDisplayed();
			driver.findElement(By.xpath("//b[text()='Brand:']")).isDisplayed();
			
		
		
		}

		@Test
		public void SearchProduct() {
			OpenWebSite();
			driver.findElement(By.xpath("//a[text()=\" Products\"]")).click();
			String ActualAllProduct=driver.findElement(By.xpath("//h2[text()=\"All Products\"]")).getText();
			String ExpectedAllProduct="ALL PRODUCTS";
			Assert.assertEquals(ActualAllProduct, ExpectedAllProduct);
			driver.findElement(By.xpath("//input[@placeholder=\"Search Product\"]")).sendKeys("top");
			driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
			driver.findElement(By.xpath("//h2[text()=\"Searched Products\"]")).isDisplayed();
			driver.findElement(By.xpath("(//*[text()='Blue Top'])[1]")).isDisplayed();
			driver.close();
		}
		
	@Test
	public void SubscriptionHomePage() {
		OpenWebSite();
		WebElement element=driver.findElement(By.xpath("//p[text()=\"Copyright © 2021 All rights reserved\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.id("susbscribe_email")).sendKeys("ashwin@ashwin.com");
		driver.findElement(By.id("subscribe")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\"You have been successfully subscribed!\")]")).isDisplayed());
		
		
		
	}
		
	@Test
	public void SubscriptionCartPage() {
		OpenWebSite();
		driver.findElement(By.xpath("//a[text()=\" Cart\"]")).click();
		WebElement element=driver.findElement(By.xpath("//p[text()=\"Copyright © 2021 All rights reserved\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.id("susbscribe_email")).sendKeys("ashwin@ashwin.com");
		driver.findElement(By.id("subscribe")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\"You have been successfully subscribed!\")]")).isDisplayed());
		
	}
	
	@Test
	public void AddProductCart() throws InterruptedException {
		OpenWebSite();
		driver.findElement(By.xpath("//a[text()=\" Products\"]")).click();
		Actions action = new Actions(driver);
		System.out.println("Ashwin1");
		WebElement we = driver.findElement(By.xpath("//a[text()=\"Add to cart\"]"));
		System.out.println("Ashwin2");
		//action.moveToElement(we);
		//action.click().build().perform();
		driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();
		System.out.println("Ashwin3");
				
		//Alert alert = driver.switchTo().alert();
		//driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Continue Shopping\"]")).click();
		we=driver.findElement(By.xpath("(//a[@data-product-id=2])[1]"));		
		we.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		driver.findElement(By.id("product-1")).isDisplayed();
		driver.findElement(By.id("product-2")).isDisplayed();
		driver.findElement(By.xpath("(//td[@class=\"cart_price\"])[1]")).isDisplayed();
		driver.findElement(By.xpath("(//td[@class=\"cart_price\"])[2]")).isDisplayed();
		driver.findElement(By.xpath("(//td[@class=\"cart_quantity\"])[1]")).isDisplayed();
		driver.findElement(By.xpath("(//td[@class=\"cart_quantity\"])[2]")).isDisplayed();
		driver.findElement(By.xpath("(//p[@class=\"cart_total_price\"])[1]")).isDisplayed();
		driver.findElement(By.xpath("(//p[@class=\"cart_total_price\"])[2]")).isDisplayed();


		
	}
		
	@Test
	public void ProductQuantityCart() throws InterruptedException {
		OpenWebSite();
		driver.findElement(By.xpath("(//a[text()=\"View Product\"])[1]")).click();
		driver.getCurrentUrl().contains("product_details");
		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("4");
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		String ActualQuantity= driver.findElement(By.xpath("(//td[@class=\"cart_quantity\"])[1]")).getText();
		System.out.println(ActualQuantity);
		String ExpectedQuantity="4";
		Assert.assertEquals(ActualQuantity, ExpectedQuantity);
		}
	
	@Test
	public void RegisterWhileCheckout() throws InterruptedException {
		OpenWebSite();
		driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Continue Shopping\"]")).click();
		driver.findElement(By.xpath("//a[text()=\" Cart\"]")).click();
		driver.getCurrentUrl().contains("view_cart");
		driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
		driver.findElement(By.xpath("//u[text()=\"Register / Login\"]")).click();

		//Register User
		driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
		String ActualVerifyLabelNewUserSignUp=driver.findElement(By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]")).getText();
		System.out.println(ActualVerifyLabelNewUserSignUp);
		String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
		Assert.assertEquals(ActualVerifyLabelNewUserSignUp, ExpectedVerifyLabelNewUserSignUp);
		driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("AddtoCart");
		driver.findElement(By.xpath("(//*[@name=\"email\"])[2]")).sendKeys("Addtocart@xyz.com");
		driver.findElement(By.xpath("(//*[text()=\"Signup\"])")).click();
		String ActualVerifyEnterAccountInformation=driver.findElement(By.xpath("(//*[text()=\"Enter Account Information\"])")).getText();
		String ExpectedEnterAccountInformation="ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(ActualVerifyEnterAccountInformation, ExpectedEnterAccountInformation);
		driver.findElement(By.xpath("//input[@value='Mr']")).click();
		driver.findElement(By.id("password")).sendKeys("Ashwin");
		
		Select DropDownDay=new Select(driver.findElement(By.xpath("//select[@id='days']")));
		DropDownDay.selectByIndex(4);
		
		Select DropDownMonth=new Select(driver.findElement(By.id("months")));
		DropDownMonth.selectByIndex(2);
		
		Select DropDownYear= new Select(driver.findElement(By.id("years")));
		DropDownYear.selectByIndex(2);
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		
		
		driver.findElement(By.id("first_name")).sendKeys("Addtocart");
		driver.findElement(By.id("last_name")).sendKeys("Addtocart");
		driver.findElement(By.id("company")).sendKeys("XYZ");
		driver.findElement(By.id("address1")).sendKeys("XYZ");
		driver.findElement(By.id("address2")).sendKeys("XYZ1");
		
		
		Select DropDownCountry= new Select(driver.findElement(By.id("country")));
		DropDownCountry.selectByVisibleText("Canada");
		
		driver.findElement(By.id("state")).sendKeys("Uttarpradesh");
		driver.findElement(By.id("city")).sendKeys("Ghaziabad");
		driver.findElement(By.id("zipcode")).sendKeys("201017");
		driver.findElement(By.id("mobile_number")).sendKeys("8008000800");
		driver.findElement(By.xpath("//div[@class='login-form']/descendant::button")).click();
		
		String ActaualAccountcreated=driver.findElement(By.xpath("(//*[text()=\"Account Created!\"])")).getText();
		String ExpectedAccouuntCreated="ACCOUNT CREATED!";
		Assert.assertEquals(ActaualAccountcreated, ExpectedAccouuntCreated);
		driver.findElement(By.xpath("(//*[text()=\"Continue\"])")).click();
		String ActaulLoggedin=driver.findElement(By.xpath("(//*[text()=\" Logged in as \"])")).getText();
		System.out.println(ActaulLoggedin);
	//	Assert.assertTrue(ActaulLoggedin.contains(UserName));
		driver.findElement(By.xpath("//a[text()=\" Cart\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
		String ActualAddressDetails=driver.findElement(By.xpath("//h2[text()=\"Address Details\"]")).getText();
		String ExpectedAddressDetails="Address Details";
		Assert.assertEquals(ActualAddressDetails, ExpectedAddressDetails);
		String ActaulReviewOrder=driver.findElement(By.xpath("//h2[text()=\"Review Your Order\"]")).getText();
		String ExpectedReviewOrder="Review Your Order";
		Assert.assertEquals(ActaulReviewOrder,ExpectedReviewOrder);
		driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("Ashein");
		driver.findElement(By.xpath("//a[text()=\"Place Order\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"name_on_card\"]")).sendKeys("Testing123");
		driver.findElement(By.xpath("//input[@name=\"card_number\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name=\"cvc\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name=\"expiry_month\"]")).sendKeys("01");
		driver.findElement(By.xpath("//input[@name=\"expiry_year\"]")).sendKeys("1996");
		driver.findElement(By.xpath("//button[text()=\"Pay and Confirm Order\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\"Congratulations! Your order has been confirmed!\")]")).isDisplayed());
		driver.findElement(By.xpath("(//*[text()=\" Delete Account\"])")).click();
		String ActualDeletedVerify=driver.findElement(By.xpath("(//*[text()=\"Account Deleted!\"])")).getText();
		String ExpectedDeletedVerify="ACCOUNT DELETED!";
		Assert.assertEquals(ActualDeletedVerify, ExpectedDeletedVerify);
		driver.close();		
	}
	
	@Test
	public void RegisterBeforeCheckout() throws InterruptedException {
		OpenWebSite();
		//Sign-up
		driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
		String ActualVerifyLabelNewUserSignUp=driver.findElement(By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]")).getText();
		System.out.println(ActualVerifyLabelNewUserSignUp);
		String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
		Assert.assertEquals(ActualVerifyLabelNewUserSignUp, ExpectedVerifyLabelNewUserSignUp);
		driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("AddtoCart");
		driver.findElement(By.xpath("(//*[@name=\"email\"])[2]")).sendKeys("Addtocart@xyz.com");
		driver.findElement(By.xpath("(//*[text()=\"Signup\"])")).click();
		String ActualVerifyEnterAccountInformation=driver.findElement(By.xpath("(//*[text()=\"Enter Account Information\"])")).getText();
		String ExpectedEnterAccountInformation="ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(ActualVerifyEnterAccountInformation, ExpectedEnterAccountInformation);
		driver.findElement(By.xpath("//input[@value='Mr']")).click();
		driver.findElement(By.id("password")).sendKeys("Ashwin");
		
		Select DropDownDay=new Select(driver.findElement(By.xpath("//select[@id='days']")));
		DropDownDay.selectByIndex(4);
		
		Select DropDownMonth=new Select(driver.findElement(By.id("months")));
		DropDownMonth.selectByIndex(2);
		
		Select DropDownYear= new Select(driver.findElement(By.id("years")));
		DropDownYear.selectByIndex(2);
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		
		
		driver.findElement(By.id("first_name")).sendKeys("Addtocart");
		driver.findElement(By.id("last_name")).sendKeys("Addtocart");
		driver.findElement(By.id("company")).sendKeys("XYZ");
		driver.findElement(By.id("address1")).sendKeys("XYZ");
		driver.findElement(By.id("address2")).sendKeys("XYZ1");
		
		
		Select DropDownCountry= new Select(driver.findElement(By.id("country")));
		DropDownCountry.selectByVisibleText("Canada");
		
		driver.findElement(By.id("state")).sendKeys("Uttarpradesh");
		driver.findElement(By.id("city")).sendKeys("Ghaziabad");
		driver.findElement(By.id("zipcode")).sendKeys("201017");
		driver.findElement(By.id("mobile_number")).sendKeys("8008000800");
		driver.findElement(By.xpath("(//*[text()=\"Create Account\"])")).click();
		
		String ActaualAccountcreated=driver.findElement(By.xpath("(//*[text()=\"Account Created!\"])")).getText();
		String ExpectedAccouuntCreated="ACCOUNT CREATED!";
		Assert.assertEquals(ActaualAccountcreated, ExpectedAccouuntCreated);
		driver.findElement(By.xpath("(//*[text()=\"Continue\"])")).click();
		String ActaulLoggedin=driver.findElement(By.xpath("(//*[text()=\" Logged in as \"])")).getText();
		System.out.println(ActaulLoggedin);
		driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Continue Shopping\"]")).click();
		
		
	//	Assert.assertTrue(ActaulLoggedin.contains(UserName));
		driver.findElement(By.xpath("//a[text()=\" Cart\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Shopping Cart\"]")).isDisplayed();

		driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
		String ActualAddressDetails=driver.findElement(By.xpath("//h2[text()=\"Address Details\"]")).getText();
		String ExpectedAddressDetails="Address Details";
		Assert.assertEquals(ActualAddressDetails, ExpectedAddressDetails);
		String ActaulReviewOrder=driver.findElement(By.xpath("//h2[text()=\"Review Your Order\"]")).getText();
		String ExpectedReviewOrder="Review Your Order";
		Assert.assertEquals(ActaulReviewOrder,ExpectedReviewOrder);
		driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("Ashein");
		driver.findElement(By.xpath("//a[text()=\"Place Order\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"name_on_card\"]")).sendKeys("Testing123");
		driver.findElement(By.xpath("//input[@name=\"card_number\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name=\"cvc\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name=\"expiry_month\"]")).sendKeys("01");
		driver.findElement(By.xpath("//input[@name=\"expiry_year\"]")).sendKeys("1996");
		driver.findElement(By.xpath("//button[text()=\"Pay and Confirm Order\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\"Congratulations! Your order has been confirmed!\")]")).isDisplayed());
		driver.findElement(By.xpath("(//*[text()=\" Delete Account\"])")).click();
		String ActualDeletedVerify=driver.findElement(By.xpath("(//*[text()=\"Account Deleted!\"])")).getText();
		String ExpectedDeletedVerify="ACCOUNT DELETED!";
		Assert.assertEquals(ActualDeletedVerify, ExpectedDeletedVerify);
		driver.close();		
			}
	
	@Test
	public void LoginBeforeCheckout() throws InterruptedException {
		OpenWebSite();
		driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
		driver.findElement(By.xpath("(//*[@name=\"email\"])[1]")).sendKeys("test@12223.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//*[text()=\"Login\"]")).click();
		String ActaulLoggedin=driver.findElement(By.xpath("(//*[text()=\" Logged in as \"])")).getText();
		driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Continue Shopping\"]")).click();
		driver.findElement(By.xpath("//a[text()=\" Cart\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Shopping Cart\"]")).isDisplayed();	
		driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
		String ActualAddressDetails=driver.findElement(By.xpath("//h2[text()=\"Address Details\"]")).getText();
		String ExpectedAddressDetails="Address Details";
		Assert.assertEquals(ActualAddressDetails, ExpectedAddressDetails);
		String ActaulReviewOrder=driver.findElement(By.xpath("//h2[text()=\"Review Your Order\"]")).getText();
		String ExpectedReviewOrder="Review Your Order";
		Assert.assertEquals(ActaulReviewOrder,ExpectedReviewOrder);
		driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("Ashein");
		driver.findElement(By.xpath("//a[text()=\"Place Order\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"name_on_card\"]")).sendKeys("Testing123");
		driver.findElement(By.xpath("//input[@name=\"card_number\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name=\"cvc\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name=\"expiry_month\"]")).sendKeys("01");
		driver.findElement(By.xpath("//input[@name=\"expiry_year\"]")).sendKeys("1996");
		driver.findElement(By.xpath("//button[text()=\"Pay and Confirm Order\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\"Congratulations! Your order has been confirmed!\")]")).isDisplayed());
		driver.findElement(By.xpath("(//*[text()=\" Delete Account\"])")).click();
		String ActualDeletedVerify=driver.findElement(By.xpath("(//*[text()=\"Account Deleted!\"])")).getText();
		String ExpectedDeletedVerify="ACCOUNT DELETED!";
		Assert.assertEquals(ActualDeletedVerify, ExpectedDeletedVerify);
		driver.close();		

	}
	
	
	@Test
	public void RemoveProductFromCart() throws InterruptedException {
		OpenWebSite();
		driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Continue Shopping\"]")).click();
		driver.findElement(By.xpath("//a[text()=\" Cart\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Shopping Cart\"]")).isDisplayed();	
		driver.findElement(By.xpath("//a[@class=\"cart_quantity_delete\"]")).click();
		driver.findElement(By.xpath("//b[text()=\"Cart is empty!\"]")).isDisplayed();
	}
	
	@Test
	public void ViewCategoryProduct() throws InterruptedException {
		OpenWebSite();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("(//a[@data-parent=\"#accordian\"])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//h2[text()=\"Category\"]")).isDisplayed();
		driver.findElement(By.xpath("(//a[@data-parent=\"#accordian\"])[1]")).click();
		driver.findElement(By.xpath("(//a[text()=\"Dress \"])[1]")).click();
		driver.findElement(By.xpath("//h2[text()=\"Women - Dress Products\"]")).isDisplayed();
		driver.findElement(By.xpath("(//a[@data-parent=\"#accordian\"])[2]")).click();
		driver.findElement(By.xpath("(//a[text()=\"Tshirts \"])")).click();
		driver.findElement(By.xpath("//h2[text()=\"Men - Tshirts Products\"]")).isDisplayed();
	}
	
	@Test
	public void ViewandCartBrandProducts() {
		OpenWebSite();
		driver.findElement(By.xpath("//a[text()=\" Products\"]")).click();
		driver.findElement(By.xpath("//h2[text()=\"Brands\"]")).isDisplayed();
		driver.findElement(By.xpath("//a[text()=\"Polo\"]")).click();
		driver.getCurrentUrl().contains("brand_products/Polo");
		driver.findElement(By.xpath("//li[text()=\"Polo\"]")).isDisplayed();
		driver.findElement(By.xpath("//a[text()=\"H&M\"]")).click();
		driver.findElement(By.xpath("//li[text()=\"H&M\"]")).isDisplayed();
		driver.quit();
		}
	
	@Test
	public void SearchProductsandverifyCartAfterLogin() throws InterruptedException {
		OpenWebSite();
		driver.findElement(By.xpath("//a[text()=\" Products\"]")).click();
		driver.findElement(By.xpath("//h2[text()=\"All Products\"]")).isDisplayed();
		driver.findElement(By.xpath("//input[@placeholder=\"Search Product\"]")).sendKeys("top");
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		driver.findElement(By.xpath("//h2[text()=\"Searched Products\"]")).isDisplayed();
		driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();
		driver.findElement(By.xpath("(//*[text()='Blue Top'])[1]")).isDisplayed();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Continue Shopping\"]")).click();
		//driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();
		//driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		driver.findElement(By.xpath("//a[text()=\" Cart\"]")).click();
		driver.findElement(By.id("product-1")).isDisplayed();
		
		driver.findElement(By.xpath("//a[normalize-space(text()) = 'Signup / Login']")).click();
		String ActualVerifyLabelNewUserSignUp=driver.findElement(By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]")).getText();
		System.out.println(ActualVerifyLabelNewUserSignUp);
		String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
		Assert.assertEquals(ActualVerifyLabelNewUserSignUp, ExpectedVerifyLabelNewUserSignUp);
		driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("SPS");
		driver.findElement(By.xpath("(//*[@name=\"email\"])[2]")).sendKeys("SPS@xyz.com");
		driver.findElement(By.xpath("(//*[text()=\"Signup\"])")).click();
		String ActualVerifyEnterAccountInformation=driver.findElement(By.xpath("(//*[text()=\"Enter Account Information\"])")).getText();
		String ExpectedEnterAccountInformation="ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(ActualVerifyEnterAccountInformation, ExpectedEnterAccountInformation);
		driver.findElement(By.xpath("//input[@value='Mr']")).click();
		driver.findElement(By.id("password")).sendKeys("Ashwin");
		
		Select DropDownDay=new Select(driver.findElement(By.xpath("//select[@id='days']")));
		DropDownDay.selectByIndex(4);
		
		Select DropDownMonth=new Select(driver.findElement(By.id("months")));
		DropDownMonth.selectByIndex(2);
		
		Select DropDownYear= new Select(driver.findElement(By.id("years")));
		DropDownYear.selectByIndex(2);
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		
		
		driver.findElement(By.id("first_name")).sendKeys("Addtocart");
		driver.findElement(By.id("last_name")).sendKeys("Addtocart");
		driver.findElement(By.id("company")).sendKeys("XYZ");
		driver.findElement(By.id("address1")).sendKeys("XYZ");
		driver.findElement(By.id("address2")).sendKeys("XYZ1");
		
		
		Select DropDownCountry= new Select(driver.findElement(By.id("country")));
		DropDownCountry.selectByVisibleText("Canada");
		
		driver.findElement(By.id("state")).sendKeys("Uttarpradesh");
		driver.findElement(By.id("city")).sendKeys("Ghaziabad");
		driver.findElement(By.id("zipcode")).sendKeys("201017");
		driver.findElement(By.id("mobile_number")).sendKeys("8008000800");
		driver.findElement(By.xpath("(//*[text()=\"Create Account\"])")).click();
		
		String ActaualAccountcreated=driver.findElement(By.xpath("(//*[text()=\"Account Created!\"])")).getText();
		String ExpectedAccouuntCreated="ACCOUNT CREATED!";
		Assert.assertEquals(ActaualAccountcreated, ExpectedAccouuntCreated);
		driver.findElement(By.xpath("(//*[text()=\"Continue\"])")).click();
		String ActaulLoggedin=driver.findElement(By.xpath("(//*[text()=\" Logged in as \"])")).getText();
		System.out.println(ActaulLoggedin);
		driver.findElement(By.xpath("//a[text()=\" Cart\"]")).click();
		driver.findElement(By.id("product-1")).isDisplayed();	
		driver.quit();
	}
	
	@Test
	public void AddReview() {
		OpenWebSite();
		driver.findElement(By.xpath("//a[text()=\" Products\"]")).click();
		driver.findElement(By.xpath("//h2[text()=\"All Products\"]")).isDisplayed();
		driver.findElement(By.xpath("(//a[text()=\"View Product\"])[1]")).click();
		driver.findElement(By.id("name")).sendKeys("Heellllo");
		driver.findElement(By.id("email")).sendKeys("test@123.com");
		driver.findElement(By.xpath("//*[@placeholder=\"Add Review Here!\"]")).sendKeys("ReciewDone!");
		driver.findElement(By.id("button-review")).click();
		driver.findElement(By.xpath("//span[text()=\"Thank you for your review.\"]")).isDisplayed();	
		driver.quit();
	}
	
	@Test
	public void AddToCartFromRecommendedItems() {
		OpenWebSite();
		WebElement element=driver.findElement(By.xpath("//h2[text()=\"recommended items\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//h2[text()=\"recommended items\"]")).isDisplayed();
		//WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-button']"));
	    //addToCartButton.click();
        WebElement tile = driver.findElement(By.id("tileId"));

		Actions actions = new Actions(driver);

		actions.moveToElement(tile).click().build().perform();

		
	}
	
	@Test
	public void ScrollUpUsingArrowButton() throws InterruptedException {
		OpenWebSite();
		WebElement element=driver.findElement(By.xpath("//p[text()=\"Copyright © 2021 All rights reserved\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()=\"Copyright © 2021 All rights reserved\"]")).isDisplayed();

		driver.findElement(By.id("scrollUp")).click();
		driver.findElement(By.xpath("//h2[text()=\"Full-Fledged practice website for Automation Engineers\"]")).isDisplayed();
		driver.close();
	}
	
	@Test
	public void ScrollupwithoutArrowButton() throws InterruptedException {
		OpenWebSite();
		WebElement element=driver.findElement(By.xpath("//p[text()=\"Copyright © 2021 All rights reserved\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(5000);
		element=driver.findElement(By.xpath("//h2[text()=\"Full-Fledged practice website for Automation Engineers\"]"));
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//h2[text()=\"Full-Fledged practice website for Automation Engineers\"]")).isDisplayed();
		driver.close();
	}
	
	//recommended products-->//div[@class='recommended_items']/descendant::a[@class='btn btn-default add-to-cart']
}

