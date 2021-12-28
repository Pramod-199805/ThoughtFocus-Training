package com.thoughtfocus.crudoperationusingcollection;

import com.thoughtfocus.crudoperationusingcollection.DAO.MobileDAO;
import com.thoughtfocus.crudoperationusingcollection.DTO.MobileMethodDTO;
import com.thoughtfocus.crudoperationusingcollection.DTO.MobilePropertiesDTO;
import com.thoughtfocus.crudoperationusingcollection.Exception.MobileIDCustomException;
import com.thoughtfocus.crudoperationusingcollection.Exception.MobileSerialNumberException;

public class MobileTester {
	public static void main(String[] args) {
		MobileMethodDTO dao = new MobileDAO();
		MobilePropertiesDTO detail = new MobilePropertiesDTO();
		detail.setBrandName("Samsung");
		detail.setMobileID(12546);
		detail.setMemory("16GB");
		detail.setModelName("M16");
		detail.setNoOfCamera(1);
		detail.setPrice(25000);
		detail.setSerialNumber(54321);

		MobilePropertiesDTO detail1 = new MobilePropertiesDTO();
		detail1.setBrandName("Nokia");
		detail1.setMobileID(12547);
		detail1.setMemory("32GB");
		detail1.setModelName("XR20");
		detail1.setNoOfCamera(2);
		detail1.setPrice(35000);
		detail1.setSerialNumber(54322);
		dao.add(detail);
		dao.add(detail1);
		dao.getAll();
		System.out.println();


		dao.getAllByBrandName("Nokia");
		try {
		dao.updateBySerialNumber(54325, "iPhone");
		}catch(MobileSerialNumberException e) {
			e.mobileSerialNumberException();
		}
		
		try {
		dao.deleteByMobileID(12545);
		}catch(MobileIDCustomException e) {
			e.mobileIDException();
		}
		dao.getAll();
	}

}
