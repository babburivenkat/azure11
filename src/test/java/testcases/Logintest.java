package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Dashboardpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import testbase.Baseclass;

public class Logintest extends Baseclass {
	@Test(groups= {"sanity","master"})
	void logintest()
	{
		try
		{
		logger.info("test started");
		Homepage hp=new Homepage(driver);
	    hp.clicklogin();
	    Loginpage lp=new Loginpage(driver);
	    lp.setuser(rb.getString("username"));
	    lp.setpassword(rb.getString("password"));
	    lp.clicklogin();
	    Dashboardpage dp=new Dashboardpage(driver);
	    boolean status=dp.checkdashboard();
	    
	    Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	    
	    
	}

}
