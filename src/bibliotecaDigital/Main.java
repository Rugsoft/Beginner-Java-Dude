package bibliotecaDigital;

public class Main {

	public static void main(String[] args) {
		
		Publicacion folleto = new Publicacion("Como programar con Java", "Albert LLauradó", 2023);
		Libro libro1 = new Libro("Dune", "Frank Herbert", 1965, 784);
		Revista revista1 = new Revista("F1UM", "Victor Abad", 2025, 2);
		
		System.out.printf("-------------");
		System.out.printf("\nFolleto\n");
		System.out.printf("-------------");
		folleto.resumen();
		System.out.printf("\n-------------");
		System.out.printf("\nLibro\n");
		System.out.printf("-------------");
		libro1.resumen();
		System.out.printf("\n-------------");
		System.out.printf("\nRevista\n");
		System.out.printf("-------------");
		revista1.resumen();

	}

}
