package UdemyDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://patrickhlauke.github.io/recaptcha/");
		int m = framecount(driver, By.xpath("/html/body/div[1]/div/div/iframe"));

		driver.switchTo().frame(m);

		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click();

		driver.switchTo().defaultContent();

	}

	public static int framecount(WebDriver driver, By by)

	{
		driver.switchTo().defaultContent();

		int i;

		int framecount = driver.findElements(By.tagName("iframe")).size();

		System.out.println(framecount);

		for (i = 0; i < framecount; i++)

		{

			driver.switchTo().frame(i);

			int itemcount = driver.findElements(by).size();

			if (itemcount > 0)

			{

				break;

			} else

			{

				System.out.println("Continue");

			}

			driver.switchTo().defaultContent();

		}

		driver.switchTo().defaultContent();

		return i;

	}
}