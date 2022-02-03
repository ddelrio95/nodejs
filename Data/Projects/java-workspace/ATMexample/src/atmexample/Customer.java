package atmexample;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
	
	private String name;
	private String address;
	private Date dob;
	private String cardNumber;
	private int pin;
	
	private ArrayList<Account> accountList;
	
	public boolean verufyPassword(String password) {
		if (password.equals("1234")) return true;
		else return false;
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void removeAccount(Account account) {
		accountList.remove(account);
	}
	                                      
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

}
