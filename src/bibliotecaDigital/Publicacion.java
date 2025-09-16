package bibliotecaDigital;

public class Publicacion {

	public Publicacion(String title, String author, int publishYear) {
	
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	String title;
	String author;
	int publishYear;
	
	public void resumen() {
		
		System.out.printf("\nTitulo: %s\nAutor: %s\nAño de publicación: %d", this.title, this.author, this.publishYear);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
}
