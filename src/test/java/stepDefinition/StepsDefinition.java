package stepDefinition;

import basePackage.BaseClass;
import commonMethods.CommonMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pagesPackage.DashboardPage;
import pagesPackage.ManifestLandingPage;

public class StepsDefinition extends BaseClass {

	@Given("^Check LandingPage is open$")
	public void check_LandingPage_is_open() throws Throwable {
		BaseClass.setUp();
		// Write code here that turns the phrase above into concrete actions
		ManifestLandingPage.getTitleOfCurrentPage();
		System.out.print(ManifestLandingPage.getTitleOfCurrentPage());
	}

	@Given("^Toggle Search Manifest is open$")
	public void toggle_Search_Manifest_is_open() throws Throwable {
		CommonMethods.clickMethodBy(ManifestLandingPage.ManifestTab);
		CommonMethods.explicitWaitByNoAction(ManifestLandingPage.UnabletoloadManifestTextBy);
		if (CommonMethods.elementISDisplayed(ManifestLandingPage.UnabletoloadManifestTextBy)) {
			CommonMethods.clickMethodBy(ManifestLandingPage.UnableToLoadManifestButtonBy);
			System.out.println("Pop up has appeared going to click on button");
		} else if (CommonMethods.elementISDisplayed(ManifestLandingPage.ScacManifestSelect)) {

		}

	}

	@Given("^I Select SCAC Manifest$")
	public void i_Select_SCAC_Manifest() throws Throwable {
		CommonMethods.selectMethodtextByVisableText(ManifestLandingPage.ScacManifestSelect, "Mexi");

	}

	@Given("^Enter Manifest Number$")
	public void enter_Manifest_Number() throws Throwable {
	
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// ManifestLandingPage.manifestNumber);

		// ManifestLandingPage.manifestNumber.sendKeys("123456677");
		// methods.enterText(ManifestLandingPage.manifestNumber);
		CommonMethods.enterTextBy(ManifestLandingPage.maniNumber, "12345556");
		// CommonMethods.WebdriverWait(ManifestLandingPage.maniNumber, "123456789");
	}

	@Given("^I Select Trip Status$")
	public void i_Select_Trip_Status() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		CommonMethods.selectMethodtextByVisableText(ManifestLandingPage.TripStatus, "Pre-arrival");
		// CommonMethods.selectMethodtextBy(ManifestLandingPage.TripStatus,
		// "Pre-arrival");
	}

	@Given("^I Select Filing Status$")
	public void i_Select_Filing_Status() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// CommonMethods.enterText(ManifestLandingPage.something("").);
	}

	@Then("^Enter Port of Arrival$")
	public void enter_Port_of_Arrival() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I click on Manifested button$")
	public void i_click_on_Manifested_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I Enter First Name$")
	public void i_Enter_First_Name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I Enter Last Name$")
	public void i_Enter_Last_Name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I Enter Fast Number$")
	public void i_Enter_Fast_Number() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^i enter Vehicle Number$")
	public void i_enter_Vehicle_Number() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I Enter From Date$")
	public void i_Enter_From_Date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I Enter To Date$")
	public void i_Enter_To_Date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I Click Manifested$")
	public void i_Click_Manifested() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I click Search Manifests$")
	public void i_click_Search_Manifests() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	// -------------^^^^^^This is ManfestLandingPage Steps^^^^

	// --------------DashboardLandingPage Steps

	@Given("^I click on Dashboard$")
	public void i_click_on_Dashboard() throws Throwable {
		BaseClass.setUp();
		CommonMethods.clickMethodBy(DashboardPage.DashboardTabBy);
	}

	@Given("^I see Crews$")
	public void i_see_Crews() throws Throwable {
		CommonMethods.explicitWaitByNoAction(DashboardPage.CrewCardFullBy);
		System.out.println(CommonMethods.getTextofElement(DashboardPage.CrewCardFullBy));

	}

	@Given("^I see Shippers$")
	public void i_see_Shippers() throws Throwable {
		CommonMethods.explicitWaitByNoAction(DashboardPage.ShippersCardFullBy);
		System.out.println(CommonMethods.getTextofElement(DashboardPage.ShippersCardFullBy));

	}

	@Given("^I see Consignee$")
	public void i_see_Consignee() throws Throwable {
		CommonMethods.explicitWaitByNoAction(DashboardPage.ConsigneesCardFullBy);
		System.out.println(CommonMethods.getTextofElement(DashboardPage.ConsigneesCardFullBy));
	}

	@Given("^I see Convayence$")
	public void i_see_Convayence() throws Throwable {

	}

	@Given("^I see Equipment$")
	public void i_see_Equipment() throws Throwable {

	}

	@And("^I drag and drop to day$")
	public void i_drag_and_drop_to_day() throws Throwable {
		int attemps = 0;
		while (attemps < 2) {
			try {
				// CommonMethods.explicitWaitByNoAction(DashboardPage.sliderBy);
				System.out.println(driver.getTitle());
				driver.getTitle();
				// driver.navigate().refresh();
				CommonMethods.actionMethodByDragAndDropSlider(DashboardPage.sliderBy, 200, 1000);
			} catch (Exception e) {
			}
			attemps++;
		}
	}
}
