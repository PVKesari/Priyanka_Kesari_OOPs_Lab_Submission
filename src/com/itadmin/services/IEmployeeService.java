package com.itadmin.services;

import com.itadmin.beans.Employee;

public interface IEmployeeService {
	
	
	
	public String generateEmailAddress(Employee employee);
	

	public String generatePassword(Integer lengthPassword);

	public void showCredentials(Employee employee);

}
