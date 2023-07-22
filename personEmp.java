package com.gurukul.day6;

import java.util.Scanner;

class Person {
    String name;
    int age;

    Person() {
    }

    Person(String n, int a) {
	name = n;
	age = a;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
    }

}

class Employee extends Person {
    int e_id;
    double salary;

    Employee() {
    }

    Employee(String n, int a, int e, double sal) {
	super(n, a);
	e_id = e;
	salary = sal;

    }

    public int getE_id() {
	return e_id;
    }

    public void setE_id(int e_id) {
	this.e_id = e_id;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    @Override
    public String toString() {
	return "Employee [e_id=" + e_id + ", salary=" + salary + ", name=" + name + ", age=" + age + "]";
    }

}

class Teacher extends Employee {
    String subject;

    Teacher() {
    }

    Teacher(String n, int a, int e, double sal, String sub) {
	super(n, a, e, sal);
	subject = sub;

    }

    public String getSubject() {
	return subject;
    }

    public void setSubject(String subject) {
	this.subject = subject;
    }

    @Override
    public String toString() {
	return "Teacher [subject=" + subject + ", e_id=" + e_id + ", salary=" + salary + ", name=" + name + ", age="
		+ age + "]";
    }

}

class Principle extends Teacher {
    int years;

    Principle() {
    }

    Principle(String n, int a, int e, double sal, String sub, int y) {
	super(n, a, e, sal, sub);
	years = y;
    }

    public int getyears() {
	return years;
    }

    public void setyears(int years) {
	years = years;
    }

    @Override
    public String toString() {
	return "Principle [years=" + years + ", subject=" + subject + ", e_id=" + e_id + ", salary=" + salary
		+ ", name=" + name + ", age=" + age + "]";
    }

}

class Officer extends Employee {
    String dept;

    Officer() {
    }

    Officer(String n, int a, int e, double sal, String sub) {
	super(n, a, e, sal);
	dept = sub;
    }

    public String getDept() {
	return dept;
    }

    public void setDept(String dept) {
	this.dept = dept;
    }

    @Override
    public String toString() {
	return "Officer [dept=" + dept + ", e_id=" + e_id + ", salary=" + salary + ", name=" + name + ", age=" + age
		+ "]";
    }

}

public class personEmp {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Teacher t = new Teacher("Ram", 30, 192, 20000, "Math");
	Teacher t2 = new Teacher("Ravi", 40, 201, 30000, "science");
	Teacher t3 = new Teacher("Ranu", 20, 301, 23000, "bio");
	Principle p = new Principle("Anita", 23, 402, 32890, "math", 15);
	Officer o = new Officer("komal", 15, 503, 32000, "income tax");
	Employee emp[] = new Employee[5];
	emp[0] = t;
	emp[1] = t2;
	emp[2] = t3;
	emp[3] = p;
	emp[4] = o;
	Employee temp;
	for (int i = 0; i < emp.length; i++) {
	    for (int j = 0; j < emp.length - 1; j++) {
		if (emp[j].getAge() > emp[j + 1].getAge()) {
		    temp = emp[j];
		    emp[j] = emp[j + 1];
		    emp[j + 1] = temp;
		}
	    }
	}

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the lower age:");
	int low = sc.nextInt();
	System.out.println("Enter the upper age:");
	int up = sc.nextInt();

	int l = 0, u = 0;
	for (int i = 0; i < emp.length; i++) {
	    if (emp[i].getSalary() > emp[u].getSalary()) {
		u = i;
	    }
	    if (emp[i].getSalary() < emp[l].getSalary()) {
		l = i;
	    }

	    if (emp[i].getAge() >= low && emp[i].getAge() <= up) {
		System.out.println("employees between given age: " + emp[i]);
	    }

	}
	System.out.println("Employee with lower salary " + emp[l]);
	System.out.println("Employee with higher salary " + emp[u]);

	for (int i = 0; i < emp.length; i++) {
	    System.out.println(" " + emp[i]);
	}

    }

}
