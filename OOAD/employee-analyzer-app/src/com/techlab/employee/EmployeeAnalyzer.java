package com.techlab.employee;

import java.util.*;

public class EmployeeAnalyzer {

	private Collection<Employee> list;

	public EmployeeAnalyzer(EmployeeList emplyees) {
		this.list = (Collection<Employee>) emplyees;
	}

	public Employee getMax(Comparator<Employee> comparator) {
		return Collections.max(list, comparator);
	}

	public Employee getMin(Comparator<Employee> comparator) {
		return Collections.min(list, comparator);
	}

	public int countAll(Comparator<Object> comparator, Object condition) {
		int count = 0;
		for (Employee emp : list) {
			if (comparator.compare(emp, condition) == 0)
				count++;
		}
		return count;
	}

	public List<Employee> findAll(Comparator<Object> comparator, Object condition) {
		List<Employee> found = new ArrayList<Employee>();
		for (Employee emp : list) {
			if (comparator.compare(emp, condition) == 0)
				found.add(emp);
		}
		return found;
	}

	public static final Comparator<Employee> compareSalary = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			if (emp1.getSalary() == emp2.getSalary())
				return 0;
			return emp1.getSalary() < emp2.getSalary() ? -1 : 1;
		}
	};

	public static Employee newEmployee(String[] values) {
		if (values.length < 8)
			return null;

		int id = Integer.parseInt(values[0]);

		String name = values[1].replace("'", "");

		int managerid = Integer.parseInt(values[2]);

		double salary = Double.parseDouble(values[4]);
		return newEmployee(values);

	}

}