package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

//import pageobjects.AccountRegistrationpage;
import pageobjects.Accountpage;
import pageobjects.Homepage;
import testbase.Baseclass;

public class Acc extends Baseclass {
	@Test(groups= {"regression","master"})
	void test_accountregistration()
	{
		logger.debug("application logs......");
		logger.info("****Tc_001_Accountregistrationpage **** ");
		try
		{
		Homepage hp=new Homepage(driver);
		hp.clicksignup();
		logger.info("clicked on signup");
		Accountpage ar=new Accountpage(driver);
		ar.setfirstname(randomstring());
		ar.setsurname(randomstring());
		ar.setepost(randomstring());
		ar.setmobile(randomnumber());
		ar.setusername(randomstring());
		String password=randomstring();
		ar.setpassword(password);
		ar.setconfirmpassword(password);
		logger.info("provider registration details");
		ar.clicksubmit();
		logger.info("clicked on submit");
		String msg=ar.checkmsgconfirm();
		Assert.assertEquals(msg, "Registration Successful");
	}
	catch(Exception e)
	{
		Assert.fail();
		
		
	}
		logger.info("finished");

	}
}
