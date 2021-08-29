package com.itadmin;

import java.util.Scanner;

import com.itadmin.beans.Employee;
import com.itadmin.services.IEmployeeService;
import com.itadmin.services.IEmployeeServiceImpl;

public class ITAdmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IEmployeeService employeeService = new IEmployeeServiceImpl();
		Employee employee = new Employee();
		System.out.println("Please enter First name :");
		employee.setFirstName(sc.next());
		System.out.println("Please enter Last name :");
		employee.setLastName(sc.next());

		System.out.println("1. Technical  \n2. Admin \n3. Human Resource \n4. Legal ");

		System.out.println("Please select department name :");

		int option = sc.nextInt();
		switch (option) {

		case 1:
			employee.setDepartmentName("Technical");
			break;
		case 2:
			employee.setDepartmentName("Admin");
			break;
		case 3:
			employee.setDepartmentName("Human Resource");
			break;
		case 4:
			employee.setDepartmentName("Legal");
			break;
		default:
			System.out.println("Please select correct option.");
			
		}
		System.out.println(employee);
		String email =employeeService.generateEmailAddress(employee);
		employee.setEmailId(email);
		String password=employeeService.generatePassword(8);
		employee.setPassword(password);
		employeeService.showCredentials(employee);
	}

}
