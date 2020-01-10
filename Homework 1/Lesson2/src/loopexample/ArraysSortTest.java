package loopexample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysSortTest {
//will be modified 
	@Test
	void test() {
		String[] arr = {"4", "2", "3", "6", "8"};
		String[] expected = {"2", "3", "4", "6", "8"};
		Arrays.sort(arr, 0, 4);
		assertArrayEquals(expected, arr);
	}

}
