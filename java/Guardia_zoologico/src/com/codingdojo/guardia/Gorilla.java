package com.codingdojo.guardia;

public class Gorilla extends Mammal{
	
	
	
	/**
	 * 
	 */
	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param energia
	 */
	public Gorilla(Integer energia) {
		super(energia);
		// TODO Auto-generated constructor stub
	}

	public void throwSomething() {
		System.out.println("Lanzando cosas a la gente...");
		setEnergia(getEnergia()-1);
	}
	
	public void eatBananas() {
		System.out.println("Comiendo bananas...");
		setEnergia(getEnergia()+10);
	}
	
	public void climb() {
		System.out.println("Escalando...");
		setEnergia(getEnergia()-10);
	}

}
