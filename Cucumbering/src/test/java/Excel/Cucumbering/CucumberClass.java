package Excel.Cucumbering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("New class is created by RAM");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().refresh();
		
		Boolean isenable = driver.findElement(By.xpath("")).isEnabled();
		System.out.println(isenable);
		
	}

}
