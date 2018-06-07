package com.spring.tests;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.services.OfferPackageProcess;
import com.spring.services.VehicleDriver;
import com.springXml.beans.CiaAgents;
import com.springXml.beans.Employee;
import com.springXml.beans.Student;





public class XmlTests {
public static AbstractApplicationContext contextObj;
static { contextObj=new ClassPathXmlApplicationContext(new String[] {"SpringServicesConfig.xml","SpringBeansConfig.xml"});
contextObj.registerShutdownHook();
}

	/** 1
	 * testing coding to interfaces
	 */
	@Test
	public void testDrivingSystem(){ 

		VehicleDriver vc = (VehicleDriver) contextObj.getBean("VehicleDriver");
		vc.drivingObj.applyBreaks("maverick 07");
	}
	
	
	/** 2
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
	
	/** 3
	 * testing inner bean concepts
	 */
	@Test
	public void testOfferLetter(){
		OfferPackageProcess offerObj = contextObj.getBean("OfferPackageProcess222",OfferPackageProcess.class); //testing alias;
//		OfferPackageProcess offerObj = contextObj.getBean("OfferPackageProcess",OfferPackageProcess.class);
		System.out.println("first offer="+offerObj.firstOffer());
	}
	/** 4
	 * testing collections concepts
	 */
	@Test
	public void testCollectionInjection(){
		Employee empObj = contextObj.getBean("employee",Employee.class);
		System.out.println(empObj.toString());
	}
	
	/** 5
	 * testing annotation autowiring concepts
	 */
	@Test
	public void testAnnotationAutowiring(){
		Student stdObj = contextObj.getBean("student",Student.class);
		System.out.println(stdObj.toString());
	}
	
	/** 6
	 * testing annotation autowiring concepts
	 */
	@Test
	public void testComponentAnnotationAutowiring(){
		CiaAgents ciaObj = contextObj.getBean("ciaagents",CiaAgents.class);
		System.out.println(ciaObj.toString());
	}
}
