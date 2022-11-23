package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
 static boolean vocal (String letra) {
	 boolean result= false;
	 if(letra.equals ("a") || letra.equals ("e") || letra.equals ("i") || letra.equals ("o") || letra.equals ("u")) {
		 result = true;
	 }
	 return result;
	 }

	public static void main(String[] args) {
		String result;
		String letra;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca una letra");
		letra = read.next();
		letra = letra.toLowerCase();
		result= vocal(letra) ==true ? "Es vocal": "Es consonante";
		System.out.println(result);
			

	}

}
