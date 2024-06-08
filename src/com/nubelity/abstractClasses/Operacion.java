package com.nubelity.abstractClasses;

public abstract class Operacion {
 public void sumar(int a, int b) {
	 System.out.println("suma: "+(a+b));
 }
 
 public void restar(int a, int b) {
	 System.out.println("resta: "+(a-b));
 }
 
 public void multiplicar (int a, int b) {
	 System.out.println("multiplicacion: "+(a*b));
 }
 
 public abstract void raiz(int a);
}
