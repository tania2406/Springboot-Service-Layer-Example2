package com.example.Springboot_Service_example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepository erepo;
	
	@Override
	public Employee addEmployee(Employee employee)
	{
		return erepo.save(employee);
	}

	@Override
	public Optional<Employee> getById(int id)
	{
		return erepo.findById(id);
	}
	@Override
	public void removeById(int id)
	{
		erepo.deleteById(id);
	}
	@Override
	public Employee update(int id,Employee employee)
	{
		employee.setId(id);
		return erepo.save(employee);
	}
	@Override
	public List<Employee> allEmployee() {
		// TODO Auto-generated method stub
		return erepo.findAll();
	}
	@Override
	public List<Employee> getByName(String name) {
		// TODO Auto-generated method stub
		return erepo.findByName(name);
	}


}
