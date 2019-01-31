package com.vodafone.pages;

import java.io.IOException;

import com.vodafone.main.MainPage;

public class HomePage extends MainPage{

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void NavigateToMobile(String mobilePagelink)
	{
		//Navigating to Mobile Section
		click(mobilePagelink);
	}
}
