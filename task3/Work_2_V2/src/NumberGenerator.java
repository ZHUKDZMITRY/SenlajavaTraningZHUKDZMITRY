import java.util.Random;

public class NumberGenerator 
{
	private Random random = new Random();
	
	public int generateRandomNumber()
	{		
		return random.nextInt(1000-100)+100;
	}

	public int[] generateRandomNumberArray(int size) {
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = generateRandomNumber();
		}
		return result;
	}
	
}