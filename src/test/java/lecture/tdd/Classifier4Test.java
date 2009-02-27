package lecture.tdd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class Classifier4Test {
	// start of boundary condition
	@Test
	public void factors_for_1() {
		Classifier4 c = new Classifier4(1);
		c.calculateFactors();
		assertThat(c.getFactors(), is(expectationSetWith(1)));
	}

	@Test(expected = InvalidNumberException.class)
	public void cannot_classify_negative_numbers() {
		new Classifier4(-20);
	}

	@Test
	public void factors_for_max_int() {
		Classifier4 c = new Classifier4(Integer.MAX_VALUE);
		c.calculateFactors();
		assertThat(c.getFactors(), is(expectationSetWith(1, 2147483647)));
	}
	// consumption awareness encourages exploration of boundary conditions
	// end of boundary conditions

	@Test
	public void factors_for_100() {
		Classifier4 c = new Classifier4(100);
		c.calculateFactors();
		assertThat(c.getFactors(), is(expectationSetWith(1, 100, 2, 50, 4, 25, 5, 20, 10)));
	}

	@Test
	public void factors_for_12() {
		Classifier4 c = new Classifier4(12);
		c.calculateFactors();
		assertThat(c.getFactors(), is(expectationSetWith(1, 2, 3, 4, 6, 12)));
	}

	@Test
	public void factors_for_6() {
		Classifier4 c = new Classifier4(6);
		c.calculateFactors();
		assertThat(c.getFactors(), is(expectationSetWith(1, 2, 3, 6)));
	}

	private Set<Integer> expectationSetWith(Integer... numbers) {
		return new HashSet<Integer>(Arrays.asList(numbers));
	}
}