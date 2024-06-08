package com.nubelity.hilos;

class ContadorRunnableCode implements Runnable {

	private int valorActual;

	public ContadorRunnableCode() {
		valorActual = 0;
	}

	public int getValorActual() {
		return valorActual;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void run() {
		try {
			while (valorActual < 5) {
				System.out.println(Thread.currentThread().getName() + ": " + (valorActual++));
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(Thread.currentThread().getName() + " fue interrumpido");
		}
		System.out.println("Saliendo del Thread: " + Thread.currentThread().getName());
	}

}

public class ContadorRunnable {
	public static void main(String[] args) {
		ContadorRunnableCode contadorA = new ContadorRunnableCode();
		Thread hiloA = new Thread(contadorA, "Contador A");
		hiloA.start();

		try {
			int val;
			do {
				val = contadorA.getValorActual();
				System.out.println("Valor leido del contador " + 
				Thread.currentThread().getName() + ": " + val);
				Thread.sleep(2000);
			} while (val < 5);
		} catch (Exception e) {
			System.out.println("Thread main interrumpido");
		}
		
		System.out.println("saliendo del programa main");
	}
}
