package FigurasGeometricas;

public class Main {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(5);
		Rectangulo rectangulo = new Rectangulo(4,6);
		
		circulo.calcularArea();
		circulo.calcularPerimetro();
		rectangulo.calcularArea();
		rectangulo.calcularPerimetro();
		

	}

}
