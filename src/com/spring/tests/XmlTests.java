package com.spring.tests;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.services.OfferPackageProcess;
import com.spring.services.VehicleDriver;
import com.springXml.beans.Employee;



public class XmlTests {
public static AbstractApplicationContext contextObj=new ClassPathXmlApplicationContext(new String[] {"SpringServicesConfig.xml","SpringBeansConfig.xml"});

	/**
	 * testing coding to interfaces
	 */
	@Test
	public void testDrivingSystem(){ 
contextObj.registerShutdownHook();
		VehicleDriver vc = (VehicleDriver) contextObj.getBean("VehicleDriver");
		vc.drivingObj.applyBreaks("maverick 07");
	}
	
	
	/**
	 * testing bean referencing
	 * initialization and destruction process
	 * and scopes
	 */
	@Test
	public void testEmployee(){

		Employee empObj1 = contextObj.getBean("employee",Employee.class);
		Employee empObj2 = contextObj.getBean("employee",Employee.class);
	System.out.println(empObj1.toString());
	System.out.println(empObj1.getAddress().equals(empObj2.getAddress()));
	}
	
	/**
	 * testing inner bean concepts
	 */
	@Test
	public void testOfferLetter(){
//		OfferPackageProcess offerObj = contextObj.getBean("OfferPackageProcess222",OfferPackageProcess.class) //testing alias;
		OfferPackageProcess offerObj = contextObj.getBean("OfferPackageProcess",OfferPackageProcess.class);
		System.out.println("first offer="+offerObj.firstOffer());
	}
	
}
