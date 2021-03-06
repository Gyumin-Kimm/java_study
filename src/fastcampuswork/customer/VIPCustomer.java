package fastcampuswork.customer;

public class VIPCustomer extends Customer{
	
	private int agentId;

	public VIPCustomer(int customerID, String customerName, int agentId) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;		
		salesRatio = 0.1;
		this.agentId = agentId;
	}
	
	@Override
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다. 담당 상담원 번호는 " + agentId + "입니다.";
	}

}
