package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class editLead {

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
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sophia");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a)[1]")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ABC");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			Thread.sleep(5000);
			driver.close();
			
							
	}

}
