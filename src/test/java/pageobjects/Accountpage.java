package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountpage extends BasePage {
	
	public Accountpage(WebDriver driver)
	{
		super(driver);	
	}
	
	@FindBy(xpath="//input[@id='FirstName']") WebElement txt_firstname;
	@FindBy(id="Surname") WebElement txt_surname;
	@FindBy(id="E_post") WebElement txt_epost;
	@FindBy(id="Mobile") WebElement txt_mobile;
	@FindBy(xpath="//input[@id='Username']") WebElement txt_username;
	@FindBy(xpath="//input[@id='Password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='ConfirmPassword']") WebElement txt_confirmpassword;
	@FindBy(xpath="//input[@id='submit']") WebElement btn_submit;
	@FindBy(xpath="//label[@class='label-success']") WebElement msg_confirmation;
	
	public void setfirstname(String firstname)
	{
		txt_firstname.sendKeys(firstname);
	}
	public void setsurname(String surname)
	{
		txt_surname.sendKeys(surname);
	}
	public void setepost(String epost)
	{
		txt_epost.sendKeys(epost);
	}
	public void setmobile(String mobile)
	{
		txt_mobile.sendKeys(mobile);
	}
	public void setusername(String username)
	{
		txt_username.sendKeys(username);
	}
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void setconfirmpassword(String confirmpassword)
	{
		txt_confirmpassword.sendKeys(confirmpassword);
	}
	
	public void clicksubmit()
	{
		btn_submit.click();
	}
	public String checkmsgconfirm()
	{
		try {
			return (msg_confirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	

}
