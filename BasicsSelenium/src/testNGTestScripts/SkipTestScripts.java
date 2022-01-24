package testNGTestScripts;

import org.testng.annotations.Test;

public class SkipTestScripts {

	@Test(priority = 1)
	public void firstTestCase() {
		System.out.println("This is my first test case");
	}                                                                     //priority value should be used to set the priority for the order of execution or set the alphabetical order of method name 
	                                                                      //aFirstTestCAse-->bSecondTestCase-->cThirdtestCase-->dFourthTestCase-->eFifthTestCase
	@Test(priority = 2,enabled=false)                                                   //Skip Test Cases --> Use --> (Enabled)-->Boolean-->(Enabled=false)-->default itself it is enabled = True
	public void secondTestCase() {
		System.out.println("This is my Second test case");
	}
	
	@Test(priority = 3)
	public void thirdTestCase() {
		System.out.println("This is my Third test case");
	}
	
	@Test(priority = 4,enabled=false)
	public void fourthTestCase() {
		System.out.println("This is my Fourth test case");
	}
	
	@Test(priority = 5)
	public void fifthTestCase() {
		System.out.println("This is my Fifth test case");
	}
}
