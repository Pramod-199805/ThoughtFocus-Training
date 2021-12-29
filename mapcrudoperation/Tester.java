package com.thoughtfocus.mapcrudoperation;

import com.thoughtfocus.mapcrudoperation.DAO.CarDAO;
import com.thoughtfocus.mapcrudoperation.DTO.CarDTO;
import com.thoughtfocus.mapcrudoperation.Exception.InvalidCarNameException;

public class Tester {
public static void main(String[] args) {
	CarDAO dao=new CarDAO();
	CarDTO dto=new CarDTO();
	dto.setCarName("Suzuki");
	dto.setCarModel("Baleno");
	dto.setColour("Grey");
	dto.setNoOfAirBag(2);
	dto.setNoOfSeats(5);
	dto.setPrice(120000);
	
	CarDTO dto1=new CarDTO();
	dto1.setCarName("Mahindra");
	dto1.setCarModel("XUV 5OO");
	dto1.setColour("Red");
	dto1.setNoOfAirBag(4);
	dto1.setNoOfSeats(5);
	dto1.setPrice(160000);
	
	CarDTO dto2=new CarDTO();
	dto2.setCarName("TATA");
	dto2.setCarModel("Harrier");
	dto2.setColour("Black");
	dto2.setNoOfAirBag(5);
	dto2.setNoOfSeats(5);
	dto2.setPrice(230000);
	
	
	dao.saveCarDetails("Suzuki", dto);
	dao.saveCarDetails("Mahindra", dto1);
	dao.saveCarDetails("TATA", dto2);
	
	dao.getCarByKey("Mahindra");
	dao.getCarByKey("TATA");
	dao.getCarByKey("Suzuki");
	System.out.println("**********************************************");
	
	try {
	dao.updateCarModelByKey("MAhindra");
	}catch(InvalidCarNameException e) {
		e.invalidMessageException();
	}
	System.out.println("**************************************************");
	dao.getCarByKey("Mahindra");
	
	System.out.println("************************************************");
	try {
	dao.deletecarDetailsByKey("tata");
	}catch(InvalidCarNameException e) {
		e.invalidMessageException();
	}
	
}
}
