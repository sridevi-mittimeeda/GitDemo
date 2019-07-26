package UdemyDemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EighthAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://qaclickacademy.com/practice.php");

		WebElement table = driver.findElement(By.xpath("//*[@id=\"product\"]"));
		int rowcount = table.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr")).size();
		System.out.println("Number of rows in the table are : " + rowcount);

		int columncount = table.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/th")).size();
		System.out.println("Number of columns in the table are : " + columncount);

		System.out.println("*********************************");

		// This code display result in one line

		String RowDetails = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[3]")).getText();

		System.out.println("Second Row Details : " + RowDetails);

		// This code display result in list form

		System.out.println("*********************************");

		List<WebElement> secRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println("Second Row Details :");

		System.out.println(secRow.get(0).getText());

		System.out.println(secRow.get(1).getText());

		System.out.println(secRow.get(2).getText());

	}

}
