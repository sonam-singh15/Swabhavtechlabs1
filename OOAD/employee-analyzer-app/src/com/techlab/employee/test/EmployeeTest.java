package com.techlab.employee.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.techlab.employee.Employee;
import com.techlab.employee.EmployeeAnalyzer;
import com.techlab.employee.EmployeeList;
import com.techlab.employee.FileReader;
import com.techlab.employee.Parser;
import com.techlab.employee.URLReader;

public class EmployeeTest {

	public static void main(String[] args) {
		FileReader filereader = new FileReader("C:\\Users\\Swabhav\\Desktop\\dataFile.txt");
		URLReader reader = new URLReader(" https://swabhav-tech.firebaseapp.com/emp.txt ");
		EmployeeList emplyees = new EmployeeList();
		Parser parser = new Parser(emplyees);
		emplyees.addFromSource(filereader, parser);

		EmployeeAnalyzer analyzer = new EmployeeAnalyzer(emplyees);
		Employee highestPaid = analyzer.getMax(EmployeeAnalyzer.compareSalary);
		System.out.println("Highest paid is" + highestPaid);

		Employee LOWestPaid = analyzer.getMax(EmployeeAnalyzer.compareSalary);
		System.out.println("Highest paid is" + LOWestPaid);

	}

}
