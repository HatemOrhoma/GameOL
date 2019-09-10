import static org.junit.Assert.*;

import org.junit.Test;

public class FindTest {

	@Test
	public void test() {
		assertEquals(0, BeatTheNeighbours.strategy(new int[] {42}));
		assertEquals(4, BeatTheNeighbours.strategy(new int[] {1, 2, 3, 4, 5}));
		assertEquals(0, BeatTheNeighbours.strategy(new int[] {5, 4, 3, 2, 1}));
		assertEquals(2, BeatTheNeighbours.strategy(new int[] {1, 2, 3, 2, 1}));
		assertEquals(3, BeatTheNeighbours.strategy(new int[] {7, 9, 13, 17, 16, 14, 13, 8, 5, 1}));

	}

}
