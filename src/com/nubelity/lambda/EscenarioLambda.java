package com.nubelity.lambda;

@FunctionalInterface
interface RaizCuadrada{
	double encontrarRaizCuadrada(int n);
}

@FunctionalInterface
interface Bienvenida{
  String saludar(String name);

}

@FunctionalInterface
interface BienvenidaVoid{
  void saludar();

}

@FunctionalInterface
interface Adicion{
	int sumar(int a, int b);
}


public class EscenarioLambda {
	public static void main(String[] args) {
	//al tener solo un parametro se pueden omitir los paréntesis
      RaizCuadrada raizCuadradaImpl= numero->{
    	  double resultado= Math.sqrt(numero);
    	  return resultado;
      };
      
      Bienvenida bienvenida= (String name)->{
    	  String saludo= "Saludos "+name+" nos conocemos al fin";
		return saludo;
      };
      
      BienvenidaVoid bienvenida2= ()->{
    	  System.out.println("Hola, que hay");
      };
      
      Adicion suma= (int num1, int num2)->{
    	  return num1+num2;  
      };
      
      System.out.println(bienvenida.saludar("panda"));
      bienvenida2.saludar();
      System.out.println(suma.sumar(777, 223));
	}
}
