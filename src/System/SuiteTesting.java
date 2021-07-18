package System;

import org.testng.annotations.Test;

public class SuiteTesting {
  @Test(groups= {"Mobile"})
  public void Apple() {
	  System.out.println("Apple1");
  }
  
  @Test(groups= {"Mobile"})
  public void Vivo() {
	  System.out.println("Vivo");
  }
  
  @Test(groups= {"Mobile"})
  public void Lenovo() {
	  System.out.println("Lenovo");
  }
  
  @Test(groups= {"Laptop"})
  public void HP() {
	  System.out.println("HP");
  }
  
  @Test(groups= {"Laptop"})
  public void Dell() {
	  System.out.println("Dell");
  }
}
