package com.thoughtfocus.MethodOverriding;

public class BankLoan {
public static void main(String[] args) {
	RBI rbi=new RBI();
	HDFC hdfc =new HDFC();
	SBi sbi =new SBi();
	hdfc.interestRate();
	sbi.interestRate();//It will take the RBI method if Overiden method is not present in SBI
}
}
