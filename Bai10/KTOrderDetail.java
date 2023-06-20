package Bai10;

public class KTOrderDetail {
	public static void main(String[] args) {
		Product pd=new Product("Nuoc tuong","sp4",80000);
		OrderDetail od=new OrderDetail(pd,10);
		System.out.println(od);
	}
}
