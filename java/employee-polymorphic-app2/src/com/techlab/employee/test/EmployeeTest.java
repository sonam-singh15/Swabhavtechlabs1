package com.techlab.employee.test;

import com.techlab.employee.Analyst;
import com.techlab.employee.Developer;
import com.techlab.employee.Employee;
import com.techlab.employee.Manager;

public class EmployeeTest {
	public static void main(String[] args) {
		System.out.println("Managers Info:- ");
		Manager m = new Manager(1230, "Sonam", 4560);
		printInfo(m);

		System.out.println(" ");

		System.out.println("Developer Info:- ");
		Developer d = new Developer(3456, "Anjali", 6780);
		printInfo(d);

		System.out.println(" ");
		System.out.println("Anlayst Info:- ");
		Analyst a = new Analyst(1235, "abhi", 5660);
		printInfo(a);

	}

	public static void printInfo(Employee emp) {
		System.out.println("Employee id is:" + emp.getEmpId());
		System.out.println("Employee name is:" + emp.getEmpname());
		System.out.println("Net salary is " + emp.calculateSalary());

		if (emp instanceof Manager) {
			Manager m = (Manager) emp;
			System.out.println("manager HRA:- " + m.getHRA());
			System.out.println("manager DA:- " + m.getDA());
			System.out.println("manager DA:- " + m.getTA());

		}
		if (emp instanceof Developer) {
			Developer d = (Developer) emp;
			System.out.println("developer bonus:- " + d.getBONUS());
			System.out.println("developer PA:- " + d.getPA());
		}
		if (emp instanceof Analyst) {
			Analyst a = (Analyst) emp;
			System.out.println("developer bonus:- " + a.getPERKS());
		}
	}

}
