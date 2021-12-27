package com.thoughtfocus.crudoperation;

public class MobileUser {
	public static void main(String[] args) {
		MobileDAO dao=new MobileDAO();
		MobileDTO mobileDto = new MobileDTO();
		mobileDto.setBrandName("Samsung");
		mobileDto.setModelName("M14");
		mobileDto.setMemory("62GB");
		mobileDto.setMobileID(4562);
		mobileDto.setNoOfCamera(2);
		mobileDto.setSerialNumber(12345);
		mobileDto.setPrice(26000);
		
		MobileDTO mobileDto1 = new MobileDTO();
		mobileDto1.setBrandName("Nokia");
		mobileDto1.setModelName("XR20");
		mobileDto1.setMemory("32GB");
		mobileDto1.setMobileID(4563);
		mobileDto1.setNoOfCamera(3);
		mobileDto1.setSerialNumber(123456);
		mobileDto1.setPrice(28000);
		
		MobileDTO mobileDto2 = new MobileDTO();
		mobileDto2.setBrandName("iPhone");
		mobileDto2.setModelName("XR");
		mobileDto2.setMemory("128GB");
		mobileDto2.setMobileID(4564);
		mobileDto2.setNoOfCamera(4);
		mobileDto2.setSerialNumber(1234567);
		mobileDto2.setPrice(56000);
		
		dao.add(mobileDto);
		dao.add(mobileDto1);
		dao.add(mobileDto2);
		dao.getAll();
		System.out.println();
		
		dao.getAllByBrandName("Nokia");
		
		System.out.println();
		
		dao.updateBySerialNumber(123456, "Xiaomi");
		dao.getAll();
		System.out.println();
		
		try{
			dao.deleteByMobileID(4565);
		}catch(MobileCustomException e) {
			e.exceptionMessage();
		}
		
		dao.getAll();
		
		

	}
}
