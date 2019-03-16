package com.maven.vehicle.DAO;

import com.maven.vehicle.beans.Vehicle;

public interface VehicleRegistrationDAO {
	public int vehicleRegistration();
	public int insuranceValidityCheck(String vehNumber);
}
