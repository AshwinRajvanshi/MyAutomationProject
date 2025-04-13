package MainPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {
	WebDriver driver;
	By ContactusPageXpath=By.xpath("//div[@class='shop-menu pull-right']/descendant::li[8]");
	By ContactUsLabelXpath=By.xpath("//div[@class='container']/descendant::h2[text()='Contact ']");
	By GetInTouchLabelXpath=By.xpath("//div[@class='container']/descendant::h2[text()='Get In Touch']");
	By EnterNameXpath=By.xpath("//form[@class=\"contact-form row\"]/child::div[1]");
	By EnterEmailXpath=By.xpath("//form[@class=\"contact-form row\"]/child::div[2]");
	By SubjectContactUsXpath=By.xpath("//form[@class=\"contact-form row\"]/child::div[3]");
	By MessgaeContactUSXpath=By.xpath("//form[@class=\"contact-form row\"]/child::div[4]");
	By UploadFile=By.xpath("//input[@type=\"file\"]");
	By SubmitButtonXpath=By.xpath("//form[@class=\"contact-form row\"]/child::div/input[@value='Submit']");
	By HomeXpath=By.xpath("//a[normalize-space(text())=\"Home\"]");
	String ActualURL="https://automationexercise.com/";
	String URL="https://automationexercise.com/";
	
	
	
	@Test
	public void ContactUsForm() {
		/*
		 * OpenWebSite();
		 * driver.findElement(By.xpath("//a[text()=\" Contact us\"]")).click(); String
		 * ActualGetinTouch=driver.findElement(By.xpath("//*[text()=\"Get In Touch\"]"))
		 * .getText(); String ExpectedGetInTouch="GET IN TOUCH";
		 * Assert.assertEquals(ActualGetinTouch, ExpectedGetInTouch);
		 * driver.findElement(By.
		 * xpath("//form[@class=\"contact-form row\"]/child::div[1]")).sendKeys("Ashwin"
		 * ); driver.findElement(By.
		 * xpath("//form[@class=\"contact-form row\"]/child::div[2]")).sendKeys(
		 * "test@123.com"); driver.findElement(By.
		 * xpath("//form[@class=\"contact-form row\"]/child::div[3]")).sendKeys(
		 * "Testing"); driver.findElement(By.
		 * xpath("//form[@class=\"contact-form row\"]/child::div[4]")).sendKeys(
		 * "Testing");
		 * //driver.findElement(By.xpath("//input[@type=\"file\"]")).click(); WebElement
		 * uploadFile = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		 * uploadFile.sendKeys(
		 * "C:\\Users\\AR104445\\eclipse-workspace\\AutomationExcercise\\src\\test\\java\\MainPage\\touch.txt"
		 * ); driver.findElement(By.
		 * xpath("//form[@class=\"contact-form row\"]/child::div/input[@value='Submit']"
		 * )).click();
		 * 
		 * Alert alert = driver.switchTo().alert(); alert.accept(); String
		 * ActualSuccessMessage= driver.findElement(By.
		 * xpath("//div[text()=\"Success! Your details have been submitted successfully.\"]"
		 * )).getText(); String
		 * ExpectedSuccessMessage="Success! Your details have been submitted successfully."
		 * ; Assert.assertEquals(ActualSuccessMessage, ExpectedSuccessMessage);
		 * driver.findElement(By.xpath("//span[text()=\" Home\"]")).click();
		 * driver.get(URL); String CurrentURL= driver.getCurrentUrl();
		 * Assert.assertEquals(CurrentURL, ActualURL); driver.close();
		 */

		//OpenWebSite();
		ClickOnContactUsPage();
		VerifyContactUsPage();
		EnterNameinContactUsPage();
		EnterEmailinContactUsPage();
		SubjectinContactUsPage();
		MessageInContactUsPage();
		chooseFileInContactUsPage();
		SubmitButtonInContactUsPage();
		AlertinContactUsPage();

	}

	@Test
	public void ClickOnContactUsPage() {
		driver.findElement(ContactusPageXpath).click();
	}

	public void VerifyContactUsPage() {
		driver.findElement(ContactUsLabelXpath).click();
		String ActualGetinTouch = driver.findElement(GetInTouchLabelXpath).getText();
		String ExpectedGetInTouch = "GET IN TOUCH";
		Assert.assertEquals(ActualGetinTouch, ExpectedGetInTouch);
	}

	public void EnterNameinContactUsPage() {
		driver.findElement(EnterNameXpath).sendKeys("Ashwin");

	}

	public void EnterEmailinContactUsPage() {
		driver.findElement(EnterEmailXpath).sendKeys("test@123.com");
	}

	public void SubjectinContactUsPage() {
		driver.findElement(SubjectContactUsXpath).sendKeys("Testing");
	}

	public void MessageInContactUsPage() {
		driver.findElement(MessgaeContactUSXpath).sendKeys("Testing");
	}

	public void chooseFileInContactUsPage() {
		WebElement uploadFile = driver.findElement(UploadFile);
		uploadFile.sendKeys("C:\\Users\\AR104445\\eclipse-workspace\\AutomationExcercise\\src\\test\\java\\MainPage\\touch.txt");
	}

	public void SubmitButtonInContactUsPage() {
		driver.findElement(SubmitButtonXpath).click();

	}

	public void AlertinContactUsPage() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String ActualSuccessMessage = driver
				.findElement(By.xpath("//div[text()=\"Success! Your details have been submitted successfully.\"]"))
				.getText();
		String ExpectedSuccessMessage = "Success! Your details have been submitted successfully.";
		Assert.assertEquals(ActualSuccessMessage, ExpectedSuccessMessage);
		driver.findElement(HomeXpath).click();
		driver.get(URL);
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, ActualURL);
		driver.close();
	}

}
