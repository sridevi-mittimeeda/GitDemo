package UdemyDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirdAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();

		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loader"))));

		System.out.println(driver.findElement(By.id("results")).getText());
	}

}
