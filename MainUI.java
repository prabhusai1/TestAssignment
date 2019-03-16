package com.maven.vehicle.UI;

import java.text.Format;
import java.util.*;

import com.maven.vehicle.DAO.VehicleRegistrationDAO;
import com.maven.vehicle.DAO.VehicleRegistrationDAOImpl;
import com.maven.vehicle.beans.Vehicle;

public class MainUI {
	Vehicle v = new Vehicle();

	public static void main(String args[]) {
		Date date=new Date();
		VehicleRegistrationDAO vehDAO = new VehicleRegistrationDAOImpl();
		Scanner in = new Scanner(System.in);

		int choice;

		do {
			System.out.println(
					"Please enter your choice \n1) Vehicle Insurance Registration \n2) Insurance Validity Check \n3)exit");
			choice = in.nextInt();
			
			switch (choice) {
			case 1:
				vehDAO.vehicleRegistration();
				break;
			case 2:
				System.out.println("Please enter vehicle number");
				in.nextLine();
				String vehNumber=in.nextLine();
				vehDAO.insuranceValidityCheck(vehNumber);
				break;
			default:
				System.out.println("Please enter correct choice");
			}
		} while (choice <= 2);
	}

	public String askVehNumber() {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter vehicle number");
		String vehicleNo = in.nextLine();
		v.setVehicleNo(vehicleNo);
		return vehicleNo;
	}

	public Vehicle collectData() {

		Scanner in = new Scanner(System.in);

		System.out.println("please enter vehicle type(eg 2 wheeler)");
		String vehicleType = in.nextLine();
		v.setVehicleType(vehicleType);

		System.out.println("please enter Insurance Period(in years)");
		int insPeriod = in.nextInt();
		v.setInsurancePeriod(insPeriod);

		System.out.println("Please enter aadhar card number");
		long aadhar = in.nextLong();
		v.setAadhaarNo(aadhar);

		System.out.println("Please enter mobile number");
		long mobileNumber = in.nextLong();
		v.setMobileNo(mobileNumber);

		return v;
	}

	public void printPeriod(Format f) {
		// System.out.println("your insurance expires on :"+f.format(date.getTime()));
		
	}
	
	
}
