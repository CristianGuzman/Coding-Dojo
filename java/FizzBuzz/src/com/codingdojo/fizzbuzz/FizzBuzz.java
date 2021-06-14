package com.codingdojo.fizzbuzz;

public class FizzBuzz {
	
	public String fizzBuzz(int number) {
		
		String Buzz = "Buzz";
		String Fizz = "Fizz";
        
		if(number % 3 != 0 && number % 5 != 0) {
			return ""+number;
		}else {
			if(number % 3 != 0) {
				return Buzz;
			}
			return Fizz;
		}
    }

}
