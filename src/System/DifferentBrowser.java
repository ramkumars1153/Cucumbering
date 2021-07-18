package System;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DifferentBrowser {
  @Test(priority = 1)
  public void OpenGoogle() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.close();
  }
  
  @Test(priority = 2)
  public void OpenFace() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.close();
  }
  
  @Test(priority = 3)
  public void OpenBing() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  driver.close();
  }
}
