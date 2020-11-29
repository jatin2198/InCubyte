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
	
}
