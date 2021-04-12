package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;


public class TestBase 
{
	public static WebDriver driver;
	
	/*@Before*/
	public void initialise()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
}
