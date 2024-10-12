package introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RsaLogInValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("ahmedzaman.069@gmail.com");
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		driver.findElement(By.name("inputPassword")).sendKeys("hello");
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//Here the cssSelector has been constructed using "tagname.id"
		driver.findElement(By.linkText("Forgot your password?")).click();
		//<a href="#">Forgot your password?</a>
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pranta");
		//<input type="text" placeholder="Name">; A xpath can be "//input[@placeholder='Name']"
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ahmedzaman.069@gmail.com");
		//<input type="text" placeholder="Email">; Constructed cssSelector using "tagname[attribute='value']"
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//Customized xPath using //tagname[attribute='value'][index]
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("mangoahmed.69@gmail.com");
		//Customized cssSelector using tagname[attribute='value']:nth-child(index+1) ; (index+1) for possibility of hidden element(check using console by $('attribute="value"))
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("01851207570");
		//Constructed xPath using syntax "//parentTagName/childTagName[index]
		driver.findElement(By.className("reset-pwd-btn")).click();
		//<button class="reset-pwd-btn">Reset Login</button>
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		//<p class="infoMsg">Please use temporary password 'rahulshettyacademy' to Login. </p>
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//<div class="forgot-pwd-btn-conainer"><button class="go-to-login-btn">Go to Login</button><button class="reset-pwd-btn">Reset Login</button></div>
		//Here customized xPath have been used(//parentTagName[@attribute='value']/childTagName[index])
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		//<input type="password" placeholder="Password" name="inputPassword" value=""> ; Using partial value of attribute(RegEx); Here (*) has been used after attribute
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//<button class="submit signInBtn" type="submit">Sign In</button> ; Using partial value of attribute (RegEx) while locator is cssSelector; Here [contains()] has been used
		driver.findElement(By.id("chkboxOne")).click();
		//<input type="checkbox" id="chkboxOne" name="chkboxOne" value="rmbrUsername">
		driver.findElement(By.id("chkboxTwo")).click();
		//<input type="checkbox" id="chkboxTwo" name="chkboxTwo" value="agreeTerms">
		
	}

}
