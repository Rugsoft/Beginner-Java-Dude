package bibliotecaDigital;

public class Revista extends Publicacion {
	
	public Revista(String title, String author, int publishYear, int editionNumber) {
		
		super(title, author, publishYear);
		this.editionNumber = editionNumber;
	}

	int editionNumber;

	public void resumen() {
		super.resumen();
		System.out.printf("\nNumero de edicion: %d", this.editionNumber);
	}
	
	public int getEditionNumber() {
		return editionNumber;
	}

	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}

}
