package Launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_site {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch site
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Browser Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		
		//enter username and password
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(200);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(200);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
