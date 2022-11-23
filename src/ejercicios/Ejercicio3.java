package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	//Definimos la función calculo.
	//Definimos las variables opcion, radio y altura.
	static void calculo (int opcion, int radio, int altura) {
		//Abrimos un switch. En función del número introducido, hará lo siguiente
		switch(opcion) {
		//En caso de que opcion =1
		case 1:
			//Calculará y mostrará el área del cilindro
			System.out.println("El área del cilindro es " + (int)(2*Math.PI*radio*(altura+radio)));
			break;
			//En caso de que opcion=2
		case 2:
			//Calculará y mostrará el volumen del cilindro
			System.out.println("El volumen del cilindro es " + (int)(Math.PI * (radio*radio)* altura) );
			break;
			//En caso de que sea diferente a los anteriores, se mostrará error
		default:
			System.out.println("ERROR");
		}
	}
	public static void main(String[] args) {
		//Declaramos variables
		int rad;//Se guardará el valor del radio
		int alt;//Se guardará la altura
		int elección;//Se guardará la elección
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos el radio
		System.out.println("Introduzca el radio del cilindro:");
		//Leemos dato
		rad= read.nextInt();
		//Solicitamos altura
		System.out.println("Introduzca la altura del cilindro");
		//Leemos dato
		alt=read.nextInt();
		//Solicitamos que cáculo se quiere llevar a cabo
		System.out.println("Elija una de las siguientes opciones:");
		System.out.println("1. Cálculo del área ");
		System.out.println("2. Cálculo del volumen ");
		//Leemos dato
		elección=read.nextInt();
		//Llamamos la función que hemos declarado anteriormente
		calculo (elección, rad, alt);
		//Cerramos el Scanner
		read.close();
				
		}

}
