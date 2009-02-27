package lecture.tdd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class Classifier4Test {
	@Test
	public void factors_for_6() {
		Set<Integer> expected = new HashSet<Integer>(Arrays.asList(1, 2, 3, 6));
	    Classifier4 c = new Classifier4(6);
	    c.calculateFactors();
	    assertThat(c.getFactors(), is(expected));
	}
}
