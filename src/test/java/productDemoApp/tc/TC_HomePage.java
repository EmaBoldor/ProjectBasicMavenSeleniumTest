package productDemoApp.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import productDemoApp.po.PO_HomePage;

public class TC_HomePage {

	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\intel\\Desktop\\anul III\\SEM 1\\calitatea soft\\ProjectApp");
	}
	
	@Test
	public void t_01_validate_from() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
		
		PO_HomePage obj = PageFactory.initElements(driver, PO_HomePage.class);
		obj.SetFirstName("Ema");
		obj.SetLastName("Boldor");
		obj.SetAddress("Oradea");
		obj.SelectSkillsByValue("Android");
	}
	
}
