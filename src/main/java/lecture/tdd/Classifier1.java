package lecture.tdd;

public class Classifier1 {
	public static boolean isFactor(int factor, int number) {
		return number % factor == 0;
	}

	public static int[] factorsFor(int number) {
		return new int[] { number };
	}
}