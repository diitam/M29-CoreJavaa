package daytwelve.collections.set;

public class Product {

	private int proId;
	private String name;
	private float price;
	public Product(int proId, String name, float price) {
		super();
		this.proId = proId;
		this.name = name;
		this.price = price;
		
	
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
