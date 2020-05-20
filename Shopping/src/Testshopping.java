public class Testshopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product();
		p1.setProdId(101);
		p1.setProdname("laptop");
		p1.setProdprice(20000);
		p1.setProdQty(1);
		display(p1);
		Customer c1=new Customer();
		c1.setCustId(201);
		c1.setCustName("dharati");
		c1.setP1(p1);
		display(c1);
		
	}
	
	public void display(Customer c){
		System.out.println("custId :"+c.getCustId());
		System.out.println("cust Name :"+c.getCustName());
		System.out.println("product Id :"+c.getP1().getProdId());
		System.out.println("product Id :"+c.getP1().getProdname());
		System.out.println("product Id :"+c.getP1().getProdprice());
		
	
	}
}
