public class Run {

	private static String[] cars = { "Mazda", "Audi", "Volvo", "Moskvich", "Buggati", "Nissan", "Lamborgini" };
	
	public static void main(String[] args) {
		CarsUtil carsUtil = new CarsUtil();
		
		showCars();

		carsUtil.sortByAscending(cars);
		System.out.println("\nAfter sortings:");
		showCars();
		
		System.out.println("\nCar with max length: " + carsUtil.getCarWithMaxLength(cars));
		
	}
	
	private static void showCars() {
		for (String car : cars) {
			System.out.println(car);
		}
	}

}
