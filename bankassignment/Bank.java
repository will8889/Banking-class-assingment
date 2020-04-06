package bankassignment;
import java.util.ArrayList;

public class Bank {
private ArrayList<Customer> customer = new ArrayList<>();
private int numberOfCustomers;
private String bankName;

public Bank(String bName) {
	bankName = bName;
	numberOfCustomers = 0;
}

public void addCustomer(String f, String l) {
	this.customer.add(new Customer(f,l));
	numberOfCustomers+=1;
}

public int getNumOfCustomers() {
	return numberOfCustomers;
}

public Customer getCustomer(int index) {
	return customer.get(index);
}

public String getBankName() {
	return bankName;
}
}
