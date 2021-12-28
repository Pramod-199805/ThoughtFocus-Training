package com.thoughtfocus.bank.DTO;

public class AddressDTO {
private String country;
private String state;
private String area;
private String landMark;
private String building;
private int pinCode;

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getLandMark() {
	return landMark;
}
public void setLandMark(String landMark) {
	this.landMark = landMark;
}
public String getBuilding() {
	return building;
}
public void setBuilding(String building) {
	this.building = building;
}
public int getPinCode() {
	return pinCode;
}
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
@Override
public String toString() {
	return "AddressDTO [country=" + country + ", state=" + state + ", area=" + area + ", landMark=" + landMark
			+ ", building=" + building + ", pinCode=" + pinCode + "]";
}
}
