import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Excell extends base {
	
	public static void main(String[] args) {
	Browserlaunch("chrome");
	launchUrl("https://www.flipkart.com/");
	
//	(//input[@autocomplete='off'])[2]
	
	Implicitwait(2000);
	
	WebElement username = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	username.sendKeys("7418424767");
		
	WebElement pass = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
	pass.sendKeys("Dinakaran");
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	driver.quit();
	
	
	
	}

	}
	

