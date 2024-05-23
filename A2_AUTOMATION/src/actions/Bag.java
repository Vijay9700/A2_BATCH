package actions;

public class Bag {
	private double price;
	
	public Bag(double Price) {
		price=Price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(price>=1500) { //1400>=1500
			this.price=price;
		}else {
			System.out.println("Not Possible :) ");
		}
	}

}
