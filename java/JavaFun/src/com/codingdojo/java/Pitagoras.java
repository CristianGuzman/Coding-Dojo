package com.codingdojo.java;

public class Pitagoras {

	
	public double calcularHipotenusa(int catetoA, int catetoB) {
        //La hipotenusa es el lado opuesto del �ngulo recto.
        //Calcular el valor de c dados los valores catetoA y catetoB
		//Invocando el m�todo est�tico sqrt de la clase
		double hipotenusa = Math.sqrt(Math.sqrt(catetoA)+Math.sqrt(catetoB));
		return hipotenusa;
		
    }

}
