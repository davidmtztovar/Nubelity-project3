package com.nubelity.abstractClasses;

interface Constantes {
	double PI_APROXIMACION = 3.14;
	String AREA_UNIDAD = "cm2";
	String LARGO_UNIDAD = "cm";
	
}

public class ClienteConstantes  {
	public static void main(String[] args) {
		double radio=1.5;
		
		System.out.printf("La circunferencia del círculo es %.2f %s%n", Constantes.PI_APROXIMACION*radio*2, Constantes.LARGO_UNIDAD);
		
		System.out.printf("El área del círculo es %.2f %s%n", Constantes.PI_APROXIMACION*radio*radio);
	}
}
