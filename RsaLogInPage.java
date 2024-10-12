package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RsaLogInPage {

	public static void main(String[] args) {
		// invoke browser
		//WebDriver methods + class methods
		//By default Selenium Manager will invoke(slower execution) 
		//For faster execution use System.setProperty("webdriver","chromedriver path") - a key:value pair method
		WebDriver driver = new ChromeDriver();
		//get the title of a page
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		//check if the right url is hitting
		System.out.println(driver.getCurrentUrl());
		//We have to close driver method after finishing execution of test to save resources
		driver.close();
		//difference between driver.quit() and driver.close() : close() only closes the current window, but quit() closes all associated window which got opened during selenium test execution
		//if our script has multiple windows during execution we've to choose quit()
	}

}
