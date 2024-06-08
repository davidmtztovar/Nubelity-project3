package com.nubelity.referencia;

public class ClienteUno {
	public static void main(String[] args) {
        FabricaPizzas fabricaPizzas= new FabricaPizzas();
        int precioPizza= 15;
        double precioTotal= fabricaPizzas.calcularPrecio(4, precioPizza);
        System.out.println("precio por una pizza: "+precioPizza
        		+"\nprecio Total: "+precioTotal);
	}// clienteUno

}

class FabricaPizzas {
	public double calcularPrecio(int numPizzas, double precioPizza) {
		precioPizza = precioPizza / 2.0;
		return numPizzas * precioPizza;
	}
}