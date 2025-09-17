package creacionTanque;

public class Piloto {
	
	private String name;
	private String rank;
	private double salary;
	
	public Piloto(String name, String rank, double salary) {
		super();
		this.name = name;
		this.rank = rank;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
