package com.OrangeHRM.TestCases;

//import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OrangeHRM.AppUtils.BaseClass_OHRM040_001;
import com.OrangeHRM.TestLibraries.Login_page_OHRM040;

public class TC_Admin_Valid_Login_OHRM040_001 extends BaseClass_OHRM040_001 {

	SoftAssert soft=new SoftAssert();
	
	//@Listeners(li)
	@Parameters({ "uname", "pword" })
	@Test
	public void adminValidLoginTest(String userName, String password) {
		Login_page_OHRM040 login = new Login_page_OHRM040(driver);
		login.getUserCredentials(userName, password);
		log.info("UserName,Password has Given");
		login.getClickLogIn();
		log.info("LogIn Button is Clicked");

		boolean res = login.isAdminDisplayed();
		if (res == true) {
			soft.assertTrue(true);
			log.info("Admin is Displayed");
		} else {
			soft.assertTrue(false);
			log.info("Admin is Not Displayed");
		}

		soft.assertAll();
	}

}
