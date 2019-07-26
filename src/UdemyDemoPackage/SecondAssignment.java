package UdemyDemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SecondAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.cleartrip.com/");

		Assert.assertTrue(driver.findElement(By.id("OneWay")).isSelected());

		WebElement Start = driver.findElement(By.id("FromTag"));
		Start.sendKeys("Hyd");
		Thread.sleep(2000);
		Start.sendKeys(Keys.ENTER);

		WebElement End = driver.findElement(By.id("ToTag"));
		End.sendKeys("Bang");
		Thread.sleep(3000);
		End.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//i[@class='icon ir datePicker']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();

		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByVisibleText("3");

		Select child = new Select(driver.findElement(By.id("Childrens")));
		child.selectByIndex(2);

		Select infant = new Select(driver.findElement(By.id("Infants")));
		infant.selectByVisibleText("1");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();

		Select cl = new Select(driver.findElement(By.id("Class")));
		cl.selectByVisibleText("Premium Economy");

		driver.findElement(By.cssSelector("input[name='airline']")).sendKeys("Indigo");

		driver.findElement(By.xpath("//input[@title='Search flights']")).click();

		//System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
