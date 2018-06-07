package com.springXml.beans;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author saurabh_mahambrey
 *Employee:wired using xml configuration in spring beans config
 */
public class Employee implements DisposableBean,InitializingBean { 
private int id;
private String name;
private char band;
private Map<String,Address> addresses;


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


public Map<String,Address> getAddress() {
	return addresses;
}
public void setAddresses(Map<String,Address> address) {
	this.addresses = address;
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
	System.out.println("bean is initialized Spring Specific Initializing bean");
}
@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("bean is destroyed Spring Specific disposable bean");
}

public static void postInitialization(){
	System.out.println("employee object initialized");
}
public static void postDestruction(){
	System.out.println("employee object is destroyed");
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
	builder.append(", addresses=");
	builder.append(addresses);
	builder.append("]");
	return builder.toString();
}

}
