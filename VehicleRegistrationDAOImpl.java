package com.maven.vehicle.DAO;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.maven.vehicle.UI.MainUI;
import com.maven.vehicle.beans.Vehicle;

public class VehicleRegistrationDAOImpl implements VehicleRegistrationDAO{
	Vehicle v=new Vehicle();
	MainUI mainui=new MainUI();
	HashMap<String, Vehicle> mapRegister = new HashMap<String, Vehicle>();
	
	public int vehicleRegistration() {
		v=mainui.collectData();
		int c=0;
		
		if(mapRegister.put(mainui.askVehNumber(),v)!=null) {
			c=1;
		}
		return c;
	}	
	
	public int insuranceValidityCheck(String vehicleNumber) {
		Map<Integer,String> data=new HashMap<Integer, String>();
		int c=0;

		for(Map.Entry<String,Vehicle> m:mapRegister.entrySet())
		{
			if(m.getKey().contentEquals(vehicleNumber))
			{
				Calendar date = Calendar.getInstance();
			    date.setTime(new Date());
			    Format f = new SimpleDateFormat("dd-MMMM-yyyy");
			    
			    date.add(Calendar.YEAR,m.getValue().getInsurancePeriod());
			    //mainui.printPeriod(f.format(date.getTime()));
			    System.out.println("your insurance expires on :"+f.format(date.getTime()));
			    data.put(m.getValue().getInsurancePeriod(), f.format(date.getTime()));
			    c=1;
			}
		}
		  return c;
	}
}
