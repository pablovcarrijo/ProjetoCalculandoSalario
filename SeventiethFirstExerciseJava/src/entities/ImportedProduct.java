package entities;

public class ImportedProduct extends Product{

	private Double customFree;
	
	public ImportedProduct() {
		
	}
	
	public ImportedProduct(String name, Double price, Double customFree) {
		super(name, price);
		setCustomFree(customFree);
	}
	
	public void setCustomFree(Double customFree) {
		this.customFree = customFree;
	}
	
	public Double getCustomFree() {
		return this.customFree;
	}
	
	public double totalPrice() {
		return getCustomFree() + getPrice();
	}
	
	@Override 
	public String priceTag() {
		return getName() + " $" + String.format("%.2f", totalPrice()) + " (Custom free: $" + getCustomFree() + ")"; 
	}
	
}
