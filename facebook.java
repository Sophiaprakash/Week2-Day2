
package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Sophia");
		driver.findElement(By.name("lastname")).sendKeys("muthiah");
		driver.findElement(By.name("reg_email__")).sendKeys("+61468341877");
		driver.findElement(By.id("password_step_input")).sendKeys("sophia123");
		WebElement element = driver.findElement(By.id("day"));
		Select dd = new Select(element);
		dd.selectByIndex(5);
		WebElement element1 = driver.findElement(By.name("birthday_month"));
		Select dd1 = new Select(element1);
		dd1.selectByVisibleText("Sep");
		WebElement element2 = driver.findElement(By.name("birthday_year"));
		Select dd2 = new Select(element2);
		dd2.selectByVisibleText("1981");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
