package com.vodafone.pages;

import java.io.IOException;

import com.vodafone.main.MainPage;

public class MobilePage extends MainPage{

	public MobilePage() throws IOException {
		
	}

	public static void navigateToPayMonthly(String payMonthlyLink)
	{
		//Clicking on Pay Monthly Link to initiate PAY Monthly Phone Purchase
		click(payMonthlyLink);
	}
}
