package com.progra1;

import java.util.Scanner;
import java.util.Random;

public class Modularizacion {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {

	int opcionMenú; 
	do {
		mostrarMenú();
		opcionMenú = leerEntero("Escoge una opción");
		
		switch (opcionMenú) {
		case 0: 
			System.out.println("Saliendo del programa...");		
			sc.close();
			return;
			
		case 1:
			menúCalculadora();
			break;
		case 2:
			validarContrasena();
			break;
		case 3:
			System.out.println("Verificación de números primos");
			int numero = leerEntero("Introduce un número");
			if (esPrimo(numero)) {
				System.out.println(numero+" es un número primo");
			}else {
				System.out.println(numero+" no es un número primo");
			}
			break;
		case 4:
			sumaPares();
			break;
		case 5:
			conversionTemperatura();
			break;
		case 6:
			System.out.println("Contar Vocales");
			System.out.println("Ingresa una palabra");
			String frase = sc.nextLine();
			int totalVocales = 	contarVocales(frase);
	
			System.out.println("La frase tiene "+totalVocales+" vocales");
			break;
		case 7: 
			factorial();
			break;
		case 8:
			juegoAdivinanza();
			break;
		case 9:
			pasoPorReferencia();
			break;
		case 10:
			tablaMultiplicar();
			break;
			default : 
				System.out.println("Ingresa una opción valida");
			}
	} while (opcionMenú !=0);
	
	}

	static void mostrarMenú () {	
		System.out.println("");
		System.out.println("Hola! Bienvenido al menú, selecciona una opción para continuar. ");
		System.out.println("1. Calculadora Básica");
		System.out.println("2. Validación de Contraseña");
		System.out.println("3. Números Primos");
		System.out.println("4. Suma de números pares");
		System.out.println("5. Conversión de Temperatura");
		System.out.println("6. Contador de Vocales");
		System.out.println("7. Cálculo Factorial");
		System.out.println("8. Juego de Adivinanza");
		System.out.println("9. Paso por Referencia");
		System.out.println("10. Tabla de Multiplicar");
		System.out.println("0. Salir");
	}

	static void menúCalculadora () {
		System.out.println("Bienvenido a la Calculadora!");
		double num1 = leerDouble("Ingresa el primer número");
		double num2 = leerDouble("Ingresa el segundo número");
		System.out.println("");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación ");
		System.out.println("4. División");
		//agregar salida si quiero luego
		
		int opcionMenúCalc = leerEntero("Escoge una opcion (1-4)");
		switch (opcionMenúCalc) {
		
		case 1:
			suma(num1, num2);
			break;
		case 2:
			resta(num1,num2);
			break;
		case 3:
			multiplicacion(num1,num2);
			break;
		case 4:
			division(num1,num2);
		}																			
	}
	static void suma (double num1, double num2) {
		double resultado = num1+num2;
		System.out.println("La suma de los dos números es: "+num1+ " + " +num2+ " = " +resultado);	
	}
	
	static void resta (double num1, double num2) {
		double resultado = num1-num2;
		System.out.println("La resta de los dos números es: "+num1+ " - " +num2+ " = " +resultado);	
	}
	
	static void multiplicacion (double num1, double num2) {
		double resultado = num1*num2;
		System.out.println("La multiplicación de los dos números es: "+num1+ " X " +num2+ " = " +resultado);	
	}
	
	static void division (double num1, double num2) {
		if (num2 == 0) {
			System.out.println("No se puede dividir dentro de 0");
			
		}else {
		double resultado = num1/num2;
		System.out.println("La división de los dos números es: "+num1+ " / " +num2+ " = " +resultado);	
		}
	}
	
	static double leerDouble (String mensaje) {
		double numero = 0;
		boolean valido = false;
		
		while (!valido) {
			try {
				System.out.print(mensaje+":");
				numero = Double.parseDouble(sc.nextLine());
				valido = true;
			} catch (NumberFormatException e) {
				System.out.println("Error: Ingresa Un número valido!");
			}
		}
		return numero;
	}
	
		static int leerEntero (String mensaje) {
			int numero = 0;
			boolean valido = false;
			
			while(!valido) {
				try {
					System.out.print(mensaje + ":");
					numero = Integer.parseInt(sc.nextLine());
					valido = true;
				}catch(NumberFormatException e) {
					System.out.println("Error, ingresa un numero válido");
				}
			}
			return numero;
		}

	static void validarContrasena () {
		System.out.println("Validar contraseña");
		int password = 1234;
		int intentoPassword;
		int intentos = 3;
		do {
			intentoPassword = leerEntero("Ingresa tu contraseña");
			intentos--; 
			
			if (intentoPassword != password && intentos > 0) {
				System.out.println("Contraseña incorrecta intenta de nuevo. Intento restantes: "+intentos);
			}else if (intentoPassword != password && intentos == 0 ) {
				System.out.println("Acceso denegado. Demasiados intentos");
				System.out.println("Presiona enter para volver al menú...");
				sc.nextLine();
				return;
			}
		} while (intentoPassword != password);
		System.out.println("Bienvenido Usuario!");
		System.out.println("Presiona enter para volver al menú...");
		sc.nextLine();
	}
	static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i < numero; i++) {
			 if (numero % i == 0) {
				 return false;
			 }
		}
		return true;
	}
	static void sumaPares () {
		System.out.println("Ingresa enteros, (0 detiene la suma)");
		int numero;
		int suma = 0;
		while (true) {
			numero = leerEntero("Ingresa un número");
			if (numero == 0) {
				break;
			}
			if (numero % 2 == 0) {
				suma += numero;
				System.out.println(numero+" es par, se añade a la suma");
			}else {
				System.out.println(numero+ " es impar, no se añade");
			}
		}
		System.out.println("La suma total de los números pares es: "+suma);
	}
	//(1 °C × 9/5) + 32 = 33.8 °F
	//(1 °F − 32) × 5/9 = -17.22 °C
	static void conversionTemperatura() {

		int opcionMenúTemp;
		do {
			System.out.println(" ");
			System.out.println("Escoge una opcion para convertir la temperatura!");
			System.out.println("1. Celsius a Fahrenheit");
			System.out.println("2. Fahrenheit a Celsius");
			System.out.println("0. Salir");
			opcionMenúTemp = leerEntero("Escoge una opción");
			double temperatura;
			switch (opcionMenúTemp) {
			case 0:
				return;
			case 1:
				temperatura = leerDouble("Introduce la temperatura");
				celsiusFahrenheit(temperatura);
				break;
			case 2:
				temperatura = leerDouble("Introduce la temperatura");
				fahrenheitCelsius(temperatura);
				break;
				default:
					System.out.println("Opción Invalida");
			}

		} while (opcionMenúTemp != 0);
	}
	static void celsiusFahrenheit(double temperatura) {
		double temperaturaConvertida;
		temperaturaConvertida = (temperatura * 9/5) + 32;
		System.out.println("La temperatura en Celsius es: "+temperatura+"°C");
		System.out.println("La temperatura convertida en Fahrenheit es: "+temperaturaConvertida+"°F");
	}
	static void fahrenheitCelsius(double temperatura) {
		double temperaturaConvertida;
		temperaturaConvertida = (temperatura - 32) * 5/9;
		System.out.println("La temperatura en Fahrenheit es: "+temperatura+"°F");
		System.out.println("La temperatura convertida en Celsius es: "+temperaturaConvertida+"°C");
	}
	static int contarVocales (String texto) {
		int contador = 0;
		texto = texto.toLowerCase(); 
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;
			}
		}
		return contador;
	}
	static void factorial () {
		System.out.println("Calcular un número factorial");
		int numero = leerEntero("Introuce el número del que deseas conocer el factorial");
		
		if (numero < 0) {
			System.out.println("Error: no se puede calcular el factorial de un número menor a 0");
		}else {
			long resultado = calcularFactorial (numero); //long, tipo de dato primitivo que sirve para enteros grandes.
			System.out.println("El factorial de " +numero+ "! = "+resultado);
		}
	}
	static long calcularFactorial (int numero) {
		long factorial = 1;
		for (int i = 1; i <= numero; i++ ) {
			factorial *= i;
		}
		return factorial;
	}
	static void juegoAdivinanza() {
		System.out.println("");
		System.out.println("Bienvenido al Juego de adivinanza!");
		System.out.println("Adivina un número entre 1 y 100");
		
		Random random = new Random();
		int numeroSecreto = random.nextInt(100)+1;
		
		int intento;
		int intentos = 0;
		do {
			intento = leerEntero("Ingresa tu intento");
			intentos++;
			if (intento < numeroSecreto) {
				System.out.println("El número es MAYOR que " +intento);
			}else if (intento > numeroSecreto) {
				System.out.println("El número es MENOR que " +intento);
			}else {
				System.out.println("Felicidades! Adivinaste el número!");
				System.out.println("Lo lograste en: "+intentos+" intentos");
			}
		}while (intento != numeroSecreto);
	}
	static void pasoPorReferencia() {
		System.out.println("Paso por referencia (Intercambiar numeros)");
		
		int num1 = leerEntero("Ingresa el primer número");
		int num2 = leerEntero("Ingresa el segundo número");
		
		System.out.println("Antes del intercambio:");
		System.out.println("Numero 1: "+num1);
		System.out.println("Numero 2: "+num2);
		
		int [] numeros = {num1,num2};
		
		intercambiar (numeros);
		
		System.out.println("Después del intercambio:");
		System.out.println("Numero 1: "+numeros[0]);
		System.out.println("Numero 2: "+numeros[1]);
		System.out.println("");
	}
	static void intercambiar (int[] numeros) {
		int tempo = numeros[0];
		numeros[0] = numeros[1];
		numeros[1] = tempo;
	}
	static void tablaMultiplicar () {
		System.out.println("");
		System.out.println("Tabla de multiplicar");
		int numero = leerEntero("Ingresa el número de la tabla");
		
		System.out.println("Tabla del "+numero+ ":");
		generarTabla(numero);
		System.out.println();
		
	}
	static void generarTabla(int numero) {
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}
	}
}

