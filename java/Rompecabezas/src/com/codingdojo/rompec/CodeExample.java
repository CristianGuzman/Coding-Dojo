package com.codingdojo.rompec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CodeExample {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        lista.add(3);
        lista.add(5);
        lista.add(1);
        lista.add(2);
        lista.add(7);
        lista.add(9);
        lista.add(8);
        lista.add(13);
        lista.add(25);
        lista.add(32);
        
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Nancy");
        nombres.add("Jinichi");
        nombres.add("Fujibayashi");
        nombres.add("Momochi");
        nombres.add("Ishikawa");
        
        Collections.shuffle(numeros);
        Collections.shuffle(nombres);
        System.out.println(numeros); // [5, 4, 3, 2, 1]
        Collections.sort(numeros);
        System.out.println(numeros); // [1, 2, 3, 4, 5]
                
        Random r = new Random();
        System.out.println(r.nextInt()); // Sin límites
        System.out.println(r.nextInt(5)); // Con límites entre 0 y 5
        
        PuzzleJava pj = new PuzzleJava();
        ArrayList<Integer> array = pj.suma(lista);
        System.out.println(array);
        
        System.out.println(nombres);
        ArrayList<String> nombreslarg = pj.nombrelargo(nombres);
        System.out.println(nombreslarg);
        ArrayList<Character> abc = pj.createArray();
        System.out.println(abc);
        Collections.shuffle(abc);
        System.out.println(abc);

	}

}
