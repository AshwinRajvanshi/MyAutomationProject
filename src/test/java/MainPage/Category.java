package MainPage;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Category {

	
	ChromeDriver driver=new ChromeDriver();
	
	By CategoryLabel=By.xpath("//div[@class=\"left-sidebar\"]/descendant::h2[1]");
	By BrandLabel=By.xpath("//div[@class=\"left-sidebar\"]/descendant::h2[2]");
	By CategoryListWomen=By.xpath("//div[@class=\"panel-group category-products\"]/descendant::h4[1]");
	By CategoryListMen=By.xpath("//div[@class=\"panel-group category-products\"]/descendant::h4[2]");
	By CategoryListKids=By.xpath("//div[@class=\"panel-group category-products\"]/descendant::h4[3]");
	By BrandPolo = By.xpath("//div[@class=\"brands-name\"]/descendant::ul/li[1]");
	By BrandHandM = By.xpath("//div[@class=\"brands-name\"]/descendant::ul/li[2]");
	By BrandMadame = By.xpath("//div[@class=\"brands-name\"]/descendant::ul/li[3]");
	By BrandMastandHarbour = By.xpath("//div[@class=\"brands-name\"]/descendant::ul/li[4]");
	By BrandBabyHub = By.xpath("//div[@class=\"brands-name\"]/descendant::ul/li[5]");
	By BrandAllenSollyJunior = By.xpath("//div[@class=\"brands-name\"]/descendant::ul/li[6]");
	By BrandKookiekids = By.xpath("//div[@class=\"brands-name\"]/descendant::ul/li[7]");
	By BrandBiBa= By.xpath("//div[@class=\"brands-name\"]/descendant::ul/li[8]");
	By ExpandWomenCategoryDress=By.xpath("//div[@class=\"panel-body\"]/descendant::ul/li/a[1]");
	By ExpandWomenCategoryTops=By.xpath("//div[@class=\"panel-body\"]/descendant::ul/li/a[2]");
	By ExpandWomenCategorySaree=By.xpath("//div[@class=\"panel-body\"]/descendant::ul/li/a[3]");
	By ExpandMenCategoryTshirts=By.xpath("//div[@class=\"panel-body\"]/descendant::ul/li/a[4]");
	By ExpandMenCategoryJeans=By.xpath("//div[@class=\"panel-body\"]/descendant::ul/li/a[5]");
	By ExpandKidsCategoryDress=By.xpath("//div[@class=\"panel-body\"]/descendant::ul/li/a[6]");
	By ExpandKidsCategoryTopsandSaree=By.xpath("//div[@class=\"panel-body\"]/descendant::ul/li/a[7]");
	
	public void CategoryList() {
		driver.navigate().to("https://automationexercise.com/");
		driver.findElement(CategoryListWomen).getText();
		driver.findElement(CategoryListMen).getText();
		driver.findElement(CategoryListKids).getText();

	}
	
	public void ExpandCategoryList() {
		driver.findElement(CategoryListWomen).click();
		driver.findElement(ExpandWomenCategoryDress).isDisplayed();
		driver.findElement(ExpandWomenCategoryTops).isDisplayed();
		driver.findElement(ExpandWomenCategorySaree).isDisplayed();
		driver.findElement(CategoryListMen).click();
		driver.findElement(ExpandMenCategoryTshirts).isDisplayed();
		driver.findElement(ExpandMenCategoryJeans).isDisplayed();
		driver.findElement(CategoryListKids).click();
		driver.findElement(ExpandKidsCategoryDress).isDisplayed();
		driver.findElement(ExpandKidsCategoryTopsandSaree).isDisplayed();

	}
	
	
	
	public void ViewCategoryProduct() {
		driver.findElement(BrandPolo).isDisplayed();
		driver.findElement(BrandHandM).isDisplayed();
		driver.findElement(BrandMadame).isDisplayed();
		driver.findElement(BrandMastandHarbour).isDisplayed();
		driver.findElement(BrandBabyHub).isDisplayed();
		driver.findElement(BrandAllenSollyJunior).isDisplayed();
		driver.findElement(BrandKookiekids).isDisplayed();
		driver.findElement(BrandBiBa).isDisplayed();

	}
	
		

		
		public void BrandLabel() {
			driver.findElement(BrandLabel).getText();
		}
	
		
}
