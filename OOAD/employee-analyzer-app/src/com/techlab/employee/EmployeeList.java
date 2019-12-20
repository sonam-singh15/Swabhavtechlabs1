package com.techlab.employee;

import java.util.*;

public class EmployeeList implements IParseAdable {
	private HashSet<Employee> employees;

	public EmployeeList() {
		this.employees = new HashSet<Employee>();
	}

	public boolean addEmployee(Employee employee) {
		if (employee == null)
			return false;
		return this.employees.add(employee);
	}

	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void addFromSource(IReadable source, IParsable parser) {
		String data = source.readFile();
		parser.parse(data);
	}

	@Override
	public boolean add(Object... objects) {
		Employee emp = EmployeeAnalyzer.newEmployee((String[]) objects);
		this.employees.add(emp);
		return false;
	}

}
