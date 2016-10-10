public class ProductStorage {
	private Product[] products;

	public ProductStorage() {
	}
	
	public void setProducts(Product[] products) {
		this.products = products;
	}

	public double calculateTotalWeight() {
		double sumWeight = 0;
		for (Product product : products) {
			if (product != null)
				sumWeight += product.getWeight();
		}
		return sumWeight;
	}

	public void showProducts() {
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
