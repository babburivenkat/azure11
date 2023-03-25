package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.Accountpage;
import pageobjects.Homepage;
import testbase.Baseclass;

public class Accountregtest extends Baseclass {
	
	@Test
	void test_Accountregtest()
	{
		logger.debug("application logs");
		logger.info("***** Started Acoountregtest   *****");
	try
	{
		
		Homepage hp= new Homepage(driver);
		hp.clicksignup();
		logger.info("clicked on signup");
		Accountpage ap=new Accountpage(driver);
		logger.info("Please enter all the required details");
		ap.setfirstname(randomstring());
		ap.setsurname(randomstring());
		ap.setepost(randomstring());
		ap.setmobile(randomnumber());
		ap.setusername(randomstring());
	    String password=randomnumber();
	    ap.setpassword(password);
	    //ap.setconfirmpassword(password);
	    ap.clicksubmit();
	    logger.info("Alldetails entered and clicked on submit");
	    String confmsg=ap.checkmsgconfirm();
	Assert.assertEquals(confmsg,"Registration Successful");
	logger.info("test success");
	}
	catch(Exception e)
	{
		Assert.fail();
		logger.info("test failed");
	}
		logger.info("test finished");
	}

}
