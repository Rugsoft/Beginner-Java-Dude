package registroEmpleados;

public class Gerente extends Empleado {
	
	public Gerente(String name, double salary, String department, Empleado[] team) {
		
		super(name, salary, department);
		this.team = team;
	}

	Empleado[] team;

	public void showInfo() {
		
		super.showInfo();
		System.out.println("Equipo: ");
		for (Empleado emp : team) {
			System.out.println("- " + emp.getName());
		}
	}
	
	public Empleado[] getTeam() {
		return team;
	}

	public void setTeam(Empleado[] team) {
		this.team = team;
	}

}
