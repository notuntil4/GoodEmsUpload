package com.cognixia.jump;

public class EmsMenu {
	
	public void mainMenu() {
		
		System.out.println("Welcome to the EMS Application");
		System.out.println("Select an option:");
		
		
		System.out.println("1. View Employees \n2.Add Employee \n3. Delete Employee \n4.Edit Employee");
		int choice = 1;
		
		switch (choice) {
		case 1:
			viewEmployees();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			editEmployee();
		default:
			break;
		}
		
	}
	
	public void viewEmployees() {
		// code to view employees
	}
	
	public void editEmployee() {
		
		
		
		
	}

}
