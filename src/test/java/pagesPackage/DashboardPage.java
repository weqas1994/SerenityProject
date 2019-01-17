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

	@FindBy(xpath = "//a[@href='/dashboard']")
	public static WebElement DastboardTab;
	public static By DashboardTabBy = (By.xpath("//a[@href='/dashboard']"));
	// --------^^^This is Dashboard Tab button to navigate to DashboardPage^^^-----

	@FindBy(xpath = "//span[@class='cbpBrand']")
	public static WebElement CBPGlobalHeaderForTradePortal;
	public static By CBPGlobalHeaderForTradePortalBy = (By.xpath("//span[@class='cbpBrand']"));
	// -------^^^^^This is the header for U.S. Customs&Border^^^^^^^ --------------

	@FindBy(xpath = "//span[@class='cbpSubBrand']")
	public static WebElement USDepartmentOfHomelandSecurity;
	public static By USDepartmentOfHomelandSecurityBy = (By.xpath("//span[@class='cbpSubBrand']"));
	// ---------^^^Header US Department of Homeland Security text under customs and
	// border

	@FindBy(xpath = "//div[@class='profileCardRow']//div[contains(text(), 'Crews')]")
	public static WebElement CrewCardFull;
	public static By CrewCardFullBy = (By.xpath("//div[@class='profileCardRow']//div[contains(text(), 'Crews')]"));
	//------^^^This is Crew Card text
	
	@FindBy(xpath = "//div[@class='profileCardRow']//div[contains(text(), 'Shipppers')]")
	public static WebElement ShippersCardFull;
	public static By ShippersCardFullBy = (By.xpath("//div[@class='profileCardRow']//div[contains(text(), 'Consignees')]"));
	//------^^^^This is Shippers Card text
	
	@FindBy(xpath = "//div[@class='profileCardRow']//div[contains(text(), 'Consignees')]")
	public static WebElement ConsigneesCardFull;
	public static By ConsigneesCardFullBy = (By.xpath("//div[@class='profileCardRow']//div[contains(text(), 'Crews')]"));
	//------^^^This is ConsigneesCard text
	
	@FindBy(xpath = "//div[@class='profileCardRow']//div[contains(text(), 'Conveyances')]")
	public static WebElement ConveyancesCardFull;
	public static By ConveyancesCardFullBy = (By.xpath("//div[@class='profileCardRow']//div[contains(text(), 'Conveyances')]"));
	//------^^^^This is Conveyances Card text
	
	@FindBy(xpath = "//div[@class='profileCardRow']//div[contains(text(), 'Equipment')]")
	public static WebElement EquipmentCardFull;
	public static By EquipmentCardFullBy = (By.xpath("//div[@class='profileCardRow']//div[contains(text(), 'Equipment')]"));
	//------^^^This is Equipment Card text
	
	//@FindBy(xpath="//div[@class='mat-slider-thumb']")
	//public static WebElement slider=	driver.findElement(By.xpath("//div[@class='mat-slider-thumb']"));
	public static By sliderBy=(By.xpath("//div[@class='mat-slider-thumb']"));
	//------^^^This is for the slider button to drag 
	
	@FindBy(xpath="//div[@class='dataCardTitleContainer']//div[contains(text(), 'Manifest')]")
	public static WebElement ManifestCardHeader;
	public static By ManifestCardHeaderBy=(By.xpath("//div[@class='dataCardTitleContainer']//div[contains(text(), 'Manifest')]"));
	//------^^this is manifest card header
	
	@FindBy(xpath="//div[@class='dataCardTitleContainer']//div[contains(text(), 'Bills of Lading')]")
	public static WebElement BillsOfLadingCardHeader;
	public static By BillsOfLadingCardHeaderBy=(By.xpath("//div[@class='dataCardTitleContainer']//div[contains(text(), 'Bills of Lading')]"));
	//-----^^this is the bill of lading card
	
	@FindBy(xpath="//button[contains(text(), 'OK')]")
	public static WebElement UnableToLoadManifestButton;
	public static By UnableToLoadManifestButtonBy=(By.xpath("//button[contains(text(), 'OK')]"));
	//----^^this is the pop up for unable to load manifest button
	
	
	
	
}
