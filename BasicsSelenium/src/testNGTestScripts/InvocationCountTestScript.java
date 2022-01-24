package testNGTestScripts;

import org.testng.annotations.Test;

public class InvocationCountTestScript {
 @Test(invocationCount = 5)
 public void car() {
	 System.out.print("Vromm Vroom");
 }
}
