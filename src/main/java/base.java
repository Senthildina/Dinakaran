	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class base {
		
	public static WebDriver driver;

	public static WebDriver Browserlaunch(String Browsername) {
		
		switch (Browsername) {
		case "chrome":			
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
			break;
			
		case "firefox":
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();

			break;
			
		case "EDGE":
			
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		default:
			System.err.println("Invalid Browser");
			throw new WebDriverException();
			
		}
		return driver;

	}

	public static void launchUrl(String url) {
	 driver.get(url);
	 driver.manage().window().maximize();
	 
	 
	}
	public static void Implicitwait(long sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
			

		}

	public static void Sendkeys( WebElement r, String value ) {
		r.sendKeys(value);

	}


	public static void Btnclick(WebElement r) {
		r.click();	

	}

	public static void quitbrowser() {
		driver.quit();

	}

	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();

		return currentUrl;
	}

	public static String gettitle() {
		return driver.getTitle();

	}

	public static String getAttribute(WebElement r) {
	return r.getAttribute("value");
		
	}

	public static void moveToElement(WebElement target) {
		Actions r = new Actions (driver);
		r.moveToElement(target).perform();

	}

	public static void dragAndDrop(WebElement target, WebElement source) {
		Actions r = new Actions (driver);
		r.dragAndDrop(source, target).perform();	
		

	}

	public static void selectByIndex(WebElement v, int index) {
	Select r = new Select (v);
	r.selectByIndex(index);

	}


	
			
			

	}



	
	
