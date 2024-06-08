package com.nubelity.basico;

import com.nubelity.escuela.Calificacion;
import com.nubelity.escuela.Estudiante;

public class HolaMundo {
	public static void main(String[] args) {
		Calificacion calificacion= new Calificacion();
		Estudiante estudiante = new Estudiante("Juan", 22, calificacion);
		
		
		Estudiante e2= new Estudiante("Juan", 22, calificacion);
       
        
        System.out.println("Nombre e1: "+ estudiante.nombre+"\nEdad e2: "+estudiante.edad+"\ncontador e2: "
                           +Estudiante.valorStatic+"\n Calificacion parcial 1 de "+estudiante.nombre+": "+estudiante);
        System.out.println("Nombre e2: "+ e2.nombre+"\nEdad: "+e2.edad+"\ncontador e2: "+Estudiante.valorStatic);

	}

}
