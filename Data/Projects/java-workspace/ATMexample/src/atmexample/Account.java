package atmexample;

public class Account {
	
	private String number;
	private String balance;
	private Customer customer;
	
	private ArrayList<ATMTransaction> atmTransactionList;
	
	public void addTransaction (ATMTransaction transaction) {
		atmTransactionList.add(transaction);
	}
	public void removeTransiction (ATMTransaction transaction) {
		atmTransactionList.remove(transaction);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void deposit() {
		
	}
	public void withdraw() {
		
	}

}
