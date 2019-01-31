package com.vodafone.pages;

import java.io.IOException;

import com.vodafone.main.MainPage;

public class PayMAccessoriesPage extends MainPage{

	public PayMAccessoriesPage() throws IOException {

	}
	
	public static void addPayMPlan(String PlanLocator)
	{
		click(PlanLocator);
	}

}
