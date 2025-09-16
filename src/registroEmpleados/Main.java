package registroEmpleados;

public class Main {

	public static void main(String[] args) {
		
		Empleado Cesar = new Empleado("César", 2500, "Soporte");
		Empleado Gerson = new Empleado("Gerson", 1500, "Ciberseguridad");
		Empleado Oliver = new Empleado("Oliver", 2150, "Dragon ball");
		
		Empleado[] listaEquipo = {Cesar, Gerson, Oliver};
		
		Gerente Albert = new Gerente("Albert", 3500, "Profesor", listaEquipo);
		
		System.out.println("Informacion de empleados:");
		System.out.println("-------------------------");
		Cesar.showInfo();
		System.out.println("-------------------------");
		Gerson.showInfo();
		System.out.println("-------------------------");
		Oliver.showInfo();
		System.out.println("-------------------------");
		System.out.println("Informacion de Gerente:");
		System.out.println("----------------------");
		Albert.showInfo();

	}

}
