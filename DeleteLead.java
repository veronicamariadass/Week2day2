package week2.day2.Assignments;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DeleteLead {
				
		public static void main (String[] args) throws InterruptedException {
			//Launch the browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
			//leaftaps url
				driver.get("http://leaftaps.com/opentaps/control/main");
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
			//click on phone
				//Thread.sleep(5000);
				//WebElement elementphone=driver.findElement(By.xpath("(//span[@class='x-tab-strip-text'])[2]"));
				//elementphone.click();//
			//Enter Phone number
				Thread.sleep(5000);
				WebElement elementphonenumber=driver.findElement(By.name("phoneNumber"));
				elementphonenumber.sendKeys("9952445079");
				
}
	}



//8	Click on Phone
//9	Enter phone number
//10	Click find leads button
//11	Capture lead ID of First Resulting lead
//12	Click First Resulting lead
//13	Click Delete
//14	Click Find leads
//15	Enter captured lead ID
//16	Click find leads button
//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//18	Close the browser (Do not log out)///