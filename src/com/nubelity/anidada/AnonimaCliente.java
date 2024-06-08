package com.nubelity.anidada;

interface IDibujo {
	void pintar();
}

class Figura implements IDibujo {

	@Override
	public void pintar() {
		System.out.println("Dibujando una igura");

	}

}

class Pintor {
	public Figura crearFigura() {
		return new Figura() {
			public void pintar() {
				System.out.println("dibujando una figura al vuelo");
			}
		};
	}

	public static IDibujo crearIDibujo() {
		return new IDibujo() {

			@Override
			public void pintar() {
				System.out.println("Dibujando un nuevo IDibujo");

			}
		};
	}
}

public class AnonimaCliente {
	public static void main(String[] args) {
      IDibujo[] dibujos= {
    		  new Pintor().crearFigura(),
    		  Pintor.crearIDibujo(),
    		  new Pintor().crearIDibujo()
      };
      
      for (IDibujo iDibujo : dibujos) {
		iDibujo.pintar();
	}
	}
}
