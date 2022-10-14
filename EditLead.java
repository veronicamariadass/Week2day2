package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
			
	public static void main (String[] args) throws InterruptedException {
		//Launch the browser
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
		//leaftaps url
			driver.get("http://leaftaps.com/opentaps/con0trol/main");
		//maximize the window
			driver.manage().window().maximize();
		//Enter the username
			WebElement elementUsername=driver.findElement(By.id("username")); 
			elementUsername.sendKeys("Demosalesmanager");
		//Enter the password
			WebElement elementPassword=driver.findElement(By.id("password"));
			elementPassword.sendKeys("crmsfa");
		//click login
			WebElement elementLogin=driver.findElement(By.className("decorativeSubmit"));
			elementLogin.click();
		//click CRMSFA
			WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
			elementCRMSFA.click();
		//Click Lead link
			WebElement elementCreatelead=driver.findElement(By.linkText("Create Lead"));
			elementCreatelead.click();
		//Click find lead
			WebElement elementfindleads=driver.findElement(By.linkText("Find Leads"));
			elementfindleads.click();
		//Enter first name
			WebElement elementfirstname=driver.findElement(By.id("ext-gen248"));
			elementfirstname.sendKeys("Verlin");
		//Click find leads button
			WebElement elementleadsbutton=driver.findElement(By.id("ext-gen334"));
			elementleadsbutton.click();
		//click on first resulting lead
			Thread.sleep(4000);
			
			WebElement elementfirstresultinglead=driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10185']"));
			elementfirstresultinglead.click();
		//verify title of the page
			System.out.println("The Page title is"+driver.getTitle());
		//click edit
			WebElement elementedit=driver.findElement(By.linkText("Edit"));
			elementedit.click();
		//change the company name
			WebElement elementclearcompanyname=driver.findElement(By.id("updateLeadForm_companyName"));
			elementclearcompanyname.clear();
			WebElement elementchangecompanyname=driver.findElement(By.id("updateLeadForm_companyName"));
			elementchangecompanyname.sendKeys("zoho");
		//click update
			WebElement elementupdate=driver.findElement(By.className("smallSubmit"));
			elementupdate.click();
		//confirm the changed name appears
			Thread.sleep(3000);
			
		//close the browser
			driver.close();
		
	}
	}	
			
			
			
			
			
			
			
	

	
	
	
	
		 
		
	
		
		
	

