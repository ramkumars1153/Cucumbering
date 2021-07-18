package System;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("TestNG Testing");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/c/LearnAutomationOnline/playlists");
		driver.manage().window().maximize();
		

	}

}
