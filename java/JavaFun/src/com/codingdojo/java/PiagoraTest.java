package com.codingdojo.java;

import java.util.Scanner;

public class PiagoraTest {

	public static void main(String[] args) {
		
		Pitagoras p = new Pitagoras();
		
		Scanner sc = new Scanner(System.in);
		int catetoA = sc.nextInt();
		int catetoB = sc.nextInt();
		System.out.println(p.calcularHipotenusa(catetoA, catetoB));

	}

}
