package UdemyDemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyXpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://qaclickacademy.com/");
		
		driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//section/div/div/div/div/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"tablist1-panel2\"]/ul/li/div/h3[1]/i[1]")).click();
        driver.findElement(By.xpath("//a [text()='Home']")).click();     
        
        
        
        
        
        
        
	}

}
