package UdemyDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthAssignment {

	public static void main(String[] args){
		 
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		System.out.println(driver.findElements(By.tagName("frameset")).size());

		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[1]")));

		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

		System.out.println("Middle Frame heading is : "+driver.findElement(By.id("content")).getText());

	}
}
