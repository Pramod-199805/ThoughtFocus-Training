package com.thoughtfocus.mapcrudoperation.DTO;

public class CarDTO {
private String carName;
private String carModel;
private double price;
private String colour;
private int noOfAirBag;
private int noOfSeats;
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getCarModel() {
	return carModel;
}

public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getNoOfAirBag() {
	return noOfAirBag;
}
public void setNoOfAirBag(int noOfAirBag) {
	this.noOfAirBag = noOfAirBag;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
@Override
public String toString() {
	return "Car [carName=" + carName + ", carModel=" + carModel + ", price=" + price + ", colour=" + colour
			+ ", noOfAirBag=" + noOfAirBag + ", noOfSeats=" + noOfSeats + "]";
}
}
