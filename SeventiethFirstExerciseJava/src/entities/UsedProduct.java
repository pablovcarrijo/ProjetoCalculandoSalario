package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		setManufactureDate(manufactureDate);
	}
	
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManufactureDate() {
		return this.manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() + " (used) $" + String.format("%.2f", getPrice()) + " (Manufature date: " + sdf.format(getManufactureDate()) + ")";
	}
	
}
