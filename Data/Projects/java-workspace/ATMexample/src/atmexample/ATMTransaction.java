package atmexample;

import java.util.ArrayList;
import java.util.Date;

public class ATMTransaction {
	
	private String transactionId;
	private Date date;
	private String type;
	private double amount;
	private double postBalance;
	
	private ArrayList<Account> accountList;
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	public void removeAccount(Account account) {
		accountList.remove(account);
	}
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPostBalance() {
		return postBalance;
	}

	public void setPostBalance(double postBalance) {
		this.postBalance = postBalance;
	}

	public void modifies() {
	
	}

}
