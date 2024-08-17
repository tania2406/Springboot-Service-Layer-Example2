package com.example.Springboot_Service_example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeServiceImpl serev;
	@RequestMapping("/test")
	public String test()
	{
		return " this test for service implementation";
	}
	@RequestMapping("/save")
	public Employee saveData(@RequestBody Employee employee)
	{
		return serev.addEmployee(employee);
		
	}
	@RequestMapping("show")
	public List<Employee> showall()
	{
		return serev.allEmployee();
	}
	@RequestMapping("/{id}")
	public Optional<Employee> byId(@PathVariable int id)
	{
		return serev.getById(id);
	}
	@RequestMapping("/upd/{id}")
	public Employee update(@RequestBody Employee emp,@PathVariable int id)
	{
		serev.update(id,emp);
		return emp;
		}
	@RequestMapping("/name/{name}")
	public List<Employee> byname(@PathVariable String name)
	{
		return serev.getByName(name);
	}
	@RequestMapping("/del/{id}")
	public String delete(@PathVariable int id)
	{
		Employee emp=serev.getById(id).get();
		serev.removeById(id);
		return "data deleted";
	}

}
