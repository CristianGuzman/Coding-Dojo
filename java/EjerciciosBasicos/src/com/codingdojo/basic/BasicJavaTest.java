package com.codingdojo.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class BasicJavaTest {

	public static void main(String[] args) {
		
		BasicJava bj = new BasicJava();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		int[] arrays = {1,3,5,7,9,13};
		int[] prom = {2,10,3};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] cadena = {1,5,10,-2};
		
		//imprimir numeros de 1 a 255
		bj.num1a255();
		//recorrer un arreglo
		bj.recorrer(arrays);
		//imprimir maximo
		int max = bj.impmax(arrays);
		System.out.println("el nro maximo es : "+max);
		//imrimir promedio
		int promedio = bj.improm(prom);
		System.out.println("promedio ="+promedio);
		//Imprimir Impares
		bj.impares();
		//imprimir numero de mayores
		bj.mayores(list,num);
		//elevar al cuadrado
		bj.cuadrado(cadena);
		//eliminar negativos
		bj.negativo(cadena);
		//mostrar min,max.prom
		bj.mmp(cadena);
		//Cambiando los Valores del Arreglo
		bj.cambiar(cadena);

	}

}
