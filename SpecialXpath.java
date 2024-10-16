package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//Traverse sibling to sibling xpath //parentTag/childTag(s)[index]/following-sibling::siblingTag[index]
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/a")).click();
		//Traverse to parent tag using child xpath //parentTag/childTag/parent::parentTag
	}

}
