package testNGTestScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestScript {

	@Test
	@Parameters({"Name","Age"})
	public void printName(String name,int age) {
		System.out.println("Name is "+ name + " and His Age is " + age);
	}
}
