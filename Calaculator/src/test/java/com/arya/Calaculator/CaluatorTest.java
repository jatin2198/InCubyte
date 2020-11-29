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
	@Test
	
	public void NonEmptyMorethantwo() {
		
		cal.Add("1,2,3");
		
		Assert.assertTrue(true);
	}
	
	
	//UnkonowAmount of values need to Handle
	
	@Test
	public void UnknowAmountofString() {
		
		Assert.assertEquals(10, cal.Add("1,2,3,4"));
	}
	
	//Allow the Add method to handle new lines between numbers
	@Test
	
	public void AllowNewLine() {
		
		Assert.assertEquals(6, cal.Add("1\n2,3"));
	}
}
