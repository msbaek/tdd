package lecture.tdd;

import java.util.HashSet;
import java.util.Set;

public class Classifier4 {
	int number;
	private Set<Integer> factors;

	public Classifier4(int number) {
		if (number < 0)
			throw new InvalidNumberException();
		this.number = number;
		factors = new HashSet<Integer>();
		factors.add(1);
		factors.add(number);
	}

	public boolean isPerfect() {
		calculateFactors();
		return sumOfFactors() - number == number;
	}

	public int sumOfFactors() {
		int sum = 0;
		for (int i : factors)
			sum += i;
		return sum;
	}

	public boolean isFactor(int factor) {
		return number % factor == 0;
	}

	private void addFactor(int i) {
		if (isFactor(i)) {
			factors.add(i);
			factors.add(number / i);
		}
	}

	public Set<Integer> getFactors() {
		return factors;
	}

	public void calculateFactors() {
        for (int i = 2; i < Math.sqrt(number) + 1; i++)
            addFactor(i);
    }
}