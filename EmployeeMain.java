package com.collections.java;
import java.util.*;
public class EmployeeMain {
	public static void main(String[]args)
	{
		ArrayList employee=new ArrayList();
		Employee obj1=new Employee(1,"Siva",50000);
		Employee obj2=new Employee(2,"ganesh",100000);
		employee.add(obj1);
		employee.add(obj2);
		System.out.println(employee);
		
		System.out.println("Hash set");
		Employee obj3=new Employee(3,"Naveen",500000);
		HashSet set=new HashSet();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		System.out.println(set);
		
		System.out.println("Tree set");
		TreeSet emp=new TreeSet();
		emp.add(obj1);
		emp.add(obj2);
		emp.add(obj3);
		System.out.println(emp);
	}
	
}
