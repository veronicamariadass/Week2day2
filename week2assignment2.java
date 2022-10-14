package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week2assignment2 {
	public static void main (String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername=driver.findElement(By.id("username")); 
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword=driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin=driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads=driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreatelead=driver.findElement(By.linkText("Create Lead"));
		elementCreatelead.click();
		WebElement CompanyName=driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("TCS");
		WebElement Firstname=driver.findElement(By.id("createLeadForm_firstName"));
		Firstname.sendKeys("verlin");
		WebElement Lastname=driver.findElement(By.id("createLeadForm_lastName"));
		Lastname.sendKeys("mary");
		WebElement department=driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("computer");
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("I am from computer science department");
		WebElement Email=driver.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("veronica.mary@tcs.com");
		WebElement clickButton=driver.findElement(By.className("smallSubmit"));
		clickButton.click();

		WebElement clickEdit = driver.findElement(By.linkText("Edit"));
		clickEdit.click();
		WebElement updateDescription= driver.findElement(By.id("updateLeadForm_description"));
		updateDescription.clear();
		WebElement enterImportantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		enterImportantNote.sendKeys("Selenium is very easy");
		WebElement clickUpdate = driver.findElement(By.className("smallSubmit"));
		clickUpdate.click();
		
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		
		if(title.contains("View Lead")){
			
			System.out.println("I confirm the titile has  View Lead | opentaps CRM ");
		} else {
			System.out.println(" The title doesnot have View Lead | opentaps CRM");
		}
		driver.close();
		
	}
}

		
		
		
