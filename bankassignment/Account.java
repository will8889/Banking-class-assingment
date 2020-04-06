package bankassignment;

public class Account {
private double balance;

public Account(double balance) {
	this.balance = balance;}

public double getBalance() {
	return this.balance;
}

public boolean withdraw(double amount) {
	if(balance<amount) {
		System.out.println("Amount exceed balance");
		return false;
	}
	else  {
		System.out.println("withdraw balance");
		balance -= amount;
		return true;
	}
}

public boolean deposit(double amount) {
	System.out.println("Deposit balance");
	balance += amount;
	return true;
}

}
