package com.anahuac.diplomado.interfases;

public class PatoMallard extends Pato{

	public PatoMallard(String nombre, String color) {
		super(nombre, color);
	}

	
	public void quack() {
		System.out.println("Soy un pato mallard y hago quack");		
	}
	
}
