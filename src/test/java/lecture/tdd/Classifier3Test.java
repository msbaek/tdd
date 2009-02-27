package lecture.tdd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class Classifier3Test {
	@Test
	public void add_factors() {
		Set<Integer> expected = new HashSet<Integer>(Arrays.asList(1, 2, 3, 6));
	    Classifier3 c = new Classifier3(6);
	    c.addFactor(2);
	    c.addFactor(3);
	    assertThat(c.getFactors(), is(expected));
	}
}
