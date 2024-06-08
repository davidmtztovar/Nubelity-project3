package com.nubelity.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EscenarioList {
	final static int NUM_DIGITOS=5;
	public static void main(String[] args) {
         try {
        	 if(args.length !=1 || args[0].length() != NUM_DIGITOS)
        	 throw new IllegalArgumentException();
        	 Integer.parseInt(args[0]);
         }catch (IllegalArgumentException e) {
			System.err.println
			("El parametro debe ser un digito de #"+NUM_DIGITOS+" posisciones");
			return;
		}
         
         String parametro=args[0];
         System.out.println("Parametro ingresado: "+parametro);
         
         ArrayList<Integer> numeroMagico= new ArrayList<Integer>();
         numeroMagico.add(5);
         numeroMagico.add(3);
         numeroMagico.add(2);
         numeroMagico.add(7);
         numeroMagico.add(2);
         
         List<Integer> numeroParametro= new ArrayList<Integer>();
         for(int i=0; i<parametro.length(); i++) 
           numeroParametro.add(Character.getNumericValue(parametro.charAt(i)));
           
           List<Integer> duplicado= new ArrayList<Integer>(numeroMagico);
           int numeroDigitosIncluidos=0;
           for(int i=0; i<NUM_DIGITOS;i++)
        	   if(duplicado.remove(numeroParametro.get(i))) 
        		   numeroDigitosIncluidos++;
           
           System.out.println("Numero de digitos incluidos: "+numeroDigitosIncluidos);
           ListIterator<Integer> correcto= numeroMagico.listIterator();
           ListIterator<Integer> entrada= numeroParametro.listIterator();
           int numeroDigitosColocados= 0;
           while(correcto.hasNext()) {
        	   if(correcto.next().equals(entrada.next()))
        		   numeroDigitosColocados++;
           }
           System.out.println("Numero de digitos exactamente colocados: "
           		+ numeroDigitosColocados);
           
      }
}
