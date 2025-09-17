package creacionTanque;

import javax.swing.JOptionPane;

public class Tanque {
	
	private Piloto piloto;
	private Chasis chasis;
	private int serialNumber;
	private String madeDate;
	
	public Tanque(Piloto piloto, Chasis chasis, int serialNumber, String madeDate) {
		super();
		this.piloto = piloto;
		this.chasis = chasis;
		this.serialNumber = serialNumber;
		this.madeDate = madeDate;
	}

	public void mostrar() {
		double total = chasis.getPrice() + piloto.getSalary();
		JOptionPane.showMessageDialog(null,
				"Nombre piloto: " + piloto.getName() +
				"\nRango: " + piloto.getRank() +
				"\nSueldo: " + piloto.getSalary() +" €" +
				"\nPuntos de estructura: " + chasis.getStructurePoints() +
				"\nMaterial: " + chasis.getMaterial() +
				"\nPrecio: " + chasis.getPrice() +" €" +
				"\nNumero de serie: " + this.getSerialNumber() +
				"\nFecha de creación: " + this.getMadeDate() +
				"\nTotal gasto del tanque: " + total +" €", 
				"Información", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMadeDate() {
		return madeDate;
	}

	public void setMadeDate(String madeDate) {
		this.madeDate = madeDate;
	}
	
	
	
}
