package health.med;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass {
	
	private WebDriver driver = null;
	
	
	public void login(String uname, String pwd) throws Exception{
		String URL = "https://" + uname + ":" + pwd + "@" + "docs.google.com/a/kaplan.com/spreadsheets/d/1z5LtmlPCsMh4otDMaPEMgqcIsI8XX0NtIM6X2M_2LoU/edit#gid=1159427575" ;

		System.out.println("hahahahaha  " + URL);//"https://" + uname + ":" + pwd + "@" + 
		driver.get(URL);
		switchWindows();
		delay(2);
		RobotService robot = new RobotService();
		robot.type("abrahman");
		robot.sendKey(KeyEvent.VK_TAB);
		robot.type("azqwsxcdc");
		robot.sendKey(KeyEvent.VK_ENTER);

		//delayFor(3000);USRAT1234
        /*ABRAHMAN	NUSRAT1234
        driver.switchTo().frame("Authentication Required.0.child");
        driver.findElement(By.partialLinkText(" Name:")).sendKeys(uname);
        driver.findElement(By.partialLinkText("Password:")).sendKeys(pwd);
        //System.Threading.Thread.Sleep(3000);
*/	
	}

	@Test
	public void testLogin() throws Exception{
		
		System.out.println("paichi mama ::");
		//login("abrahman", "vfvfvfvf");
		//Assert...
	}
	
	public void delay(int time){
		 try {
				Thread.sleep(time*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
//*************************************************************************************
		@BeforeMethod
		public void beforeMethod(){
			
			/*FirefoxProfile profile = new FirefoxProfile(); //FirefoxDriver
			//profile.setPreference("browser.cache.disk.enable", false);
			driver = new FirefoxDriver(profile); 
			driver.manage().window().maximize();
			//driver.navigate().to("http://jasperwp.qa.kaplan.com/loginv8.aspx");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);*/
			
			System.setProperty("webdriver.chrome.driver","C:\\DevTools\\Browser\\chromedriver.exe");// chromedriver
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			String baseUrl="http://" +"abrahman" + ":" + "password" + "@" + "docs.google.com/a/kaplan.com/spreadsheets/d/1z5LtmlPCsMh4otDMaPEMgqcIsI8XX0NtIM6X2M_2LoU/edit#gid=1159427575";;
			driver.get(baseUrl + "/");
			delay(2);
			RobotService robot = new RobotService();
			robot.type("abrahman");
			robot.sendKey(KeyEvent.VK_TAB);
			robot.type("azqwsxcdc");
			robot.sendKey(KeyEvent.VK_ENTER);
		}
		
		/*@AfterMethod
		public void afterMethod(){
			driver.quit();
		}*/
		
		private void switchAttachWindows() throws InterruptedException
		{
			Set<String> handlers = driver.getWindowHandles();	
			if (driver.getWindowHandles().size()>= 1) {
				System.out.println("get new window name : "+ driver.getTitle());
			    for (String handler : handlers) {
			        driver.switchTo().window(handler);
			        if (driver.getCurrentUrl().contains("https://auth.kaplan.com")) {
			            System.out.println(driver.getTitle());
			            //driver.getWindowHandle();
			            Thread.sleep(3000);
			           // WebElement clickBrowse = driver.findElement(By.id("file1"));
			    		//clickBrowse.click();
			    		break;
			        }
			    }
			}
		}

		private void switchWindows() throws InterruptedException
		{
			Set<String> handlers = driver.getWindowHandles();
			
			if (driver.getWindowHandles().size()>= 1) {
				System.out.println("get new window name : "+ driver.getTitle());
			    for (String handler : handlers) {
			        driver.switchTo().window(handler);
			        if (driver.getCurrentUrl().contains("https://auth.kaplan.com")) {
			            System.out.println(driver.getTitle());
			            //driver.getWindowHandle();
			            Thread.sleep(5000);
			            WebElement clickBrowse = driver.findElement(By.id("file1"));
			    		clickBrowse.click();
			    		break;
			        }
			    }
			}
		}

}