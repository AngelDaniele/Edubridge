package com.edubridge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_table")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="Employee_id")
private int EmpId;
@Column(name="Employee_name",nullable=false,length=30)
private String EmpName;
@Column(name="Emp_salary")
private double salary;
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}

