package lecture.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class Classifier2Test {
	@Test
	public void is_1_a_factor_of_10() {
	    Classifier2 c = new Classifier2(10);
	    assertTrue(c.isFactor(1));
	}
	
	@Test
	public void is_5_a_factor_of_25() {
	    Classifier2 c = new Classifier2(25);
	    assertTrue(c.isFactor(5));
	}
	
	@Test
	public void is_3_a_factor_of_7() {
	    Classifier2 c = new Classifier2(7);
	    assertFalse(c.isFactor(3));
	}
}