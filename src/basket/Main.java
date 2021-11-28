package basket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basket b = new Basket();
		b.addItem(10); b.addItem(9.9); b.addItem(22);
		b.applyDiscount();
		b.printTotalCost();
	}

}
