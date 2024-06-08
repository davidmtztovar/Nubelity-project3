package com.nubelity.referencia;

public class ClienteDos {
	public static void main(String[] args) {
      Pizza miercoles= new Pizza();
      System.out.println("Ingrediente de la pizza es: "+miercoles.ingrediente);
	  cocinar(miercoles);
	  System.out.println("Ingrediente de la pizza después de cocinar es: "+miercoles.ingrediente);
	}
	public static void cocinar(Pizza pizza) {
		pizza.ingrediente="pollo";
	}
}
 class Pizza{
	 String ingrediente="carne";
	 
 }