package com.springXml.implementation;


import com.springXml.interfaces.IDrivingSystem;

public class Bike implements IDrivingSystem{

	@Override
	public void startVehicle(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("start bike"+vehicleName);
	}

	@Override
	public void driveVechicle(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("driving bike"+vehicleName);
		
	}

	@Override
	public void applyBreaks(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("apply breaks of bike"+vehicleName);
		
	}

}
