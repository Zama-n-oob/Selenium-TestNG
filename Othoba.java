package introduction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Othoba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.othoba.com/login");
		driver.findElement(By.linkText("Forgot password?")).click();
		//<a href="/passwordrecovery">Forgot password?</a>
		Thread.sleep(2000);
		driver.findElement(By.id("EmailOrPhone")).sendKeys("01851207570");
		//<input class="form-control" autofocus="autofocus" type="text" id="EmailOrPhone" name="EmailOrPhone" value="">
		driver.findElement(By.name("send-email")).click();
		//<button type="submit" name="send-email" class="btn btn-primary">Recover</button>
		Thread.sleep(2000);
		System.out.println("Expected result:Phone number not found");
		System.out.println("Actual result:"+driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"Phone Number not found");
		
	}

}
