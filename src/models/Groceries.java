package models;

public class Groceries {
	private double weight = 0.0;
	private double pricePerUnit = 0.0;
	
	public Groceries() {

	}

	public Groceries(double weight, double pricePerUnit) {
		this.weight = weight;
		this.pricePerUnit = pricePerUnit;
	}
	
	/**
	 * calculates total price of grocery by multiplying the weight to the price per unit of that weight
	 * @return price of grocery
	 */
	public double calculatePrice() {
		return this.weight * this.pricePerUnit;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	
	
	

}
