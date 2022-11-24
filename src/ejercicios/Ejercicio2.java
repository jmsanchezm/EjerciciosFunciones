package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	static void numEnteros (int num1, int num2) {
		
		for (int i = num1; i<=num2; i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		int numIntr1, numIntr2;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca dos valores:");
		numIntr1= read.nextInt();
		numIntr2= read.nextInt();
		if (numIntr1<numIntr2) {
		numEnteros(numIntr1, numIntr2);
		}else {
			numEnteros (numIntr2,numIntr1);
		}
		read.close();

	}

}
