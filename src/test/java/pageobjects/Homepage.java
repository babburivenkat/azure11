package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage
{
	
	public Homepage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Sign Up']") WebElement lnk_signup;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement lnk_login;
	
	public void clicksignup()
	{
		lnk_signup.click();
	}
	public void clicklogin()
	{
		lnk_login.click();
	}

}
