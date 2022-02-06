package com.thoughtfocus.traineedetailsarray;

public class Tester {
	public static void main(String[] args) {
		DetailsDAO dao = new DetailsDAO();
		TraineeDetails detail = new TraineeDetails();
		detail.setEmployeeName("Pramod");
		detail.setEmployeeId(106584);
		detail.setEmployeeContactNumber(9876543210l);

		TraineeDetails detailOne = new TraineeDetails();
		detailOne.setEmployeeName("Rakshit");
		detailOne.setEmployeeId(106585);
		detailOne.setEmployeeContactNumber(9876543211l);

		TraineeDetails detailTwo = new TraineeDetails();
		detailTwo.setEmployeeName("Mallikarjun");
		detailTwo.setEmployeeId(106586);
		detailTwo.setEmployeeContactNumber(9876543212l);

		dao.saveEmployeeDetails(detail);
		dao.saveEmployeeDetails(detailOne);
		dao.saveEmployeeDetails(detailTwo);

		dao.printEmployeeDetails();

		System.out.println(dao.deleteEmployeeDetailByName("Adarsh"));
		System.out.println(dao.deleteEmployeeDetailByName("Rakshit"));
		System.out.println(dao.updateEmployeeDetailById(106585, "Rakshit Nayak"));
		System.out.println(dao.updateEmployeeDetailById(106584, "Pramod B Pujar"));
		System.out.println(dao.updateEmployeeDetailById(106586, "Mallikarjun Lalasangi"));

		dao.printEmployeeDetails();

	}
}
