
public class FixedDiscount implements Discount {

	private String itemName;
	private double savings;

	/**
	 * Create a new fixed discount for a given name
	 * 
	 * @param name
	 * @param savings
	 */
	public FixedDiscount(String itemName, double savings) {
		this.itemName = itemName;
		this.savings = savings;
	}
	
	@Override
	public double calculateDiscountFor(GroceryItem item) {
		return this.savings;
	}

	@Override
	public boolean matches(GroceryItem item) {
		return item.getName().contains(this.itemName);
	}

}
