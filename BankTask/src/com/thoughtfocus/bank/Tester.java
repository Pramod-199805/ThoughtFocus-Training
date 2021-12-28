package com.thoughtfocus.bank;

import com.thoughtfocus.bank.DAO.AccountHolderDAO;
import com.thoughtfocus.bank.DTO.AccountHolderDTO;
import com.thoughtfocus.bank.DTO.AddressDTO;

public class Tester {
	public static void main(String[] args) {
		AccountHolderDAO dao = new AccountHolderDAO();
		AccountHolderDTO dto = new AccountHolderDTO();
		AddressDTO address = new AddressDTO();
		dto.setName("Pramod");
		dto.setAccountNumber(12345679648l);
		dto.setiFSCCOde("SBI1234");
		dto.setEmail("pramodpujar@gmail.com");
		dto.setContactNumber(987456123l);
		address.setCountry("India");
		address.setState("Karnataka");
		address.setArea("Hubli");
		address.setBuilding("Eurekha Tower");
		address.setLandMark("RaniChennamma Circle");
		address.setPinCode(580002);
		dto.setAddress(address);
			
		dao.saveDetails(dto);
		dao.readAccountDetails();
		System.out.println(dao.deposit(25000.0f, 12345679648l));	
		System.out.println(dao.withdrawAmount(14000f, 12345679648l));
		System.out.println(dao.deposit(20000f, 12345679648l));
		dao.readAccountDetails();
	}
}
