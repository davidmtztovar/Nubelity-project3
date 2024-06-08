package com.nubelity.colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EscenarioSet {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
		set1.add("desayuno");
		set1.add("comida");
		set1.add("merienda");
		set1.add("cena");
		
		System.out.println("Contenido del conjunto 1:");
		for (String setElement : set1) {
			System.out.println(setElement);
		}
		
		Set<String> set2= new LinkedHashSet<>();
		set2.add("desayuno");
		set2.add("comida");
		set2.add("merienda");
		set2.add("cena");
		
		//vector es igual a un arraylist pero es seguro ante hilos
		System.out.println("Contenido del conjunto 2, ligadura de elementos:");
		for (String setElement : set2) {
			System.out.println(setElement);
		}
	}
}
