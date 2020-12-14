package main.java.com.starbuzz;


public class StarbuzzApplication {

	public static void main(String[] args) {
		Beverage order = new Frappuccino();
		order = new Mocha(order);

		System.out.println(order.getDescription());
		System.out.println(order.cost());
	}

}
