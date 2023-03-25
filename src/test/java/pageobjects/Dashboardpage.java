package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardpage extends BasePage {
	
	public Dashboardpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Dashboard']") WebElement txt_dash;
	@FindBy(xpath="//a[normalize-space()='Log out']") WebElement btn_logout;
	
	public boolean checkdashboard()
	{
		try
		{
		return(txt_dash.isDisplayed());
		
		}
		catch(Exception e)
		{
			return(false);
		}
		
	}
	
	public void clicklogout()
	{
		btn_logout.click();
	}
	

}
