package com.nubelity.colecciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class EscenarioMap {
	public static void main(String[] args) {
          Map<Integer,Integer> frecuenciaMap= new HashMap<>();
          
          for(String argumento: args) {
        	  double peso= Double.parseDouble(argumento);
        	  int pesoFrecuencia= (int)Math.round(peso/5)*5;
        	  System.out.println(peso+" ->"+pesoFrecuencia+"\n");
        	  Integer frecuencia= frecuenciaMap.get(pesoFrecuencia);
        	  frecuencia= (frecuencia== null)? 1 : frecuencia+1;
        	  frecuenciaMap.put(pesoFrecuencia, frecuencia);
          }
          
//          for(Map.Entry<Integer, Integer> entrada: frecuenciaMap.entrySet()) {
//        	  System.out.println(entrada.getKey()+":\t"+entrada.getValue());
//          }
          
          SortedSet<Integer> frecuenciasSet= new TreeSet<Integer>(frecuenciaMap.keySet());
          for (int frec : frecuenciasSet) {
			int frecuencia= frecuenciaMap.get(frec);
			char[]barra= new char[frecuencia];
			Arrays.fill(barra, 'X');
			System.out.println(frec+":\t"+new String(barra));
		}
        		  
	}
}
