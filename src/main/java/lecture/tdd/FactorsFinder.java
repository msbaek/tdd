package lecture.tdd;

import java.util.Set;

public class FactorsFinder implements Finder {
	private int number;
	private Set<Integer> factors;

	public FactorsFinder(int number) {
		this.number = number;
	}
	
	@Override
	public Set<Integer> factors() {
		calculateFactors();
		return factors;
	}

	private boolean isFactor(int factor) {
		return number % factor == 0;
	}
	
	public Set<Integer> getFactors() {
		return factors;
	}
	
	public void calculateFactors() {
		for(int i = 2; i < Math.sqrt(number) + 1; i++)
			if(isFactor(i))
				addFactor(i);
	}

	private void addFactor(int factor) {
		factors.add(factor);
		factors.add(number / factor);
	}
}