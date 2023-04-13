package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[2]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sophia");
		driver.findElement(By.id("lastNameField")).sendKeys("Muthiah");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Devi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Muthu");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Automation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sophiaprakash06@gmail.com");
		WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(element);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])/a")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testing using Selenium");
		driver.findElement(By.xpath("(//tr//input[@name='submitButton'])[1]")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(5000);
		 driver.close();	
		
		
		
	}

}
