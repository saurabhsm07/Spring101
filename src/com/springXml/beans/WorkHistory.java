package com.springXml.beans;

public class WorkHistory {
private int numberOfCompanies;
private String previousRole;
private long lastCtc;

public WorkHistory() {
	// TODO Auto-generated constructor stub
}
public WorkHistory(int numberOfCompanies, String previousRole, long lastCtc) {
	super();
	this.numberOfCompanies = numberOfCompanies;
	this.previousRole = previousRole;
	this.lastCtc = lastCtc;
}
public int getNumberOfCompanies() {
	return numberOfCompanies;
}
public void setNumberOfCompanies(int numberOfCompanies) {
	this.numberOfCompanies = numberOfCompanies;
}
public String getPreviousRole() {
	return previousRole;
}
public void setPreviousRole(String previousRole) {
	this.previousRole = previousRole;
}
public long getLastCtc() {
	return lastCtc;
}
public void setLastCtc(long lastCtc) {
	this.lastCtc = lastCtc;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("WorkHistory [numberOfCompanies=");
	builder.append(numberOfCompanies);
	builder.append(", previousRole=");
	builder.append(previousRole);
	builder.append(", lastCtc=");
	builder.append(lastCtc);
	builder.append("]");
	return builder.toString();
}


}
