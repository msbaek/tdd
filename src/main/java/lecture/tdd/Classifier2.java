package lecture.tdd;

public class Classifier2 {
	// objects are the keepers of state
	private int number;

	public Classifier2(int number) {
		this.number = number;
	}

	public boolean isFactor(int factor) {
		return number % factor == 0;
	}
}