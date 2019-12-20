package com.techlab.employee.anlayzer;

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

	static int counter = 0;

	@Override
	public boolean add(Object... objects) {
		Employee emp = EmployeeParser.newEmployee((String[]) objects);
		if (emp != null) {
			this.employees.add(emp);
			return true;
		}
		return false;
	}

	public void addFromSource(IReadable source, IParsable parser) {
		String data = source.readFile();
		parser.parse(data);
	}

}
