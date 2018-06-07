package com.springXml.beans;

public class Address {
private String state;
private String country;

public Address() {
	// TODO Auto-generated constructor stub
}


public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


public Address(String state, String country) {
	super();
	this.state = state;
	this.country = country;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Address [state=");
	builder.append(state);
	builder.append(", country=");
	builder.append(country);
	builder.append("]");
	return builder.toString();
}

public static void postInitialization(){
	System.out.println("address object initialized univeral post initialization method");
}
public static void postDestruction(){
	System.out.println("address object is destroyed universal post destruction method");
}

}
