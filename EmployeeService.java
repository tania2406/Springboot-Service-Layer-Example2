package com.example.Springboot_Service_example;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

	Employee addEmployee(Employee employee);
	List<Employee> allEmployee();
	Optional<Employee> getById(int id);
	List<Employee> getByName(String name);
	Employee update (int id,Employee employee);
	void removeById(int id);
	
}
