package testNGTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTestScript {
	String name = "Hanru";
	boolean value=true;
	
	@Test
	public void assertall() {
		
		/*
		 * if(name.equals("Hanru")) { System.out.println("it is equal"); } else {
		 * System.out.println("it is not equal"); }
		 */

		Assert.assertNotEquals(name, "HAnru");
		Assert.assertTrue(value,"This should be same");
		//Assert.assertFalse(value, "This should be not true");
		
	}
}
