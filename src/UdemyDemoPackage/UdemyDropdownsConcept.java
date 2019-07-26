package UdemyDemoPackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyDropdownsConcept {

	public static void main(String[] args) throws InterruptedException {
		// Auto selection Dropdowns
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.happyeasygo.com");

		driver.findElement(By.xpath(" //*[@id=\"couShareModal\"]/div/div/div[1]/a")).click();

		WebElement Start = driver.findElement(By.id("D_city"));

		Start.clear();
		Thread.sleep(1000);
		Start.sendKeys("Hyd");
		Thread.sleep(1000);
		Start.sendKeys(Keys.ENTER);

		WebElement End = driver.findElement(By.id("A_city"));

		End.clear();
		Thread.sleep(1000);
		End.sendKeys("Bang");
		Thread.sleep(1000);
		End.sendKeys(Keys.ARROW_DOWN);
		End.sendKeys(Keys.ENTER);

	}

}
