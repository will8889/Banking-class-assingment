package bankassignment;

public class Customer {
private String firstName;
private String lastName;
private Account account;

public Customer(String f, String l) {
	this.firstName = f;
	this.lastName = l;
	this.account = new Account(0);
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}
 
public Account getAccount() {
	return account;
	
}

public Account setAccount(Account acct) {
	account = acct;
	return account;
}
}
