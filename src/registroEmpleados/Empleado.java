package registroEmpleados;

public class Empleado {
	
	public Empleado(String name, double salary, String department) {
		
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	String name;
	double salary;
	String department;
	
	public void showInfo() {
		
		System.out.printf("Nombre: %s\nSalario: %.2f\nDepartamento: %s\n", this.name, this.salary, this.department);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
