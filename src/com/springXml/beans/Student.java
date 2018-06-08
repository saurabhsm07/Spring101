package com.springXml.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;

/**
 * @author saurabh_mahambrey
 *Student:partially autwired class with context annotation config
 */
public class Student implements ApplicationContextAware,BeanNameAware,BeanFactoryAware {
	private int id;
	private String name;
	private byte rank; 
	@Autowired(required=false)                                      //by default its by type so if multiple beans then ambiquity
	@Qualifier(value="addressSchool")               //to select a perticular bean we must use a qualifier
	private Address address;
	private ApplicationContext contextObj;
	
	@Autowired
	private MessageSource msgObj;
	
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
	@Override
	public void setApplicationContext(ApplicationContext applicationContextObj)
			throws BeansException {
		// TODO Auto-generated method stub
		this.contextObj = applicationContextObj;
		System.out.println("setting application context "+contextObj.toString());
	}
	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("bean name "+beanName);
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
	}
	public ApplicationContext getContextObj() {
		return contextObj;
	}
	public void setContextObj(ApplicationContext contextObj) {
		this.contextObj = contextObj;
	}
	public MessageSource getMsgObj() {
		return msgObj;
	}
	public void setMsgObj(MessageSource msgObj) {
		this.msgObj = msgObj;
	}
	/**
	 * testing internationalization normal msg
	 */
	
	public void displayMsg(){
		
		System.out.println(this.getMsgObj().getMessage("msg3", null, "nope..",null)+" "+this.getMsgObj().getMessage("msg4", null, "nope..",null));
	}
	
/**
 * testing internationalization paramaterised msg
 */
public void displayNameRank(){
		
		System.out.println(this.getMsgObj().getMessage("msg5", new Object[]{this.getName(),this.getRank()}, "nope..",null));
	}
}
