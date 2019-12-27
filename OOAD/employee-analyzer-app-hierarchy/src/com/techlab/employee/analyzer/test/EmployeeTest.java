package com.techlab.employee.analyzer.test;

import java.util.*;

import com.techlab.employee.anlayzer.Parser;
import com.techlab.employee.anlayzer.Designation;
import com.techlab.employee.anlayzer.FileReader;
import com.techlab.employee.anlayzer.Employee;
import com.techlab.employee.anlayzer.EmployeeAnalyzer;
import com.techlab.employee.anlayzer.EmployeeList;
import com.techlab.employee.anlayzer.URLReader;

public class EmployeeTest {
	private static final String FILEPATH = "C:\\Users\\Swabhav\\Desktop\\dataFile.txt";
	private static final String FILEURL = "https://swabhav-tech.firebaseapp.com/emp.txt";

	public static void main(String[] args) {
		FileReader dr = new FileReader(FILEPATH);
		URLReader wr = new URLReader(FILEURL);

		EmployeeList list = new EmployeeList();
		Parser parser = new Parser(list);
		list.addFromSource(dr, parser);
		// list.addFromSource(wr, parser);
		EmployeeAnalyzer analyzer = new EmployeeAnalyzer(list.getEmployees());

		Employee highestPaid = analyzer.getMax(EmployeeAnalyzer.compareSalary);
		System.out.println("higest paid: " + highestPaid);
		Employee lowestPaid = analyzer.getMin(EmployeeAnalyzer.compareSalary);
		System.out.println("lowest paid: " + lowestPaid);

		int count = analyzer.countAll(EmployeeAnalyzer.matchDepartment, 20);
		System.out.printf("employees in department 20: %d\n", count);
		count = analyzer.countAll(EmployeeAnalyzer.matchDesignation, Designation.ANALYST);
		System.out.printf("employees with designation Analyst" + ": %d\n", count);

		Map<Designation, Integer> departmentCount = analyzer.getDepartmentWiseCount();
		System.out.println("Department count is:-" + departmentCount);

	}

}
