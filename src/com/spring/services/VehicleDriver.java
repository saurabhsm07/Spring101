package com.spring.services;

import com.springXml.interfaces.IDrivingSystem;

public class VehicleDriver {
public IDrivingSystem drivingObj;   //name of the variable is important for both  setter injection and constructor injection

public VehicleDriver() {
	// TODO Auto-generated constructor stub
}

//name of the parameter is imp
public VehicleDriver(IDrivingSystem drivingObjs) {
	this.drivingObj=drivingObjs;
}

public void setDrivingObj(IDrivingSystem drivingObj) {
	this.drivingObj = drivingObj;
}





public IDrivingSystem getDrivingObj() {
	return drivingObj;
}






}
