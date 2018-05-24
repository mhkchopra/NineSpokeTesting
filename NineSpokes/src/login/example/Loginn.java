package login.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Loginn {
	static WebDriver driver;
	public void invokeBrowser()
	{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.get("https://login-example-app.firebaseapp.com/");
	}
@Test
public void login() {
				driver.findElement(By.id("personal_usrn")).sendKeys("Peter");
				driver.findElement(By.id("personal_password")).sendKeys("personal"); 
				driver.findElement(By.id("login_button")).click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/button/div/div/span")).click();
				driver.findElement(By.xpath("//*[@id=\"login_type_business\"]/div/span")).click();
				driver.findElement(By.xpath("//*[@id=\"business_username\"]")).sendKeys("bill");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				driver.findElement(By.xpath("//*[@id=\"business_password\"]")).sendKeys("business");
				driver.findElement(By.xpath("//*[@id=\"login_button\"]/div/div/span")).click();
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/button/div/div/span"));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.close();
				driver.quit();
 }
	} 
