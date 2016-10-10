import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		NumberGenerator numberGenerator = new NumberGenerator();
		int[] numbers = numberGenerator.generateRandomNumberArray(3);
		System.out.println(Arrays.toString(numbers));
		
		NumberUtil numberUtil = new NumberUtil();
		System.out.println(numberUtil.summarizeFirstDigits(numbers));
	}

}
