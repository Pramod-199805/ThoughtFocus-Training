package com.thoughtfocus.crudoperationusingcollection.DTO;

public class MobilePropertiesDTO {
	private int mobileID; 
	private String modelName ;
	private double price ;
	private String memory;
	private String brandName ;
	private int serialNumber ;
	private int noOfCamera;
	
//	
//	public MobilePropertiesDTO(int mobileID, String modelName, double price, int memory, String brandName,
//			int serialNumber, byte noOfCamera) {
//		super();
//		this.mobileID = mobileID;
//		this.modelName = modelName;
//		this.price = price;
//		this.memory = memory;
//		this.brandName = brandName;
//		this.serialNumber = serialNumber;
//		this.noOfCamera = noOfCamera;
//	}
	
	public int getMobileID() {
		return mobileID;
	}
	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getNoOfCamera() {
		return noOfCamera;
	}
	public void setNoOfCamera(int i) {
		this.noOfCamera = i;
	}
	@Override
	public String toString() {
		return "MobilePropertiesDTO [mobileID=" + mobileID + ", modelName=" + modelName + ", price=" + price
				+ ", memory=" + memory + ", brandName=" + brandName + ", serialNumber=" + serialNumber + ", noOfCamera="
				+ noOfCamera + "]";
	}

	
}
