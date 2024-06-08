package com.nubelity.abstractClasses;

public class Avion implements Aire, Maquina{

	@Override
	public void volar() {
       System.out.println("Volando como avion");		
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor");
		
	}

}
