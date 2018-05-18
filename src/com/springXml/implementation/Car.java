package com.springXml.implementation;

import com.springXml.interfaces.IDrivingSystem;

public class Car implements IDrivingSystem {

	
	@Override
	public void startVehicle(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("start car"+vehicleName);
	}

	@Override
	public void driveVechicle(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("drive bike"+vehicleName);
	}

	@Override
	public void applyBreaks(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("apply breaks of car"+vehicleName);
	}

}
