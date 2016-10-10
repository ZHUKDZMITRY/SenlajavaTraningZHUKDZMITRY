public class Run {

	public static void main(String[] args) {
		Product[] products = new Product[7];
		products[0] = new Monitor(4.120, "Monitor 1");
		products[1] = new Mouse(0.200, "Mouse 1");
		products[2] = new Mouse(0.180, "Mouse 2");
		products[3] = new SystemBlock(3.500, "System block 1");
		products[4] = new SystemBlock(4.200, "System block 2");
		products[5] = new SystemBlock(5.100, "System block 3");
		products[6] = new Monitor(6.200, "Monitor 2");

		ProductStorage storage = new ProductStorage();
		storage.setProducts(products);
		storage.showProducts();

		double totalWeight = storage.calculateTotalWeight();
		System.out.printf("Total weight = %.3f", totalWeight);
	}

}
