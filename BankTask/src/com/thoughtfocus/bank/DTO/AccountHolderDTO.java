package com.thoughtfocus.bank.DTO;

public class AccountHolderDTO  {
private String name;
private long accountNumber;
private String iFSCCOde;
private long contactNumber;
private String email;
private float balance;


public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}

private AddressDTO address;
public AddressDTO getAddress() {
	return address;
}
public void setAddress(AddressDTO address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public String getiFSCCOde() {
	return iFSCCOde;
}
public void setiFSCCOde(String iFSCCOde) {
	this.iFSCCOde = iFSCCOde;
}
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "AccountHolderDTO [name=" + name + ", accountNumber=" + accountNumber + ", iFSCCOde=" + iFSCCOde
			+ ", contactNumber=" + contactNumber + ", email=" + email + ", balance=" + balance + 
			     ", address=" + address + "]";
}
}
