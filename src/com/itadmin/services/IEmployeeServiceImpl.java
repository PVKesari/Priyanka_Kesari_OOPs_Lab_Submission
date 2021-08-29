package com.itadmin.services;

import com.itadmin.beans.Employee;
import com.itadmin.util.Utility;

public class IEmployeeServiceImpl implements IEmployeeService {

	@Override
	public String generatePassword(Integer lengthPassword) {
		
		String password = Utility.randomString(lengthPassword);
		
		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		
		String firstName = employee.getFirstName();
		String lastName =employee.getLastName();
		String departmentName = employee.getDepartmentName();
		String email = firstName.toLowerCase()+lastName.toLowerCase()+"."+departmentName.toLowerCase() +"@greatlearning.com";
		char ch = '_';
		email = email.replace(' ', ch);
		return email;
	}

	@Override
	public void showCredentials(Employee employee) {
		
		String greeting = "Dear "+employee.getFirstName()+" "+employee.getLastName()+" your generated credentials are as follows:";
		System.out.println(greeting +"\nEmail Id: "+ employee.getEmailId()+ "\nPassword :"+ employee.getPassword() );
	}

	
	
}
