package com.codingdojo.zoo;

public class Gorilla extends Mammal {
	
	
	
	public Gorilla() {
		super();
	}
	public void throwSomething() {
		System.out.println("Lanzando cosas a la gente...");
		setEnergyLevel(getEnergyLevel()-1);
	}
	public void eatBananas() {
		System.out.println("Comiendo bananas...");
		setEnergyLevel(getEnergyLevel()+1);
	}
	public void climb() {
		System.out.println("Escalando...");
		setEnergyLevel(getEnergyLevel()-3);
	}
	
	
}
