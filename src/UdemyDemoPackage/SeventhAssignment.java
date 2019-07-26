package UdemyDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeventhAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		int i = 1;
		while (!text.equalsIgnoreCase("India")) {
			i++;
			driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) 
			{
				break;
			}
			
		}

		System.out.println("--------------------");
		 
		if (i > 10)
		{
			System.out.println("Country not found");
		} else
		{
			System.out.println("Country selected : "+text);
		}

	}

}
