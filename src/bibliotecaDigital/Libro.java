package bibliotecaDigital;

public class Libro extends Publicacion {

	public Libro(String title, String author, int publishYear, int pageNumber) {
		
		super(title, author, publishYear);
		this.pageNumber = pageNumber;
	}

	int pageNumber;

	public void resumen() {
		super.resumen();
		System.out.printf("\nNumero de paginas: %d", this.pageNumber);
	}
	
	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
}
