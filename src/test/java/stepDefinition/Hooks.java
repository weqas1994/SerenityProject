package stepDefinition;

import basePackage.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void startUp() {
		BaseClass.setUp();
	}

	@After
	public void tearsDown() {
		// baseClass.tearDown();
	}

}
