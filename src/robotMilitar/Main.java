package robotMilitar;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double limitePresupuesto = 15000000;
		
		Exoesqueleto exo = new Exoesqueleto("Vibranium", 1250, 1500000);
		Armamento arma = new Armamento("Gatling", true, 250000);
		InteligenciaA IA = new InteligenciaA(4.5, "Grapler", 2500000);
		
		JOptionPane.showMessageDialog(
				null,
				"Bienvenido al creador de Robots", 
				"Información",
				JOptionPane.INFORMATION_MESSAGE
		);
		
		String tipoRobot = JOptionPane.showInputDialog("Eliga que robot quiere crear, pulse 1 para Marino o 2 para Asalto: ");
		
		if (tipoRobot.equals("1")) {
			
			String stringProfundidad = JOptionPane.showInputDialog("Eliga la profundidad de su robot marino:");
			int profundidad = Integer.parseInt(stringProfundidad);
			
			RobotMarino AquaRobot = new RobotMarino("Aquarius", "TexasInstruments", "Ejpaña", profundidad, exo, arma, IA);
			
			if(AquaRobot.calculo() <= limitePresupuesto ) {
				
				AquaRobot.mostrar();
			} else {
				
				JOptionPane.showMessageDialog(
						null,
						"El presupuesto exede los límites", 
						"ERROR",
						JOptionPane.ERROR_MESSAGE
				);
			}
			
		} else {
		
			String durabilidad = JOptionPane.showInputDialog("Eliga la durabilidad de su robot de asalto:");
			
			RobotAsalto Durandal = new RobotAsalto("Prismatico", "Pioneer Tecnologies", "Japon", durabilidad, exo, arma, IA);
			
			if(Durandal.calculo() <= limitePresupuesto ) {
				
				Durandal.mostrar();
			} else {
				
				JOptionPane.showMessageDialog(
						null,
						"El presupuesto exede los límites", 
						"ERROR",
						JOptionPane.ERROR_MESSAGE
				);
			}
		}
			
		
		
	}
}	
