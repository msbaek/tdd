package lecture.tdd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnit44Runner;
import static org.hamcrest.core.Is.*;

@RunWith(MockitoJUnit44Runner.class)
public class Classifier7Test {
	@Mock
	private Finder finder;

	@Test public void external_factors() {
		Classifier7 c = new Classifier7(46, finder);
		final Set<Integer> expected = new HashSet<Integer>(Arrays.asList(1, 2, 6, 7, 23, 46));
		
		when(finder.factors()).thenReturn(expected);
		assertThat(c.sumOfFactors(), is(1 + 2 + 6 + 7+ 23+ 46));
		
		verify(finder).factors();
	}
}