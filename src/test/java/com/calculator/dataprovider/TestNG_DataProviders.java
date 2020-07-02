package com.calculator.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders {
	
	@DataProvider(name="testData")
	public Object[][] Data() {
		return new Object[][] {
			{10,20,15.5,5},
			{10,20,15.5,5},
		};
	}
	
}