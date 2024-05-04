package assignmentOne;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
				
		String title = driver.getTitle();
		
		System.out.println(title);
		
		WebElement radioButton =  driver.findElement(By.id("vfb-7-1"));
		radioButton.click();
		
		WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
		checkBox2.click();
		WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));
		checkBox3.click();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Select countryDropDown = new Select(driver.findElement(By.name("country")));	
		countryDropDown.selectByVisibleText("KUWAIT");
		
		driver.close();
	}

}
