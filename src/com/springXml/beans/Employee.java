package com.springXml.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements DisposableBean,InitializingBean { 
private int id;
private String name;
private char band;
private Address address;


public Employee() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public char getBand() {
	return band;
}
public void setBand(char band) {
	this.band = band;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Employee [id=");
	builder.append(id);
	builder.append(", name=");
	builder.append(name);
	builder.append(", band=");
	builder.append(band);
	builder.append(", address=");
	builder.append(address);
	builder.append("]");
	return builder.toString();
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(int id, String name, char band) {
	super();
	this.id = id;
	this.name = name;
	this.band = band;
}
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("bean is initialized Spring Specific");
}
@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("bean is destroyed Spring Specific");
}

public static void postInitialization(){
	System.out.println("employee object initialized");
}
public static void postDestruction(){
	System.out.println("employee object is destroyed");
}

}
