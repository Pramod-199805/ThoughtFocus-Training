package com.thoughtfocus.crudoperationusingcollection.DAO;

import java.util.LinkedHashSet;

import com.thoughtfocus.crudoperationusingcollection.DTO.MobileMethodDTO;
import com.thoughtfocus.crudoperationusingcollection.DTO.MobilePropertiesDTO;
import com.thoughtfocus.crudoperationusingcollection.Exception.MobileIDCustomException;
import com.thoughtfocus.crudoperationusingcollection.Exception.MobileSerialNumberException;

public class MobileDAO implements MobileMethodDTO  {
LinkedHashSet<MobilePropertiesDTO> mobileProperties=new LinkedHashSet<>();

@Override
public boolean add(MobilePropertiesDTO dto) {
	if(dto!=null) {
	mobileProperties.add(dto);
	return true;
	}
	return false;
}

@Override
public void getAll() {
	for(MobilePropertiesDTO mobileDetail:mobileProperties) {
		System.out.println(mobileDetail);
	}
	
}

@Override
public MobileMethodDTO deleteByMobileID(int mobileID) {
	boolean check=false;
	for(MobilePropertiesDTO mobileDetail:mobileProperties) {
		if(mobileID==mobileDetail.getMobileID()) {
			mobileProperties.remove(mobileDetail);
			System.out.println(" Mobile Deleted");

		}
		
	}
	if(!check) {
	MobileIDCustomException exc=new MobileIDCustomException();
	throw exc;
	}
	return null;	
}

@Override
public MobileMethodDTO updateBySerialNumber(int serialNumber,String mobileName) {
	boolean check=false;
	for(MobilePropertiesDTO mobileDetail:mobileProperties) {
		if(serialNumber==mobileDetail.getSerialNumber()) {
			mobileDetail.setBrandName(mobileName);
			System.out.println("Mobile Name Updated");
		}
	}
	if(!check) {
		MobileSerialNumberException mobileSerialNumberException=new MobileSerialNumberException();
		throw mobileSerialNumberException;
	}
	return null;
}

@Override
public void getAllByBrandName(String brandName) {
	for(MobilePropertiesDTO mobileDetail:mobileProperties) {
		if(brandName.equals(mobileDetail.getBrandName())) {
			System.out.println(mobileDetail);
		}
	}
		
	
	
}

}
