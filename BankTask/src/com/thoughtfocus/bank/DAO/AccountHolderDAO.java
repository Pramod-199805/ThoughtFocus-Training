package com.thoughtfocus.bank.DAO;

import java.util.ArrayList;
import java.util.List;

import com.thoughtfocus.bank.DTO.AccountHolderDTO;
import com.thoughtfocus.bank.DTO.AddressDTO;

public class AccountHolderDAO{
	private List<AccountHolderDTO> dtos = new ArrayList<>();

	public String saveDetails(AccountHolderDTO details) {
		boolean saved = dtos.add(details);
		if (saved) {
			return "Saved";
		} else {
			return "Not Saved";
		}

	}

	public void readAccountDetails() {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.isEmpty()) {
				System.out.println();
			} else {
				System.out.println(dtos.get(index));
			}
		}
	}

	public void deleteByName(String name) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.isEmpty()) {

			} else {
				if (dtos.get(index).getName().equals(name)) {
					dtos.remove(index);
				}
			}
		}
		System.out.println("No account with name mentioned by you");

	}

	public void updateByIfscCode(String code, long contact) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.isEmpty()) {
			} else {
				dtos.get(index).setContactNumber(contact);
			}

		}
	}
	
	public AccountHolderDTO updatePincodeByArea(String area,int code) {
		for(int index=0;index<dtos.size();index++) {
			if(area.equals(dtos.get(index).getAddress().getArea())) {
				dtos.get(index).getAddress().setPinCode(code);
				return dtos.get(index);
			}
		}
		return null;
	}
	
	public float getBalance(long accountNumber)
	{
		for(int index=0;index<dtos.size();index++) {
			if(accountNumber==dtos.get(index).getAccountNumber()) {
				
				return dtos.get(index).getBalance();
			}
	}
		return 0.0f;
	}
		
		public float deposit(float depositamount,long accountNumber) {
			for(int index=0;index<dtos.size();index++) {
				if(accountNumber==dtos.get(index).getAccountNumber()&&depositamount!=0) {
					float oldAmount=dtos.get(index).getBalance();
					float newAmount=oldAmount+depositamount;
					dtos.get(index).setBalance(newAmount);

					 return newAmount;
			}
		}
			return 0.0f;
		
	}
		
		public float withdrawAmount(float amount,long accountNumber) {
			for(int index=0;index<dtos.size();index++) {
				if(accountNumber==dtos.get(index).getAccountNumber()&&amount<dtos.get(index).getBalance()&&amount>1000) {
					float currentAmount=dtos.get(index).getBalance()-amount;
					dtos.get(index).setBalance(currentAmount);
					return currentAmount;
				}
			}
			return 0.0f;
		}
}
