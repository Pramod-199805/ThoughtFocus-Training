package com.thoughtfocus.mapcrudoperation.DAO;

import java.util.Map;
import java.util.TreeMap;

import com.thoughtfocus.mapcrudoperation.DTO.CarDTO;
import com.thoughtfocus.mapcrudoperation.Exception.InvalidCarNameException;

public class CarDAO {
	Map<String, CarDTO> cars = new TreeMap<>();

	public boolean saveCarDetails(String carName, CarDTO details) {
		if (carName != null && details != null) 
		{
			cars.put(carName, details);
			return true;
		} else 
		{
			return false;
		}
	}
	
	public void getCarByKey(String key) {
		if(cars.containsKey(key)) {
			System.out.println(cars.get(key));
		}
		else {
			System.out.println("No Car Found");
		}
	}
	
	public CarDTO updateCarModelByKey(String key) {
		if(cars.containsKey(key)) {
			CarDTO details=new CarDTO();
			details.setCarModel(key);
			return details;
		}
		else {
			InvalidCarNameException invalidCarNameException=new InvalidCarNameException();
			throw invalidCarNameException;
		}				
	}
	
	public CarDTO deletecarDetailsByKey(String key) {
		
			if(cars.containsKey(key)) {
				return cars.remove(key);
			}					
			else {
				InvalidCarNameException invalidCarNameException=new InvalidCarNameException();
				throw invalidCarNameException;
			}
		}
}

