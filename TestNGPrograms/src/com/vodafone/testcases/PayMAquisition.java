package com.vodafone.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.vodafone.pages.HomePage;
import com.vodafone.pages.MobilePage;
import com.vodafone.pages.PayMAccessoriesPage;
import com.vodafone.pages.PayMonthlyPage;

public class PayMAquisition {
  private HomePage hp;
  /*private MobilePage mp;
  private PayMonthlyPage pmp;*/
//PayMonthly Aquisition for Handset + PAYM Plan
@Test
  public void buyPayM() throws IOException {
	  hp = new HomePage();
	  hp.NavigateToMobile("mobileOptionLink");
	  MobilePage.navigateToPayMonthly("payMonthlyLink");
	  PayMonthlyPage.selectHandset("handsetLocator");
	  PayMAccessoriesPage.click("payMLocator");
  }
}
