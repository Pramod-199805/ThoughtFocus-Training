package com.thoughtfocus.traineedetailsarray;

public class DetailsDAO {
	private TraineeDetails[] traineeDetails = new TraineeDetails[6];
	private int index = 0;

	public void saveEmployeeDetails(TraineeDetails details) {
		if (details != null) {
			traineeDetails[index] = details;
			index++;
		}
	}

	public void printEmployeeDetails() {
		for (int index = 0; index < traineeDetails.length; index++) {
			if (traineeDetails[index] != null) {
				System.out.println(traineeDetails[index]);
			}
		}
	}

	public String deleteEmployeeDetailByName(String name) {
		for (int index = 0; index < traineeDetails.length; index++) {
			if (traineeDetails[index] != null) {
				if (traineeDetails[index].getEmployeeName().equals(name)) {
					traineeDetails[index] = null;
					return "Employee Details of " + name + " Deleted";
				}
			}

		}
		return "Employee Name Not Found";
	}

	public String updateEmployeeDetailById(int id, String newName) {
		for (int index = 0; index < traineeDetails.length; index++) {
			if (traineeDetails[index] != null) {
				if (id == traineeDetails[index].getEmployeeId()) {
					traineeDetails[index].setEmployeeName(newName);
					return "Name Updated";
				}
			}
		}
		return "Invalid ID or Employee Deatils are Deleted";
	}
}
