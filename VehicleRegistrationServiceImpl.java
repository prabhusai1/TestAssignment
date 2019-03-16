package com.maven.vehicle.Service;

import com.maven.vehicle.DAO.VehicleRegistrationDAO;
import com.maven.vehicle.DAO.VehicleRegistrationDAOImpl;
import com.maven.vehicle.beans.Vehicle;

public class VehicleRegistrationServiceImpl implements VehicleRegistration{

	VehicleRegistrationDAO vehDAO=new VehicleRegistrationDAOImpl();
	public int vehicleRegistration() {
		return vehDAO.vehicleRegistration();
	}

	public int insuranceValidityCheck(String vehNumber) {
		vehDAO.insuranceValidityCheck(vehNumber);
		return 0;
	}
	
}
