package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Home {
	WebDriver driver;
	By CopyRight=By.xpath("//p[text()=\"Copyright © 2021 All rights reserved\"]");
	By FullFledged=By.xpath("//h2[text()=\"Full-Fledged practice website for Automation Engineers\"]");
	
	
	public void HomePage() {
		String ExpectedURL="https://automationexercise.com/";
		String URL="https://automationexercise.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String ActualURL= driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
		}
	
	public void ScrollUpUsingArrowButton() throws InterruptedException {
		WebElement element=driver.findElement(CopyRight);
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(5000);
		driver.findElement(CopyRight).isDisplayed();
		driver.findElement(By.id("scrollUp")).click();
		driver.findElement(FullFledged).isDisplayed();
		driver.close();
	}
	
}
