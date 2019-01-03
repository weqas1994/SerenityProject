package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.ui.Select;

import basePackage.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pagesPackage.ManifestLandingPage;

public class StepsDefinition extends BaseClass {

	@Given("^Check LandingPage is open$")
	public void check_LandingPage_is_open() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^Toggle Search Manifest is open$")
	public void toggle_Search_Manifest_is_open() throws Throwable {

	}

	@Given("^I Select SCAC Manifest$")
	public void i_Select_SCAC_Manifest() throws Throwable {

		// WebElement thisELement = driver.findElement(By.xpath("//label[contains
		// (text(), 'SCAC Manifest')]/preceding::select"));
		Select sel = new Select(ManifestLandingPage.SCAC);
		sel.selectByValue("Mexi");
	}

	@Given("^Enter Manifest Number$")
	public void enter_Manifest_Number() throws Throwable {
		// CommonMethods methods = new CommonMethods();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ManifestLandingPage.manifestNumber);

		// ManifestLandingPage.manifestNumber.sendKeys("123456677");
		// methods.enterText(ManifestLandingPage.manifestNumber);
		// CommonMethods.enterText(ManifestLandingPage.ManifestNumber, "12345556");
		// CommonMethods.WebdriverWait(ManifestLandingPage.maniNumber, "123456789");
	}

	@Given("^I Select Trip Status$")
	public void i_Select_Trip_Status() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^I Select Filing Status$")
	public void i_Select_Filing_Status() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

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

}
