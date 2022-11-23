package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	static int numAlto (int x, int y ) {
		int mayor;
		mayor = x < y? y: x;
		return (mayor);
	}
	public static void main(String[] args) {
		int num1, num2;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca dos números: ");
		num1=read.nextInt();
		num2=read.nextInt();
		System.out.println(numAlto (num1,num2));
read.close();
	}

}
