package com.vodafone.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.vodafone.pages.HomePage;
import com.vodafone.pages.MobilePage;
import com.vodafone.pages.PayMonthlyPage;

public class PayMAquisition {
  private HomePage hp;
  private MobilePage mp;
  private PayMonthlyPage pmp;

@Test
  public void buyPayM() throws IOException {
	  hp = new HomePage();
	  hp.NavigateToMobile("mobileOptionLink");
	  mp = new MobilePage();
	  mp.navigateToPayMonthly("payMonthlyLink");
	  pmp= new PayMonthlyPage();
	  pmp.selectHandset("handsetLocator");
  }
}
