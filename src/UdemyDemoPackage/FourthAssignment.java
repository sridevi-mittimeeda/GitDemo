package UdemyDemoPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text() ='Multiple Windows']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		
		System.out.println("Parent Window Id : " + parentWindowId);

		String childWindowId = it.next();
		
		System.out.println("Child Window Id : " + childWindowId);
		
        String subChild = it.next();
		
		System.out.println("Child Window Id2 : " + subChild);

		driver.switchTo().window(subChild);
		
		System.out.println("-----------------------------");
			
		System.out.println("Child window pop up title : " + driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		driver.close();

		driver.switchTo().window(parentWindowId);
				
		System.out.println("Parent window pop up title : " + driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
