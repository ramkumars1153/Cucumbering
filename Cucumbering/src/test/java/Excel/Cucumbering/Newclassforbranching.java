package Excel.Cucumbering;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newclassforbranching {
	
	@Test()
	public void BranchingTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
	
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		String Text = "Ram is a super hero";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1];",searchbox,Text);
		Actions act = new Actions(driver);
		WebElement searchbox1 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbox1.clear();
		act.sendKeys(searchbox1,"Action is getting started");
		act.build().perform();
		if (driver.findElements(By.xpath("//input[@class='gLFyf gsfi']")).size()!=0) 
		{
			System.out.println("Element is present");
		} 
		else 
		{
			System.out.println("Element is NOT present");
		}
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).getSize();
	}
	

}
