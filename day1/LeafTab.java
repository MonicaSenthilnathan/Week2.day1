package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTab {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the "CRM/SFA" link.
		driver.findElement(By.id("label")).click();
		//Click on Leads Button
		  driver.findElement(By.linkText("Leads")).click();
		  //Click on the Create Lead link from shortcuts.
		  driver.findElement(By.linkText("Create Lead")).click();
		  //Enter the mandatory fields on the web page.
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monicas");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("L.Ss");
		  //Select Employee in the source dropdown (using index)
		  WebElement employeeWE=driver.findElement(By.name("dataSourceId"));
			Select employeeDD=new Select(employeeWE);
			employeeDD.selectByIndex(4);
		  // Select Automobile in the Marketing Campaign (using visibleText)
			WebElement marketWE=driver.findElement(By.name("marketingCampaignId"));
			Select marketDD=new Select(marketWE);
			marketDD.selectByVisibleText("Automobile");
		  // Select Corporation in Ownership (using value)
			WebElement ownerWE=driver.findElement(By.name("ownershipEnumId"));
			Select ownerDD=new Select(ownerWE);
			ownerDD.selectByValue("OWN_CCORP");
		  // Click on the Create Lead button.
			driver.findElement(By.name("submitButton")).click();
		  // Verify the title of the current web page.
			System.out.println("Title Name:"+driver.getTitle());
		  // Close the browser window.
			driver.close();


	}

}
