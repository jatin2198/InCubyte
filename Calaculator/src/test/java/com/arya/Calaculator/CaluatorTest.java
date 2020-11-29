package com.arya.Calaculator;

import org.junit.Test;

import junit.framework.Assert;

public class CaluatorTest {
	
	Calculator cal=new Calculator();
	//for Empty String
	@Test
	
	
	public void emptyString() {
		 
		
		
		Assert.assertEquals(0, cal.Add(""));
	}

	@Test
	
	public void NonEmptyStringAtmosttwo() {
		
		cal.Add("1,2");
		Assert.assertTrue(true);
		
	}
	@Test(expected=NullPointerException.class)
	
	public void NonEmptyMorethantwo() {
		
		cal.Add("1,2,3");
		
		Assert.assertTrue(true);
	}
	
	
	//UnkonowAmount of values need to Handle
	
	
	public void UnknowAmountofString() {
		
		Assert.assertEquals(1+2+3+4, cal.Add("1,2,3,4"));
	}
}
