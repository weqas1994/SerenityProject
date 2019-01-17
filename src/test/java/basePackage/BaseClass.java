package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.thucydides.core.annotations.Managed;

public class BaseClass {

	@Managed
	public static WebDriver driver;

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://localhost:4200/");

	}

	public static void tearDown() {

		driver.quit();
	}

}
