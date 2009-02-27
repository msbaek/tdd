package lecture.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class Classifier1Test {
	@Test
	public void is_factor() {
		assertTrue(Classifier1.isFactor(1, 10));
	}

	@Test
	public void factors_for() {
		int[] expected = new int[] { 1 };
		assertThat(Classifier1.factorsFor(1), is(expected));
	}
}