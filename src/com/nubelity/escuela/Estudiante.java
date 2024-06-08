package com.nubelity.escuela;

public class Estudiante{

	public String nombre;
	public int edad;
	Calificacion calificacion;
	
	public static int valorStatic; //esta variable ahora vive a nivel de objeto y no de clase, guardará el último valor que reciba

	public Estudiante(String nombre, int edad, Calificacion calificacion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		calificacion = new Calificacion();
		calificacion.par1=-1;
		calificacion.par2=-1;
		calificacion.par3=-1;
		calificacion.ordinario=-1;
	}
	

	
}
