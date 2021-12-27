package com.thoughtfocus.crudoperation;

public class MobileDAO implements MobileMethods {
MobileDTO[] mobileDetail=new MobileDTO[3];
int index=0;

boolean add(MobileDTO dto) {
	if(dto!=null) {
		mobileDetail[index]=dto;
		index++;
		return true;
		}
	return false;
}

@Override
public void getAll() {
	for(int index=0;index<mobileDetail.length;index++) {
		if(mobileDetail[index]!=null) {
			System.out.println(mobileDetail[index]);
		}
	}
	
}

@Override
public void getAllByBrandName(String brandName) {	 
		for(int index=0;index<mobileDetail.length;index++) {
			if(mobileDetail[index]!=null) {
			if(brandName.equals(mobileDetail[index].getBrandName())) {
				System.out.println(mobileDetail[index]);
			}
		}			
		}	
		
}
MobileDTO deleteByMobileID( int mobileID) {
	for(int index=0;index<mobileDetail.length;index++) {
		if(mobileDetail[index]!=null) {
		if(mobileID==mobileDetail[index].getMobileID()) {
			mobileDetail[index]=null;
			return mobileDetail[index];
		}
	}
}
	
	MobileCustomException mobileException=new MobileCustomException();
	throw mobileException;
}

MobileDTO updateBySerialNumber ( int serialNumber,String mobileName ) {
	for(int index=0;index<mobileDetail.length;index++) {
		if(mobileDetail[index]!=null) {
		if(serialNumber==mobileDetail[index].getSerialNumber()) {
			mobileDetail[index].setBrandName(mobileName);
			return mobileDetail[index];
		}
	}
	
}
	return null;
}

}
