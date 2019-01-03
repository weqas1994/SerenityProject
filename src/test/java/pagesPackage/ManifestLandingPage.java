package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class ManifestLandingPage extends BaseClass {

	public ManifestLandingPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//label[contains (text(), 'SCAC Manifest')]/preceding::select")
	public static WebElement SCACManifestSelect;

	public static By edit = (By.xpath("//input[@value='Edit']"));
	public static By ManifestSelect = (By.xpath("\"//label[contains (text(), 'SCAC Manifest')]/preceding::select\""));
	public static WebElement SCAC = driver.findElement(By.xpath("//label[contains (text(), 'SCAC Manifest')]/preceding::select"));

	// @FindBy(xpath="//input[@id='im1']")
	// public static WebElement ManifestNumber;

	public static By maniNumber = (By.xpath("//input[@id='im1']"));
	public static WebElement manifestNumber = driver.findElement(By.xpath("//input[@id='im1']"));

}
