package atmexample;

import java.util.ArrayList;

public class Bank {
	private String code;
	private String address;
	
	private ArrayList<Account> accountList;
	private ArrayList<ATM> atmList;
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	public void removeAccount(Account account) {
		accountList.remove(account);
	}
	
	public void addATM (ATM atm) {
		atmList.add(atm);
	}
	public void removeATM (ATM atm) {
		atmList.remove(atm);
	}

	public ArrayList<Account> getAccount() {
		return accountList;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
