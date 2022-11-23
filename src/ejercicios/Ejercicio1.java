package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	static void eco(int n) {
		for (int i=1; i<=n;i++) {
			System.out.println("Eco");
		}
	}
	public static void main(String[] args) {
		int numVeces;
		Scanner read= new Scanner (System.in);
		System.out.println("¿Cuántas veces quiere mostrar 'Eco'?");
		numVeces=read.nextInt();
		eco(numVeces);
		read.close();

	}

}
