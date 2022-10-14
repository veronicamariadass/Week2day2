package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundInput {
	public static void main (String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.leafground.com/input.xhtml");
			driver.manage().window().maximize();
		
		//type ur name
			Thread.sleep(5000);
			driver.findElement(By.id("j_idt88:name")).sendKeys("Veronica");
		//append your country
			driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Trichy");
		//verify the textbox is disabled or not
			boolean displayed=driver.findElement(By.id("j_idt88:j_idt91")).isDisplayed();
			System.out.println("The textBox is displayed"+""+displayed);
		//clear the typed text
			Thread.sleep(3000);
			driver.findElement(By.id("j_idt88:j_idt95")).clear();
		//retrieved the text
			WebElement retreiveText = driver.findElement(By.id("j_idt88:j_idt97"));
			String text = retreiveText.getAttribute("value");
			System.out.println("The Retreived text from the textbox is" + " " + text);
			
		//type email and tab
			WebElement email=driver.findElement(By.id("j_idt88:j_idt99"));
			email.sendKeys("veronica.mary@gmail.com",Keys.TAB);
		//type about yourself
			WebElement yourself=driver.findElement(By.id("j_idt88:j_idt101"));
			yourself.sendKeys("Automation testing with selenium in java");
		//confirm error message
			Thread.sleep(3000);
			driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
			String errorMessgae = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
			System.out.println("The Error message is" + " " + errorMessgae);
		//type ur name and choose 3rd option
			Thread.sleep(3000);
			WebElement Name=driver.findElement(By.id("j_idt106:auto-complete_input"));
			Name.sendKeys("Veronica");
			//driver.findElement(By.xpath("//li[@class='ui-autocomplete-token-label'='Veronica3']")).click();
		//type DOB and confirm the choosen date
			WebElement DOB=driver.findElement(By.id("j_idt106:j_idt116_input"));
			DOB.sendKeys("11/18/1994");
			WebElement bdaydate=driver.findElement(By.id("j_idt106:j_idt116_input"));
			String bday=bdaydate.getText();
			if (!bdaydate.equals(bday));{
				System.out.println("You have choosen Bday correclty");
			}
		 {
				System.out.println("You have not choosen Bday correctly");
				
			}// type number and confirm the value change
			Thread.sleep(2000);
			WebElement sendNumber = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
			sendNumber.sendKeys("77");
			String textNum = sendNumber.getText();
			driver.findElement(By.xpath("(//span[@class='ui-button-text'])[3]")).click();
			WebElement textTwo = driver.findElement(By.id("j_idt106:j_idt118_input"));
			String textSecNum = textTwo.getText();
			if (!textNum.equals(textSecNum)) {
				System.out.println("The Number is not Changed");
			} else {
				System.out.println("The Number is Changed");
			}

			driver.close();

			
	}
}
