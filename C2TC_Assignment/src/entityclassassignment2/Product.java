package entityclassassignment2;

public class Product {
	int prodNo;
	String prodName;
	int price;
	
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prodNo=" + prodNo + ", prodName=" + prodName + ", price=$" + price + "]";
	}


}
