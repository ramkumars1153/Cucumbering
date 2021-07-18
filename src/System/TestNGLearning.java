package System;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TestNGLearning {
	WebDriver driver;

	@Test
	public void f() {
		
		WebElement InputField = driver.findElement(By.xpath(PageObject.LoginInput));
		InputField.sendKeys("ramkumars1153@gmail.com");

		WebElement PasswordField = driver.findElement(By.xpath(PageObject.PasswordInput));
		PasswordField.sendKeys("Police@100");
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//
//		Select option = new Select(PasswordField);
//		option.deselectAll();
//
//		driver.switchTo().frame(0);
//		driver.switchTo().defaultContent();
//
//		Actions action = new Actions(driver);

	}
	@BeforeTest
	public void beforeTest() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.testyou.in/Login.aspx");
	}

	@AfterTest
	public void afterTest() {
//		driver.close();
	}

}
