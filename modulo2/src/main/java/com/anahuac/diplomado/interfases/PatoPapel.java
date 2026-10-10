package com.anahuac.diplomado.interfases;

public class PatoPapel extends Pato {

	public PatoPapel(String nombre, String color) {
		super(nombre, color);
	}

	public void quack() {
		System.out.println("Soy un pato de papel y soy mudo");
	}
}
