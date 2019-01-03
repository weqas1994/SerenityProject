package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class DashboardPage extends BaseClass {

	public DashboardPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='main-search']")
	public static WebElement mainSearch;

	@FindBy(xpath = "//input[@id='firstNameSearch']")
	public static WebElement FirstName;

	public static By Search = (By.xpath("//input[@id='main-search']"));

	public void getTitleOfCurrentPage() {
		driver.getTitle();
	}

}
