
public class PercentageDiscount implements Discount {

	private String itemName;
	private double percentage;

	/**
	 * Create a new percentage discount for a given name
	 * 
	 * @param name
	 * @param percentage percentage (represented as a number between 0 and 1)
	 */
	public PercentageDiscount(String itemName, double percentage) {
		this.itemName = itemName;
		this.percentage = percentage;
	}
	
	@Override
	public double calculateDiscountFor(GroceryItem item) {
		return this.percentage*item.cost();
	}

	@Override
	public boolean matches(GroceryItem item) {
		return item.getName().contains(this.itemName);
	}

}
