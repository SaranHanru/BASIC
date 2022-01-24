package testNGTestScripts;

import org.testng.annotations.Test;

public class DependenciesTestScripts {

	@Test() //if enabled = false means throws TestNG exception --> by default enabled = true so its runs test
	public void highSchool() {
		System.out.println("Passed High School");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("And Went to Higher Secondary and Passed Higher Secondary");
	}
	
	@Test(dependsOnMethods = "higherSecondary")
	public void college() {
		System.out.println("And Went to College and Passed College");
	}
	
}
