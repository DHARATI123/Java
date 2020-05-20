package productapplication;

public class customer {
	private int customerId;
	private String customerName;
	private int customermobileno;
	private Product[] prod;
	
	public customer(int customerId, String customerName, int customermobileno, Product[] arr) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customermobileno = customermobileno;
		this.prod = arr;
	}
	

	

	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public int getCustomermobileno() {
		return customermobileno;
	}
	public Product getProd() {
		return prod;
	}
	
	

}
