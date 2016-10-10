
public class NumberUtil {

	public int summarizeFirstDigits(int[] numberArray) {
		int sum = 0;
		for (int number : numberArray) {
			sum += number / 100;
		}
		return sum;
	}
}
