import java.util.Arrays;

public class CarsUtil {

	public void sortByAscending(String[] cars) {
		Arrays.sort(cars);
	}

	public String getCarWithMaxLength(String[] cars) {
		String result = "";
		for (String car : cars) {
			if (result.length() < car.length()) {
				result = car;
			}
		}
		return result;
	}
}
