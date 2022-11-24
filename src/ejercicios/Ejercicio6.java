package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	static boolean esPrimo (int numero) {
		boolean primo=true;
		if (numero ==1) {
			primo=false;
		}
		for (int j = 2; j<numero;j++) {
			if (numero%j==0) {
				primo=false;
			}
		}
		return (primo);	
	}
	public static void main(String[] args) {
		int num;
		String result;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca un número para ver si es primo: ");
		num= read.nextInt();
		result = esPrimo(num)== true ? "El número es primo" : "El número NO es primo";
		System.out.println(result);
	}

}
