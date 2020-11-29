package com.arya.Calaculator;

public class Calculator {

	
	public int Add(String number) {
		/*if(number.length()>3) {
			
			throw new NullPointerException("length greater than 2");
		}
		*/
		
		
		
		String[] values=number.trim().split("[^0-9]");
		if(values.length>1) {
			
		
			
			int sum=0;
			
			for(String data:values) {
				
				if(!data.isEmpty()) {
				 sum+=Integer.parseInt(data);
				}
				
			}
			
			return sum;
		}
		
		return 0;
		
		
		
		
	}
}
