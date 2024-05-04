package demoqa_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit 
{
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.amazon.in/");
	}
	
//	@AfterMethod
//	public void closeBrowser() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.close();
//	}
}
