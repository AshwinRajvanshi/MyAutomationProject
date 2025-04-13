package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUpLogin {

	WebDriver driver;
	By LinkSignUpLogin=By.xpath("//a[normalize-space(text()) = 'Signup / Login']");
	By VerifyLabelNewUserSignUp= By.xpath("//h2[normalize-space(text())=\"New User Signup!\"]");
	By EnterUserName=By.xpath("//*[@name=\"name\"]");
	By EmailAddress= By.xpath("//div[@class='signup-form']/descendant::form/input[2]");
	By SignUpButton = By.xpath("//h2[text()=\"New User Signup!\"]/following-sibling::form/button");
	String UserName="Ashwin1";
	String Email="test11@xyz.com";
	By EnterAccountInformationLabel=By.xpath("(//*[text()=\"Enter Account Information\"])");
	By RadioButtonMR=By.xpath("//div[@class='login-form']/descendant::input[2]");
	By Password = By.id("password");
	By Day=By.id("days");
	By Months=By.id("months");
	By Years=By.id("years");
	By NewsletterCheckbox=By.id("newsletter");
	By Option=By.id("optin");
	By FirstName=By.id("first_name");
	By LastName=By.id("last_name");
	By Company=By.id("company");
	By Address1=By.id("address1");
	By Address2=By.id("address2");
	By Country=By.id("country");
	By State=By.id("state");
	By City=By.id("city");
	By Zipcode=By.id("zipcode");
	By MobileNumber=By.id("mobile_number");
	By CreateAccount=By.xpath("(//*[text()=\"Create Account\"])");
	By ContinueButton=By.xpath("(//*[text()=\"Continue\"])");
	By LoggedIn=By.xpath("(//*[text()=\" Logged in as \"])");
	By DeleteAccount=By.xpath("(//*[text()=\" Delete Account\"])");
	By AccountDeleted=By.xpath("(//*[text()=\"Account Deleted!\"])");
	By Login=By.xpath("//*[text()=\"Login\"]");



	
	public void NavigateToSignUpLoginPage(){
		 driver.findElement(LinkSignUpLogin).click();		
	}
	
	public void NewUserSignUP() {
		String ActualVerifyLabelNewUserSignUp=driver.findElement(VerifyLabelNewUserSignUp).getText();
		System.out.println(ActualVerifyLabelNewUserSignUp); 
		String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
		Assert.assertEquals(ActualVerifyLabelNewUserSignUp,
		ExpectedVerifyLabelNewUserSignUp);
		driver.findElement(EnterUserName).sendKeys(UserName);
		driver.findElement(EmailAddress).sendKeys(Email);
		driver.findElement(SignUpButton).click();
		String ActualVerifyEnterAccountInformation=driver.findElement(EnterAccountInformationLabel).getText(); 
		String ExpectedEnterAccountInformation="ENTER ACCOUNT INFORMATION";
		 Assert.assertEquals(ActualVerifyEnterAccountInformation,ExpectedEnterAccountInformation);
		 driver.findElement(RadioButtonMR).click();
		 driver.findElement(Password).sendKeys("Ashwin");
		 Select DropDownDay=new Select(driver.findElement(Day));
		 DropDownDay.selectByIndex(4);
		 Select DropDownMonth=new Select(driver.findElement(Months));
		 DropDownMonth.selectByIndex(2);
		 Select DropDownYear= new Select(driver.findElement(Years));
		 DropDownYear.selectByIndex(2);
		 driver.findElement(NewsletterCheckbox).click();
		 driver.findElement(Option).click();
		 driver.findElement(FirstName).sendKeys("Test");
		 driver.findElement(LastName).sendKeys("Tester");
		 driver.findElement(Company).sendKeys("XYZ");
		 driver.findElement(Address1).sendKeys("XYZ");
		 driver.findElement(Address2).sendKeys("XYZ1");
		 Select DropDownCountry= new Select(driver.findElement(Country));
		 DropDownCountry.selectByVisibleText("Canada");
		 driver.findElement(State).sendKeys("Uttarpradesh");
		 driver.findElement(City).sendKeys("Ghaziabad");
		 driver.findElement(Zipcode).sendKeys("201017");
		 driver.findElement(MobileNumber).sendKeys("8008000800");
		 driver.findElement(CreateAccount).click();
		 String ActaualAccountcreated=driver.findElement(CreateAccount).getText(); 
		 String ExpectedAccouuntCreated="ACCOUNT CREATED!";
		 Assert.assertEquals(ActaualAccountcreated, ExpectedAccouuntCreated);
		 driver.findElement(ContinueButton).click();
		 String ActaulLoggedin=driver.findElement(LoggedIn).getText(); 
		 System.out.println(ActaulLoggedin);
		 Assert.assertTrue(ActaulLoggedin.contains(UserName));
		 driver.findElement(DeleteAccount).click();
		String ActualDeletedVerify=driver.findElement(AccountDeleted).getText(); 
		String ExpectedDeletedVerify="ACCOUNT DELETED!";
		Assert.assertEquals(ActualDeletedVerify, ExpectedDeletedVerify);
	}
	
	public void ExistingUserLogin() {
		String ActualVerifyLabelNewUserSignUp=driver.findElement(VerifyLabelNewUserSignUp).getText();
		System.out.println(ActualVerifyLabelNewUserSignUp); 
		String ExpectedVerifyLabelNewUserSignUp="New User Signup!";
		Assert.assertEquals(ActualVerifyLabelNewUserSignUp,
		ExpectedVerifyLabelNewUserSignUp);
		driver.findElement(EnterUserName).sendKeys(UserName);
		driver.findElement(EmailAddress).sendKeys(Email);
		driver.findElement(SignUpButton).click();
		String ActualVerifyEnterAccountInformation=driver.findElement(EnterAccountInformationLabel).getText(); 
		String ExpectedEnterAccountInformation="ENTER ACCOUNT INFORMATION";
		 Assert.assertEquals(ActualVerifyEnterAccountInformation,ExpectedEnterAccountInformation);
		 driver.findElement(RadioButtonMR).click();
		 driver.findElement(Password).sendKeys("Ashwin");
		 Select DropDownDay=new Select(driver.findElement(Day));
		 DropDownDay.selectByIndex(4);
		 Select DropDownMonth=new Select(driver.findElement(Months));
		 DropDownMonth.selectByIndex(2);
		 Select DropDownYear= new Select(driver.findElement(Years));
		 DropDownYear.selectByIndex(2);
		 driver.findElement(NewsletterCheckbox).click();
		 driver.findElement(Option).click();
		 driver.findElement(FirstName).sendKeys("Test");
		 driver.findElement(LastName).sendKeys("Tester");
		 driver.findElement(Company).sendKeys("XYZ");
		 driver.findElement(Address1).sendKeys("XYZ");
		 driver.findElement(Address2).sendKeys("XYZ1");
		 Select DropDownCountry= new Select(driver.findElement(Country));
		 DropDownCountry.selectByVisibleText("Canada");
		 driver.findElement(State).sendKeys("Uttarpradesh");
		 driver.findElement(City).sendKeys("Ghaziabad");
		 driver.findElement(Zipcode).sendKeys("201017");
		 driver.findElement(MobileNumber).sendKeys("8008000800");
		 driver.findElement(CreateAccount).click();
		 String ActaualAccountcreated=driver.findElement(CreateAccount).getText(); 
		 String ExpectedAccouuntCreated="ACCOUNT CREATED!";
		 Assert.assertEquals(ActaualAccountcreated, ExpectedAccouuntCreated);
		 driver.findElement(ContinueButton).click();
		 String ActaulLoggedin=driver.findElement(LoggedIn).getText(); 
		 System.out.println(ActaulLoggedin);
		 Assert.assertTrue(ActaulLoggedin.contains(UserName));
		 		
		driver.findElement(EmailAddress).sendKeys(Email);
		driver.findElement(Password).sendKeys("Ashwin");
		driver.findElement(Login).click();
		driver.findElement(DeleteAccount).click();
		String ActualDeletedVerify=driver.findElement(AccountDeleted).getText(); 
		String ExpectedDeletedVerify="ACCOUNT DELETED!";
		Assert.assertEquals(ActualDeletedVerify, ExpectedDeletedVerify);

	}
}
