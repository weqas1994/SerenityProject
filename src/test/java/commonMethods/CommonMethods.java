package commonMethods;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import basePackage.BaseClass;

public class CommonMethods extends BaseClass {

	public static void clickMethods(WebElement element) {
		element.click();

	}

	public static void actionMethods(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("")));
	}

	public static void selectMethod(WebElement elements, String value) throws InterruptedException {
		Select sel = new Select(elements);
		Thread.sleep(2000);
		sel.selectByValue(value);
	}

	public static void selectByValue() {

	}

	public static void selectMethodindex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public static void selectMethodtext(WebElement element, String visableText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visableText);
	}

	public static void ExplicitWaitClick(By xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
	}

	public static void ExplicitWaitText(By xpath, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).sendKeys(text);
	}

	public static void enterText(WebElement text, String texts) throws InterruptedException {
		// Thread.sleep(2000);
		// text.wait(3000);

		text.sendKeys(texts);
	}

	public static void enterText(WebElement text) {

	}

	public static void WebdriverWait(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void WebdriverWait(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
		;
	}

	public static void enterText(Object sendKeys) {
		// WebElement text;
		// sendKeys=text;
		// sendKeys

	}
	// ----------------------------------------------------------------------------------------------------------------
	// These are Helper Methods for me
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].click();", loginButton);
	// js.executeScript("arguments[0].scrollIntoView(true);",
	// ManifestLandingPage.manifestNumber);
	// ----------------------------------------------------------------------------------------------------------------
}
