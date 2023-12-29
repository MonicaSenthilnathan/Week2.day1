package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
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
		// Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		// Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		// Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("Sonussassn");
		// Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		// Select "ComputerSoftware" as the industry.
		WebElement industryWE=driver.findElement(By.name("industryEnumId"));
		Select industryDD=new Select(industryWE);
		industryDD.selectByIndex(3);
		// Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownerWE=driver.findElement(By.name("ownershipEnumId"));
		Select ownerDD=new Select(ownerWE);
		ownerDD.selectByVisibleText("S-Corporation");
	    //Select "Employee" as the source using SelectByValue.
		WebElement employeeWE=driver.findElement(By.name("dataSourceId"));
		Select employeeDD=new Select(employeeWE);
		employeeDD.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketWE=driver.findElement(By.name("marketingCampaignId"));
		Select marketDD=new Select(marketWE);
		marketDD.selectByIndex(6);
		// Select "Texas" as the state/province using SelectByValue.
		WebElement stateWE=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateDD=new Select(stateWE);
		stateDD.selectByValue("TX");
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Thread.sleep(2000);
		// Verify that the account name is displayed correctly.
    //WebElement verifyWE=driver.findElement(By.className("requiredField"));
    //String text = verifyWE.getText();
    
    String text=driver.findElement(By.xpath("(//table[@class='fourColumnForm']/tbody/tr/td)[2]/span")).getText();
    System.out.println(text);
		//System.out.println("Verify Name:"+verifyWE.getText());
		//Close the browser window.
		//driver.close();
		

	}

}
