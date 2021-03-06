package fastcampuswork.customer;

public class GoldCustomer extends Customer{

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

}
