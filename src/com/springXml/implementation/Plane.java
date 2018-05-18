package com.springXml.implementation;

import com.springXml.interfaces.IDrivingSystem;

public class Plane implements IDrivingSystem{

	@Override
	public void startVehicle(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("plane start "+vehicleName);
	}

	@Override
	public void driveVechicle(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("plane drive"+vehicleName);
	}

	@Override
	public void applyBreaks(String vehicleName) {
		// TODO Auto-generated method stub
		System.out.println("plane stop "+vehicleName);
		
	}

}
