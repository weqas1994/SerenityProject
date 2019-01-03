$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/ManifestLandingPage.feature");
formatter.feature({
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 5888478200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Check LandingPage is open",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Toggle Search Manifest is open",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Select SCAC Manifest",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Enter Manifest Number",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Select Trip Status",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Select Filing Status",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Enter Port of Arrival",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click on Manifested button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Enter First Name",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Enter Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Enter Fast Number",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "i enter Vehicle Number",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I Enter From Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Enter To Date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I Click Manifested",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click Search Manifests",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinition.check_LandingPage_is_open()"
});
formatter.result({
  "duration": 110331300,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.toggle_Search_Manifest_is_open()"
});
formatter.result({
  "duration": 26100,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.i_Select_SCAC_Manifest()"
});
formatter.result({
  "duration": 35756300,
  "error_message": "java.lang.ExceptionInInitializerError\r\n\tat stepDefinition.StepsDefinition.i_Select_SCAC_Manifest(StepsDefinition.java:33)\r\n\tat ✽.And I Select SCAC Manifest(src/test/resources/Features/ManifestLandingPage.feature:10)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//label[contains (text(), \u0027SCAC Manifest\u0027)]/preceding::select\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-QV51M3L\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\UNCLEA~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:63447}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 8a06b12c75461a00410f1a8588dc7357\n*** Element info: {Using\u003dxpath, value\u003d//label[contains (text(), \u0027SCAC Manifest\u0027)]/preceding::select}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat pagesPackage.ManifestLandingPage.\u003cclinit\u003e(ManifestLandingPage.java:24)\r\n\tat stepDefinition.StepsDefinition.i_Select_SCAC_Manifest(StepsDefinition.java:33)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:367)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:274)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:161)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:290)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:242)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinition.enter_Manifest_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_Select_Trip_Status()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_Select_Filing_Status()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.enter_Port_of_Arrival()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_click_on_Manifested_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_Enter_First_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_Enter_Last_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_Enter_Fast_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_enter_Vehicle_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_Enter_From_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_Enter_To_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_Click_Manifested()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinition.i_click_Search_Manifests()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 19500,
  "status": "passed"
});
});