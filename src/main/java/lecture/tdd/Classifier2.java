package lecture.tdd;

import java.util.HashSet;
import java.util.Set;

public class Classifier2 {
	// objects are the keepers of state
	private int number;

	Set<Integer> factors = new HashSet<Integer>();
	
	public Classifier2(int number) {
		this.number = number;
		factors.add(1);
		factors.add(number);
	}

	public boolean isFactor(int factor) {
		return number % factor == 0;
	}

	public Integer [] getFactors() {
		for (int i = 2; i < number; i++)
			addIfFactor(i);
		return createArrayFromSet();
	}

	private Integer[] createArrayFromSet() {
		return factors.toArray(new Integer [factors.size()]);
	}

	private void addIfFactor(int i) {
		if (isFactor(i))
			factors.add(i);
	}
}