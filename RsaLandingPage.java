package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RsaLandingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		//To avoid hard coding
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		// Assert is a class. It accesses method named assertEquals(actual,expected)
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");//Used concatenation in Java to use string with variables
		//<div class="login-container"><h2>Hello rahul,</h2><h1>Welcome to <strong style="color: rgb(255, 75, 43);">Rahul Shetty </strong>Academy</h1><p style="color: rgb(27, 179, 102); font-size: 18px; text-align: center;">You are successfully logged in.</p><button class="logout-btn">Log Out</button></div>
		//Finding child element by parent element using cssSelector
	}

}
