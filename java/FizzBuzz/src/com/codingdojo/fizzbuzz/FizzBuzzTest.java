package com.codingdojo.fizzbuzz;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dividendo = sc.nextInt();
		
		FizzBuzz fb = new FizzBuzz();
		
		System.out.println(fb.fizzBuzz(dividendo));

	}

}
