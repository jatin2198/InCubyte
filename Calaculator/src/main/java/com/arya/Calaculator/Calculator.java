package com.arya.Calaculator;

public class Calculator {

	
	public int Add(String number) {
		/*if(number.length()>3) {
			
			throw new NullPointerException("length greater than 2");
		}
		*/
		
		if(!number.trim().isEmpty()) {
			
			String[] values=number.split(",");
			
			int sum=0;
			
			for(String data:values) {
				
				 sum+=Integer.parseInt(data);
				
				
			}
			
			return sum;
		}
		
		return 0;
		
		
		
		
	}
}
