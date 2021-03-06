package com.training.exercise4.config;

import org.springframework.batch.item.ItemProcessor;

import com.training.exercise4.model.Employee;

public class EmpItemProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee item) throws Exception {
		String name = item.getName().toUpperCase();
		String role = item.getRole().toUpperCase();
		item.setName(name);
		item.setRole(role);
		return item;
	}

}
