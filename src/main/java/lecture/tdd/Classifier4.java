package lecture.tdd;

import java.util.HashSet;
import java.util.Set;

public class Classifier4 {
	int number;
	private Set<Integer> factors;

	public Classifier4(int number) {
		this.number = number;
		factors = new HashSet<Integer>();
		factors.add(1);
		factors.add(number);
	}

	public boolean isFactor(int factor) {
		return number % factor == 0;
	}

	public void addFactor(int factor) {
		factors.add(factor);
	}

	public Set<Integer> getFactors() {
		return factors;
	}

	public void calculateFactors() {
		for (int i = 2; i < number; i++)
			if (isFactor(i))
				addFactor(i);
	}
}