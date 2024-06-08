package com.nubelity.anidada;

public class LastaPool {
	public void mensajeEnListaPool() {
      System.out.println("Este es el objeto en lista pool");
	}
	
	private static class MiListaLigada{
		private static int numeroMaximo= 100;
		private int numeroActualElementos;
		
		public static  void mensajeEnMiListaLigada() {
			System.out.println("Esta es la clase MiListaLigada");
		}
		
		interface ILiga { int NUMERO_MAXIMO_NODOS=2000; }
		
		protected static class Nodo implements ILiga{
			private int maximo= NUMERO_MAXIMO_NODOS;
			
			public void mensajeEnNodo() {
				int numeroMaximoLista= numeroMaximo;
				int nodosMaximos= maximo;
				
				mensajeEnMiListaLigada();
			}
			
			public static void main(String[] args) {
				int numeroMaximoLista= numeroMaximo;
				mensajeEnMiListaLigada();
			}
		}
	}
}
