package entities;

public class Employee {
	
	private String name;
	private Integer id;
	private Double salary;
	
	
	public Employee(String name, Integer id, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " +String.format("%.2f", salary) ;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public void incriseSalary (double percente) {
		salary += salary * percente / 100;
	}
}	


