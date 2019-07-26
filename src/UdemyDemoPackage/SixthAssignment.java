package UdemyDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SixthAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption2")).click();;
				
		String label = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
		
		System.out.println(label);
		    	
	    WebElement option = driver.findElement(By.id("dropdown-class-example"));
	    
		Select dropdown = new Select(option);
		 
		dropdown.selectByVisibleText(label);
		
		driver.findElement(By.id("name")).sendKeys(label);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String Alertmsg = driver.switchTo().alert().getText();
		
		if(Alertmsg.contains(label)) {
			System.out.println("Option is the same that we selected in the dropdown");
		}
		else
		{
			System.out.println("Options mis matched");
		}
	}

}
