package System;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
  @Test
  @Parameters("Name")
  public void ParameterTesting(String Name) {
	  System.out.println("Employee is "+Name);
  }
}
