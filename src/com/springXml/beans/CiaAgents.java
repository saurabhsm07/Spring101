package com.springXml.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



/**
 * @author saurabh_mahambrey
 *CiaAgents:fully autowired bean using context component scan
 */
@Component(value="ciaagents")
public class CiaAgents {
@Autowired
@Qualifier(value="employeeA")
Employee employee;
@Autowired
@Qualifier(value="studentA")
Student student;
@Autowired
@Qualifier(value="addressA")
Address address;

public CiaAgents() {
	// TODO Auto-generated constructor stub
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public CiaAgents(Employee employee, Student student, Address address) {
	super();
	this.employee = employee;
	this.student = student;
	this.address = address;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("CiaAgents [employee=");
	builder.append(employee);
	builder.append(", student=");
	builder.append(student);
	builder.append(", address=");
	builder.append(address);
	builder.append("]");
	return builder.toString();
}

}
