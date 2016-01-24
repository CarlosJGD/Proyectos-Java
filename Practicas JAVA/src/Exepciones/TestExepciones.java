package Exepciones;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// ADVERTENCIA: Las excepciones que derivan de RunTimeException se deben de corregir para que NO
// sucedan, es una mala praxis de programación usar un try .. catch para ello.
// El ejemplo que pongo aqui es solo con fines didácticos se debería de poner los medios para evitarlos

public class TestExepciones {

	private static void pedirDatos() {
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = entrada1.nextLine();
		
		System.out.print("Introduce tu edad: ");
		int edad = entrada1.nextInt();
		
		System.out.println("Hola " + nombre + ". El año que viene cumples " + (edad++) + " años");
		entrada1.close();
		
		System.out.println("Hemos terminado!!!");
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("1.- Introducir Datos");
		System.out.println("2.- Salir del programa");
		System.out.println("Qué deseas hacer?");
		int opcion = entrada.nextInt();
		//entrada.close(); Si desactivamos esta línea nos da una excepcion de tipo: NoSuchElementException 
		if (opcion == 1) {
			try {
				pedirDatos();
			} catch (InputMismatchException e) {
				System.out.println("Tipo de dato NO correcto: " + e.getClass().getName());
			} catch (NoSuchElementException e) {
				System.out.println("No recoge nada por teclado: " + e.getMessage());
			} finally {
				// Lo que pongamos aquí siempre se ejecutará se lanze una excepción o NO.
			}
		}
		System.out.println("Adios!!!!");
		entrada.close();
	}
}
