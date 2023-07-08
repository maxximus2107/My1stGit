package launchBrowser;

import org.openqa.selenium.By;

//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Scanner snc = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		
		//Launch Chrome
		driver.get("https://www.google.com/");
		//fetch web site
		driver.manage().window().maximize();
		//type selenium
		driver.findElement(By.name("q")).sendKeys("selenium");
		//Click search button
		//driver.findElement(By.name("btnK")).click();
		//Close browser
		Thread.sleep(5000);
		driver.close();
	}

}
