package com.springXml.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author saurabh_mahambrey
 *Student:partially autwired class with context annotation config
 */
public class Student {
	private int id;
	private String name;
	private byte rank; 
	@Autowired(required=false)                                      //by default its by type so if multiple beans then ambiquity
	@Qualifier(value="addressSchool")               //to select a perticular bean we must use a qualifier
	private Address address;
	
	public Student() {
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
	public byte getRank() {
		return rank;
	}
	public void setRank(byte band) {
		this.rank = band;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int id, String name, byte band,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.rank = band;
		this.address = address;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", band=");
		builder.append(rank);
		builder.append(", addresses=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}
