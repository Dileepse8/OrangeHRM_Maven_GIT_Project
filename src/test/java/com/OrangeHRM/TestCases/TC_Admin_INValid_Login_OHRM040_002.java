package com.OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHRM.AppUtils.BaseClass_OHRM040_001;
import com.OrangeHRM.TestLibraries.Login_page_OHRM040;

public class TC_Admin_INValid_Login_OHRM040_002 extends BaseClass_OHRM040_001 {

	@Parameters({ "uname", "pwd" })
	@Test
	public void AdminInvalidData(String uname, String pwd) {

		Login_page_OHRM040 login = new Login_page_OHRM040(driver);
		login.getUserCredentials(uname, pwd);
		log.info("Username,Password has Given");
		login.getClickLogIn();
		log.info("Login Button is clicked");
		boolean res = login.errSpanmsgDisplyed();
		if (res == true) {
			Assert.assertTrue(res);
			log.info("Error msg is displayed");
		}

	}
}
