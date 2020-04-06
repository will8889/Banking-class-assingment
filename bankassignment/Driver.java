package bankassignment;

public class Driver {
	public static void main(String[] args) {
		Bank b = new Bank("Bank Bank");
		b.addCustomer("Leon", "Kennedy");
		Customer c = b.getCustomer(b.getNumOfCustomers()-1);
		System.out.println("bank name: "+b.getBankName());
		System.out.println("full name: "+c.getFirstName() +" "+ c.getLastName());
		Account a = c.getAccount();
		a.deposit(100);
		a.withdraw(50);
		System.out.println("balance ="+a.getBalance());
	}
}
