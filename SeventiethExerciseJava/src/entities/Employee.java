package entities;

public class Employee {
	private String name;
	private Integer Hours;
	private Double valuePerHour;
	
	public Employee() {
		
	}
	
	public Employee(String name, Integer hours, Double valuePerHour){
		setName(name);
		setHours(hours);
		setValuePerHour(valuePerHour);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return Hours;
	}

	public void setHours(Integer hours) {
		Hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	
	public double paymente() {
		return getHours() * getValuePerHour();
	}
	
	
	
}
