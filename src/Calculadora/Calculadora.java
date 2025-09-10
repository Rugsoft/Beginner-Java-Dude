package Calculadora;

public class Calculadora {
	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	double numero1;
	double numero2;
	
	public void sumar() {
		
		double total = numero1 + numero2;
		System.out.println("La suma de "+numero1+" y "+numero2+" es: "+total);
	}
	
	public void restar() {
		
		double total = numero1 - numero2;
		System.out.println("La resta de "+numero1+" y "+numero2+" es: "+total);
		
	}
	
	public void multiplicar() {
		
		double total = numero1 * numero2;
		System.out.println("La multiplicacion de "+numero1+" y "+numero2+" es: "+total);
		
	}
	
	public void dividir() {
		
		if (numero2 == 0) {
			
			System.out.println("No se puede dividir por cero");
		}else {
			
			double total = numero1 / numero2;
			System.out.println("La division de "+numero1+" y "+numero2+" es: "+total);
		}
		
		
	}
		

}
