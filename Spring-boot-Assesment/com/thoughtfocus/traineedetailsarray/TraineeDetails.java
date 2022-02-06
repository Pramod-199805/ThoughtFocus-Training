package com.thoughtfocus.traineedetailsarray;

public class TraineeDetails {
	private String employeeName;
	private int employeeId;
	private long employeeContactNumber;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public long getEmployeeContactNumber() {
		return employeeContactNumber;
	}

	public void setEmployeeContactNumber(long employeeContactNumber) {
		this.employeeContactNumber = employeeContactNumber;
	}

	@Override
	public String toString() {
		return "TraineeDetails [employeeName=" + employeeName + ", employeeId=" + employeeId
				+ ", employeeContactNumber=" + employeeContactNumber + "]";
	}
	

}
