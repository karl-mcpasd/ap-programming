import static org.junit.Assert.fail;

import org.junit.Test;

public class TestingFunctions {

	@Test
	public void testIsPalindrom() {
		String[] positive = { "abcdcba", "abcba", "aba", "a", "" };

		for (String s : positive) {
			if (!Functions.isPalindrom(s)) {
				fail(s + " returned false");
			}
		}

		String[] negative = { "bcdcba", "abca", "ba" };
		for (String s : negative) {
			if (Functions.isPalindrom(s)) {
				fail(s + " returned true");
			}
		}
	}

}
