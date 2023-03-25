package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="Username") WebElement inp_username;
	@FindBy(id="Password") WebElement inp_password;
	@FindBy(xpath="//input[@name='login']") WebElement btn_login;
	
	public void setuser(String username)
	{
		inp_username.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		inp_password.sendKeys(password);
	}
	
	public void clicklogin()
	{
		btn_login.click();
	}
	
	

}
