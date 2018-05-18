package com.spring.services;

import com.springXml.beans.WorkHistory;

public class OfferPackageProcess {
	WorkHistory WorkHistoryObj;
	
	public OfferPackageProcess() {
		// TODO Auto-generated constructor stub
	}
	public long firstOffer(){
		System.out.println(WorkHistoryObj);
		return (long) ((long) WorkHistoryObj.getLastCtc()+(WorkHistoryObj.getLastCtc()*0.1*WorkHistoryObj.getNumberOfCompanies()));
	}
	
	public long counterOffer(long offer){
		if(offer>=WorkHistoryObj.getLastCtc()*2)
		return  (long) (offer+offer*0.01);
		else 
			return offer;
	}

	public WorkHistory getWhObj() {
		return WorkHistoryObj;
	}

	public void setWorkHistoryObj(WorkHistory WorkHistoryObj) {
		this.WorkHistoryObj = WorkHistoryObj;
	}

	public OfferPackageProcess(WorkHistory WorkHistoryObj) {
		super();
		this.WorkHistoryObj = WorkHistoryObj;
	}
}
