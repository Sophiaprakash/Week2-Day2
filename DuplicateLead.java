package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sophiaprakash06@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(5000);
		driver.close();
		
		 
		
				// 
	
		
		
		
		
		 
		
		
	

	}

}
