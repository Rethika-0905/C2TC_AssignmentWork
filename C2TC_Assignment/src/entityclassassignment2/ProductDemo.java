package entityclassassignment2;

public class ProductDemo {

	public static void main(String[] args) {
		Product pd = new Product();
		
		pd.setProdNo(1);
		pd.setProdName("Health Mix");
		pd.setPrice(100);
		
		System.out.println(pd);
		
		Product pd1 = new Product();
		
		pd1.setProdNo(2);
		pd1.setProdName("ABC Malt");
		pd1.setPrice(130);
		
		System.out.println(pd1);
		
		Product pd2 = new Product();
		
		pd2.setProdNo(3);
		pd2.setProdName("Choco Mix");
		pd2.setPrice(150);
		
		System.out.println(pd2);


	}

}
