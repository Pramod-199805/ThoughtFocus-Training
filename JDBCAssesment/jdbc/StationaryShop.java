package com.thoughtfocus.jdbc;

import com.thoughtfocus.jdbc.dao.InvalidBrandNameException;
import com.thoughtfocus.jdbc.dao.StationaryDAO;
import com.thoughtfocus.jdbc.dto.StationaryDTO;
import com.thoughtfocus.jdbc.exception.InvalidSerialNumberException;

public class StationaryShop {
	public static void main(String[] args) {
		StationaryDAO dao=new StationaryDAO();
		StationaryDTO dto=new StationaryDTO();
		dto.setSerialNumber(1);
		dto.setType("Ruled");
		dto.setBrandName("Classmate");
		dto.setPrice(55);
		dto.setQuantity(2);
		dto.setName("Book");
//		dao.add(dto);
		
		StationaryDTO dto1=new StationaryDTO();
		dto1.setSerialNumber(2);
		dto1.setType("UnRuled");
		dto1.setBrandName("Classmate");
		dto1.setPrice(55);
		dto1.setQuantity(3);
		dto1.setName("Book");
//		dao.add(dto1);
		
		StationaryDTO dto2=new StationaryDTO();
		dto2.setSerialNumber(3);
		dto2.setType("Drwaing");
		dto2.setBrandName("Grid");
		dto2.setPrice(45);
		dto2.setQuantity(3);
		dto2.setName("Book");
//		dao.add(dto2);
		try {
	dao.updatePriceByBrandName(65, "Cello");
		}catch(InvalidBrandNameException e) {
			e.message();
		}
		try {
		dao.deleteBySerialNumber(6);
		}catch(InvalidSerialNumberException e){
			e.message();
		}
		
		dao.getAll();
	}

}
