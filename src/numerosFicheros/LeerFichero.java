package numerosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class LeerFichero {

	public LeerFichero() {}
	
	public List<Integer> lecturaFichero() {
		
		String rutaFichero = "C:\\Users\\Usuario\\Desktop\\datos.txt";
		List <Integer> datos = new ArrayList<Integer>();
		
		try (BufferedReader lector = new BufferedReader(new FileReader(rutaFichero))) {
			
			String linea;
			while ((linea = lector.readLine()) != null) {
				int numero = Integer.parseInt(linea);
				datos.add(numero);
			}
			
			JOptionPane.showMessageDialog(
					null,
					"Datos leídos del fichero correctamente", 
					"Información",
					JOptionPane.INFORMATION_MESSAGE
			);
			
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}
		return datos;
	}
	
}
