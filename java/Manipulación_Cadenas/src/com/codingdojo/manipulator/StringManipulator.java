package com.codingdojo.manipulator;

/**
 * @author Cristian Guzman
 *
 */
public class StringManipulator {
	
	/**
	 * Elimina los espacios en blanco de ambos lados de las cadenas ingresadas y las concatena. 
	 * Devolver la nueva cadena. Puede utilizar el método trim de la clase String
	 * @param cadena1
	 * @param cadena2
	 * @return
	 */
	String trimAndConcat(String cadena1, String cadena2) {
		
		String cadena3 = cadena1.trim().concat(cadena2.trim());
		return cadena3;
		
	}

	/**
	 * Obtener el índice del caracter dado y devolverlo o devolver -1. 
	 * Si el caracter aparece varias veces, retornar el primer índice. 
	 * Puede utilizar el método indexOf de la clase String.
	 * @param string
	 * @param letter
	 * @return
	 */
	public int getIndexOrNull(String string, char letter) {
		
		return string.indexOf(letter);
	}

	/**
	 * Obtener el índice donde empieza la subcadena dada y devolverlo o devolver -1. 
	 * Puede utilizar el método indexOf de la clase String.
	 * @param string
	 * @param i
	 * @param j
	 * @param string2
	 * @return
	 */
	public String concatSubstring(String string, int i, int j, String string2) {
		
		return string.substring(i, j).concat(string2);
	}

}
