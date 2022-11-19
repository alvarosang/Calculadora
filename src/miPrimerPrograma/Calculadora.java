package miPrimerPrograma;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int opcion =0;
		Scanner sc;

		sc = new Scanner(System.in);

		do {
			
			//Imprimimos por consola el menu
			System.out.println("\n");
			System.out.println(" ***** Práctica calculadora *****");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.println("0. Salir del programa");
			System.out.print("Introduzca una opcion valida: ");
			
			//Recoger el valorr del teclado
			//Transformar esa cadena de caracteres en un valo entero
			opcion = Integer.parseInt(sc.nextLine());
			
			if (opcion < 0 || opcion > 5 ){
				
				System.out.println("Opcion no válida. Vuelva a escoger");
				
			} else if (opcion !=0) {
				
				System.out.println("\n");
				float operando1 , operando2;
				
				System.out.println("Introduzca el primer operando: ");
				operando1 = Float.parseFloat(sc.nextLine());
				
				System.out.println("Introduzca el segundo operando: ");
				operando2 = Float.parseFloat(sc.nextLine());
				
				System.out.println("\n");
				switch(opcion) {
				case 1: 
					System.out.println("El resultado de la suma es " + (operando1 + operando2));
					break;
				case 2:
					System.out.println("El resultado de la resta es " + (operando1 - operando2));
					break;
				case 3:
					System.out.println("El resultado de la multiplicacion es " + (operando1 * operando2));
					break;
				case 4:
					System.out.println("El resultado de la división es " + (operando1 / operando2));
					break;
				case 5:
					System.out.println("El resultado del modulo es " + (operando1 % operando2));
					break;
				} 
			}
			
		} while ( opcion != 0); //Al insertar el valor 0, significa salir de la calculadora

		// Indicamos que no vamos a leer ningún valor más por el teclado
		sc.close();

		System.out.println("Finalizando la ejecución de la calculadora");
		
		

	}

}
