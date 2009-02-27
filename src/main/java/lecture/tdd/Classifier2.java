package lecture.tdd;

import java.util.ArrayList;
import java.util.List;

public class Classifier2 {
	// objects are the keepers of state
	private int number;

	public Classifier2(int number) {
		this.number = number;
	}

	public boolean isFactor(int factor) {
		return number % factor == 0;
	}

	public int[] getFactors() {
		List<Integer> factors = new ArrayList<Integer>();
		factors.add(1);
		factors.add(number);
		for (int i = 2; i < number; i++) {
			if (isFactor(i))
				factors.add(i);
		}
		int[] intListOfFactors = new int[factors.size()];
		int i = 0;
		for (Integer f : factors)
			intListOfFactors[i++] = f.intValue();
		return intListOfFactors;
	}
}