package lecture.tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PerfectNumberFinder1Test {
	private static Integer[] PERFECT_NUMS = {6, 28, 496, 8128, 33550336};

	@Test public void test_perfection() {
	    for(int i : PERFECT_NUMS)
	        assertTrue(PerfectNumberFinder1.isPerfect(i));
	}

	public void test_non_perfection() {
	    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(PERFECT_NUMS));
	    for(int i = 2; i < 100000; i++) {
	        if(expected.contains(i))
	            assertTrue(PerfectNumberFinder1.isPerfect(i));
	        else
	            assertFalse(PerfectNumberFinder1.isPerfect(i));
	    }
	}
}
