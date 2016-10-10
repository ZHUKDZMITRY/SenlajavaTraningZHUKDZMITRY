
public class Product {
	
	private double weight;
	private String name;

	public Product(double weight, String name) {
		super();
		this.weight = weight;
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getName() + ": " + getWeight();
	}

}
