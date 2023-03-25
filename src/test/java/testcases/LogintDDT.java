package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Dashboardpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import testbase.Baseclass;
import utilities.DataProviders;

public class LogintDDT extends Baseclass {
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	void loginddt(String email,String password, String res) {
		try
		{
		logger.info("test started");
		Homepage hp=new Homepage(driver);
	    hp.clicklogin();
	    Loginpage lp=new Loginpage(driver);
	    lp.setuser(email);
	    lp.setpassword(password);
	    lp.clicklogin();
	    Dashboardpage dp=new Dashboardpage(driver);
	    boolean target=dp.checkdashboard();
	    
	    if(res.equals("Valid"))
	    {
	    	if(target==true)
	    	{
	    		Assert.assertTrue(true);
	    		dp.clicklogout();
	    		}
	    	else
	    	{
	    		Assert.assertFalse(false);
	    	}
	    	
	    		
	    	
	    }
	    if(res.equals("Invalid"))
	    {
	    	if(target==true)
	    	{
	    		Assert.assertTrue(false);
	    		dp.clicklogout();
	    		}
	    	else
	    	{
	    		Assert.assertTrue(true);
	    	}
	    	
	    		
	    	
	    }
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	    
		
	}

}
