package com.thoughtfocus.crudoperation;

public class MobileDTO {
	private int	mobileID ;
	private String	modelName ;
	private double	price ;
	private String	memory;
	private String 	brandName ;
	private int	serialNumber ;
	private int	noOfCamera;
	
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
	public void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}
	@Override
	public String toString() {
		return "MobileProperties [mobileID=" + mobileID + ", modelName=" + modelName + ", price=" + price + ", memory="
				+ memory + ", brandName=" + brandName + ", serialNumber=" + serialNumber + ", noOfCamera=" + noOfCamera
				+ "]";
	}
}
