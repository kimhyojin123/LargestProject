package JunitProject_LargestTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestTest {

	@Test
	void test() {
		assertEquals(9, Largest.largest(new int[] {7,8,9}));
	}

}
