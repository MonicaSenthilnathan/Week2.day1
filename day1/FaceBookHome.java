package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookHome {

	public static void main(String[] args) {
		ChromeDriver chrome= new ChromeDriver();  //to launch browser
		chrome.get("https://en-gb.facebook.com");  //to load URl
		chrome.manage().window().maximize(); 
		//implicit wait
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the Create new account button.
		chrome.findElement(By.linkText("Create new account")).click();
		// Enter the First name.
		chrome.findElement(By.name("firstname")).sendKeys("Monica");
		// Enter the Surname.
		chrome.findElement(By.name("lastname")).sendKeys("L.S");
		// Enter the Mobile number or email address.
		chrome.findElement(By.name("reg_email__")).sendKeys("moni12@gmail.com");
		// Enter the New password.
		chrome.findElement(By.id("password_step_input")).sendKeys("Monicfcass");
		// Handle all three dropdowns in Date of birth
		WebElement dateWE=chrome.findElement(By.name("birthday_day"));
		Select dateDD=new Select(dateWE);
		dateDD.selectByIndex(3);
		WebElement monthWE=chrome.findElement(By.name("birthday_month"));
		Select monthDD=new Select(monthWE);
		monthDD.selectByValue("5");
		WebElement yearWE=chrome.findElement(By.id("year"));
		Select yearDD=new Select(yearWE);
		yearDD.selectByVisibleText("2023");
		// Select the radio button in Gender.
		//WebElement genderWE=chrome.findElement(By.name("sex"));
		//Select genderDD=new Select(genderWE);
		//genderDD.selectByVisibleText("Female");
	chrome.findElement(By.xpath("//label[text()='Female]")).click();
		


	}

}
