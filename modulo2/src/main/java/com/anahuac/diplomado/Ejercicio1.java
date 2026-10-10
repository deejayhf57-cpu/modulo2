package com.anahuac.diplomado;
import java.util.Scanner;
public class Ejercicio1 {
    //psvm 
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la temperatura en grados Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 1.8 + 32;
            System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        }
    }
}
