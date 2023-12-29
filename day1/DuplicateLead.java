package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.id("label")).click();
		//Click on Leads Button
		  driver.findElement(By.linkText("Leads")).click();
		// Click on Create Lead 
		  driver.findElement(By.linkText("Create Lead")).click();
		  //Enter CompanyName Field Using id Locator
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		  // Enter FirstName Field Using id Locator
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monica");
		  // Enter LastName Field Using id Locator
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("L.S");
		  //Enter FirstName(Local) Field Using id Locator
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mini");
		//Enter Department Field Using any Locator of Your Choice
		  driver.findElement(By.name("departmentName")).sendKeys("Information Technology");
		  // Enter Description Field Using any Locator of your choice 
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Personal Information");
		  // Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.name("primaryEmail")).sendKeys("monica.lsm123@gmail.com");
		  // Click on Create Button
		  driver.findElement(By.name("submitButton")).click();
		  //Get the Title of Resulting Page using driver.getTitle()
		  System.out.println("Title Name:"+driver.getTitle());
          // Click on Duplicate button
		  driver.findElement(By.linkText("Duplicate Lead")).click();
          // Clear the CompanyName Field using .clear() And Enter new CompanyName
		  WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
		  companyName.clear();
		  companyName.sendKeys("Infosys");
          //Clear the FirstName Field using .clear() And Enter new FirstName
		  WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		  firstName.clear();
		  firstName.sendKeys("Varunavi");
		  //Click on Create Lead Button
		  driver.findElement(By.name("submitButton")).click();
          // Get the Title of Resulting Page using driver.getTitle()
		  System.out.println("Title Name:"+driver.getTitle());

	}

}
