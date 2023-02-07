package productDemoApp.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_HomePage {
	
	WebDriver driver;
	
	public PO_HomePage(WebDriver d) {
		
		this.driver = d;
	}
	
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='First Name' and @ng-model='FirstName']") 
	private WebElement txtbx_firstname;
	
	@FindBy(how = How.XPATH, using="//input[@ng-model='LastName']") 
	private WebElement txtbx_lastname;
	
	@FindBy(how = How.XPATH, using="//textarea[@ng-model='Adress']") 
	private WebElement txtarea_address;
	
	@FindBy(how = How.ID, using="Skills") 
	private WebElement select_list_skills;
	
	
	public void SetFirstName(String arg) {
		txtbx_firstname.sendKeys(arg);
	}
	
	public void SetLastName(String arg) {
		txtbx_lastname.sendKeys(arg);
	}
	
	public void SetAddress(String arg) {
		txtarea_address.sendKeys(arg);
	}
	
	public void SelectSkillsByValue(String arg) {
		Select dropDown = new Select(select_list_skills);
		dropDown.selectByValue(arg);
	}
		
}
