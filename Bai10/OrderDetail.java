package Bai10;

public class OrderDetail {
	private int quatity;
	Product product=new Product();
	
	public OrderDetail() {
	}
	public OrderDetail( Product product,int quatity) {
		setQuatity(quatity);
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	
	public double calcTotalPrice() {
		return quatity*product.getPrice();
	}
	@Override
	public String toString() {
		return "OrderDetail [quatity=" + quatity + ", product=" + product + "]";
	}
}
