package com.vodafone.pages;

import java.io.IOException;

import com.vodafone.main.MainPage;

public class MobilePage extends MainPage{

	public MobilePage() throws IOException {
		
	}
	//Method to navigate to PayMonthly order journey page
	public static void navigateToPayMonthly(String payMonthlyLink)
	{
		//Clicking on Pay Monthly Link to initiate PAY Monthly Phone Purchase
		click(payMonthlyLink);
	}
}
