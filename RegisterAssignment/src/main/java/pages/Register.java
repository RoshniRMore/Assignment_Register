package pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.TestBase;
import io.cucumber.datatable.DataTable;


public class Register extends TestBase 
{
	Actions action;
	public void getURL() 
	{
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	public void credentials(DataTable dataTable) 
	{
		Map map=dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//div//input[@placeholder=\"First Name\"]")).sendKeys(map.get("fname")+"");
		driver.findElement(By.xpath("//div//input[@placeholder=\"Last Name\"]")).sendKeys(map.get("lname")+"");
		driver.findElement(By.xpath("//div//textarea[@ng-model='Adress']")).sendKeys(map.get("address")+"");
		driver.findElement(By.xpath("//div//input[@type='email']")).sendKeys(map.get("emailaddress")+"");
		driver.findElement(By.xpath("//div//input[@type='tel']")).sendKeys(map.get("phone")+"");
		//dropdown
			String dopdown=(String) map.get("country");
		//radio
			String gender=(String) map.get("country");
		//checklist
			String checklist=(String) map.get("hobbies");
			List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
			for(WebElement e: AllCheckBoxes)
			{
				if(e.getText().contains(checklist))
					action.moveToElement(e.findElement(By.tagName("input"))).click().perform();	
			}
			driver.findElement(By.xpath("//input[@value='"+checklist+"']")).click();//input[@value='Hockey']		
	}
	public void submit() 
	{
		driver.findElement(By.id("submitbtn")).click();
	}
	public void checkResult() 
	{
		System.out.println("User is on home page");	
	}
}
