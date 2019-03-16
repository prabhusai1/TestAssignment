package com.maven.vehicle.beans;

import java.util.Date;

public class Vehicle {
	private String vehicleNo,vehicleType;
	private long aadhaarNo,mobileNo;
	private int insurancePeriod;
	private Date date;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String vehicleNo,String vehicleType, int insurancePeriod,long aadhaarNo,long mobileNo,Date date) {
		this.vehicleNo=vehicleNo;
		this.vehicleType=vehicleType;
		this.insurancePeriod=insurancePeriod;
		this.aadhaarNo =aadhaarNo;
		this.mobileNo=mobileNo;
		this.date=date;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public long getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(long aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getInsurancePeriod() {
		return insurancePeriod;
	}

	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	
	
}

