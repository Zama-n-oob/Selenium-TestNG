package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Maximize the browser
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		//Navigating to a different window
		driver.navigate().back();
		//Navigate back to previous window
		driver.navigate().forward();
		//Navigate forward to next window of current window
	}

}
