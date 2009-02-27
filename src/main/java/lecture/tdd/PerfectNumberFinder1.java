package lecture.tdd;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberFinder1 {
	public static boolean isPerfect(int number) {
        // get factors
        List<Integer> factors = new ArrayList<Integer>();
        factors.add(1);
        factors.add(number);
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                factors.add(i);

        // sum the factors
        int sum = 0;
        for (int n : factors)
            sum += n;

        // decide if its perfect
        return sum - number == number;
    }
}