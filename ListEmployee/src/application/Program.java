package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;


public class Program {
	
	public static Integer position(List<Employee> list, int id) { // FUNCTION THAT RUN ALL THE LIST LOOKING FOR THE POSITION ID
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id)
				return i;
		}
	return null;	
	}
	
	public static boolean hasId (List<Employee> list, int id) {  // FUNCTION THAT RUN ALL THE LIST LOOKING FOR THE ID
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);		
			
		List<Employee> list = new ArrayList<>();	
		
		Integer id;
		String name;
		Double salary;
		int number;
		
		System.out.println("How many employees will be registered ?");
		number = sc.nextInt();
				
		sc.nextLine();
		for (int i = 0; i<number;i++) {
			
			System.out.printf("Emplyoee # %d:", i + 1);
			id = sc.nextInt();
			
			while (hasId (list, id)) {
				System.out.println("This ID has already added");
				id = sc.nextInt();
			}
			
			System.out.printf("Name");
			name = sc.next();
			System.out.println("Salary");
			salary = sc.nextDouble();
			
			Employee emp = new Employee(name, id, salary);
			
			list.add(emp);
						
		}		
	
		
		System.out.println();
		
		/*
		System.out.println("Enter the employee id that will have the salary increased");
		int id_employee = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id_employee).findFirst().orElse(null);
		
		if (emp == null)
			System.out.println("This ID doesn't exist");
		else
			System.out.println(emp);
		
		*/
		
		System.out.println("Enter the employee id that will have the salary increased");
		int id_employee2 = sc.nextInt();
		
		Integer pos = position(list, id_employee2);
		
		if (pos == null)
			System.out.println("This ID doesn't exist");
			
		else {
			System.out.println("Enter with the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).incriseSalary(percentage);
				
		}
				
			System.out.println("List of employee");
			System.out.println();
		
		for (Employee listEmployee: list) {
				System.out.println(listEmployee);
		}
			
		sc.close();
		

		}

}
