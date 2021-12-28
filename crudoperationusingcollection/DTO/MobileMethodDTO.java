package com.thoughtfocus.crudoperationusingcollection.DTO;

public interface MobileMethodDTO {
	
	boolean add(MobilePropertiesDTO dto);

	void getAll();

	MobileMethodDTO deleteByMobileID(int mobileID);

	MobileMethodDTO updateBySerialNumber(int serialNumber,String mobileName);

	void getAllByBrandName(String brandName);
}
