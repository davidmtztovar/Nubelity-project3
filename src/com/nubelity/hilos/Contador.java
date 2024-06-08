package com.nubelity.hilos;

 class ContadorThread extends Thread {
	private int valorActual;

	public ContadorThread(String nombreThread) {
		super(nombreThread);
		valorActual=0;
		System.out.println(this);
		start();
	}
	
	public int getValorActual() {
		return valorActual;
	}
	
	public void run() {
		
			try {
				while(valorActual<5) {
					System.out.println(getName()+": "+(valorActual++));
				Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(getName()+" fue interrumpido");
			}
			System.out.println("Saliendo del Thread: "+getName());
		}
	}
	
	



public class Contador{
	public static void main(String[] args) {
		System.out.println("Thread del Metodo "+
	                        Thread.currentThread().getName());
		ContadorThread contadorA= new ContadorThread("Contador A");
		ContadorThread contadorB= new ContadorThread("Contador B");
		
	    System.out.println("Saliendo del programa main");
	}
	
	
	
}
