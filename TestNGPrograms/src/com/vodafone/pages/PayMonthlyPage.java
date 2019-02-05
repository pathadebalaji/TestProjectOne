package com.vodafone.pages;

import java.io.IOException;

import com.vodafone.main.MainPage;

public class PayMonthlyPage extends MainPage{

	public PayMonthlyPage() throws IOException {
		
	}
	//Method to select PayM Handset 
	public static void selectHandset(String handsetLocator)
	{
		//choosing Handset
		click(handsetLocator);
	}
}
