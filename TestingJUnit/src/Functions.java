
public class Functions {
	public static int returnDouble(int x) {
		return Math.abs(x + x);
	}

	public static boolean isPalindrom(String palin) {
		StringBuilder sb = new StringBuilder();
		for (char c : palin.toCharArray()) {
			sb.insert(0, c);
		}

		return palin.equals(sb.toString());
	}
}
