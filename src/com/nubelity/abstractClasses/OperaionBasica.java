package com.nubelity.abstractClasses;

public class OperaionBasica extends Operacion {
	public void division(int a, int b) {
		System.out.println("Division: " + (a / b));
	}

	@Override
	public void raiz(int a) {
		System.out.println("haciendo raiz...");

	}
}
