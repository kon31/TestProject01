
public class Java16_1 {

	public static void main(String[] args) {
		System.out.println(totalPrice(300, 1.08, 350));
		System.out.println(totalPrice(450));
		System.out.println(totalPrice(400));
		System.out.println(totalPrice(350));
	}
	
	public static int totalPrice(int fruitprice, double tax,int haiso) {
		return (int)(fruitprice * tax)+ haiso;
	}
	public static int totalPrice(int fruitprice) {
		return totalPrice(fruitprice, 1.08, 350);
	}

}
