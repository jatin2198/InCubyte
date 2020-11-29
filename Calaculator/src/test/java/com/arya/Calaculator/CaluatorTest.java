package com.arya.Calaculator;

import org.junit.Test;

import junit.framework.Assert;

public class CaluatorTest {
	
	//for Empty String
	@Test
	
	public void emptyString() {
		 
		Calculator cal=new Calculator();
		
		Assert.assertEquals(0, cal.Add(""));
	}

}
