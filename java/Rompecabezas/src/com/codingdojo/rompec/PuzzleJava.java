package com.codingdojo.rompec;

import java.util.ArrayList;

public class PuzzleJava {
	
	public ArrayList<Integer> suma(ArrayList<Integer> lista) {
		
		
		Integer suma = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i < lista.size();i++) {
			suma = (Integer)lista.get(i) + suma;
			if((Integer)lista.get(i) > 10) {
				array.add((Integer)lista.get(i));
			}
		}
		System.out.println("suma del arreglo = "+suma);
		return array;
	}

	public ArrayList<String> nombrelargo(ArrayList<String> nombres) {
		
		for(int i = 0; i<nombres.size();i++) {
			if(nombres.get(i).toString().length() < 5) {
				nombres.remove(i);
			}
		}
		return nombres;
		
	}
	public ArrayList<Character> createArray (){
		
		ArrayList<Character> abc = new ArrayList<Character>();
		
		for ( int i=0; i<26; i++) {
			abc.add((char) ('A' + i ));
		}
		return abc;
	}
}
