package com.nubelity.excepciones;

public class PruebaExcepciones {

	public static void main(String[] args) {
		try {
			imprimirPromedio(100,0);
		} catch (ArithmeticException e) {
			System.out.println("excepcion manejada en main method");
		}
		System.out.println("fin del main");
		
	}//main
	
	public static void imprimirPromedio(int totalSum, int totalNumero) {
		try {
			int promedio= calculaPromedio(totalSum, totalNumero);
			System.out.println("Promedio: "+totalSum+" / "+totalNumero+" = "+ promedio);
		    System.out.println("Fin del método imprimir promedio");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Impresion en finally");
		}
	}

	private static int calculaPromedio(int totalSum, int totalNumero) {
		System.out.println("calcular el promedio");
		return totalSum/totalNumero;
	}
}
