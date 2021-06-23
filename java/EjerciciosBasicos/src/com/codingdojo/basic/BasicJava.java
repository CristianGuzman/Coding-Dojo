package com.codingdojo.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
	
	public static void num1a255() {
		int num = 1;
		while(num<256) {
			System.out.println(num);
			num++;
		}
	}
	public void imp1a255() {
		int num = 1;
		while(num % 2 != 0 && num<256) {
			System.out.println(num);
			num++;
		}
	}
	public void imprimirsuma() {
		int num = 0;
		int suma = 0;
		while(num<256) {
			System.out.println("Nuevo Numero = "+num+" Suma: "+suma);
			num++;
			suma = num + suma;
		}
	}
	public void recorrer(int[] x) {
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);			
		}
	}
	public int impmax(int[] list) {
		int max = list[0];
		for(int i = 0; i < list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}
	public int impmin(int[] list) {
		int min = list[0];
		for(int i = 0; i < list.length; i++) {
			if(list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}
	public int improm(int[] prom) {
		int suma = 0;
		int promedio = 0;
		for(int i=0; i<prom.length;i++) {
			suma = suma+prom[i];
		}
		promedio = suma/prom.length;
		return promedio;
	}
	public void impares() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		int num = 1;
		for(int i=0;i<256;i++) {
			if(num%2 != 0) {
				y.add(num);
			}
			num++;
		}
		System.out.println("Impares :"+y);
	}
	public void mayores(ArrayList<Integer> list, int num) {
		int cont = 0;
		for(int i=0;i<list.size();i++ ) {
			if(list.get(i)>num) {
				cont++;
			}
		}
		System.out.println(cont);
		
	}
	public void cuadrado(int[] elevar) {
		for(int i=0;i<elevar.length;i++) {
			elevar[i]= elevar[i] * elevar[i];
		}
	}
	public void negativo(int[] elevar) {
		
		for(int i=0;i<elevar.length;i++) {
			if(elevar[i] < 0) {
				elevar[i] = 0;
			}
		}
		
	}
	public void mmp(int[] elevar) {
		int min = this.impmin(elevar);
		int max = this.impmax(elevar);
		int prom = this.improm(elevar);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(min);
		list.add(max);
		list.add(prom);
		System.out.println(list);
		
	}
	public void cambiar(int[] cadena) {
		
		for(int i = 0;i<cadena.length;i++) {
			if(i == cadena.length-1) {
				cadena[i] = 0;
			}else {
				cadena[i] = cadena[i+1];
			}
		}
		System.out.println(cadena);
		
	}

}
