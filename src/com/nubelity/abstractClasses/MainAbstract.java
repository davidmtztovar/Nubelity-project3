package com.nubelity.abstractClasses;

public class MainAbstract {
	public static void main(String[] args) {
	/*
	 * Prueba de abstract
	 */
		OperaionBasica op = new OperaionBasica();
		op.sumar(1, 2);
		op.restar(6, 4);
		op.multiplicar(4, 4);
		op.division(9, 3);
		
		/*
		 * Prueba interfaz
		 */
		Avion a= new Avion();
	    a.encender();
		a.volar();
	    
	    
	    Pajaro p= new Pajaro();
	    p.volar();
	    
	    Aire x= new Avion();
	    x.volar();
	    
	    Maquina m= new Avion();
	    m.encender();
	}//main	

	
	
}
