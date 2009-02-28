package lecture.tdd;

public class Classifier7 {
	private int number;
	private Finder factors;

	public Classifier7(int number, Finder factors) {
		this.number = number;
		this.factors = factors;
	}

	public boolean isPerfect() {
		return sumOfFactors() - number == number;
	}

	public int sumOfFactors() {
		int sum = 0;
		for (int i : factors.factors())
			sum += i;
		return sum;
	}
}