import java.util.ArrayList;


public class DiscountInterfacesMain {

	/**
	 * @param args command line args ignored
	 */
	public static void main(String[] args) {
		ArrayList<GroceryItem> items = new ArrayList<GroceryItem>();
		
		// in a slightly fancier program, we might get this list from
		// user input or something.  But for now it's a good start.
		items.add(new GroceryItem("Milk", 3.00));
		items.add(new GroceryItem("Cheese", 3.50));
		items.add(new GroceryItem("Eggs 1 dozen", 1.00));
		items.add(new GroceryItem("Pepsi 2 liter", 0.99));
		items.add(new GroceryItem("Bread", 0.99));
		items.add(new GroceryItem("SPAM", 5.00));
		
		ArrayList<Discount> discounts = new ArrayList<Discount>();
		
		discounts.add(new FixedDiscount("Milk", 1));
		discounts.add(new FixedDiscount("Bread", 0.25));
		discounts.add(new FixedDiscount("Coke", 0.25));
		discounts.add(new PercentageDiscount("Eggs", 0.05));
		discounts.add(new PercentageDiscount("SPAM", 0.1));
				
		
		double subtotal = 0;
		double discountTotal = 0;
		for(GroceryItem item : items) {
			System.out.println(item.receptString());
			subtotal += item.cost();
			for(Discount discount: discounts) {
				if(discount.matches(item)) {
					discountTotal += discount.calculateDiscountFor(item);
				}
			}
		}
		
		double total = subtotal - discountTotal;
		
		System.out.println("Subtotal             $" + subtotal);
		System.out.println("Discounts           -$" + discountTotal);
		System.out.println("Total                $" + total);

	}
	
}
