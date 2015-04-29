package arrayutils;

public class ArrayUtils {

	public static double[] intToDouble(int[] source) {
		double[] arr = new double[source.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (double) source[i];
		}

		return arr;
	}

	public static int[] doubleToInt(double[] source) {
		int[] arr = new int[source.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) source[i];
		}

		return arr;
	}

	public static int[] concat(int[] s1, int[] s2) {
		int totalLength = s1.length + s2.length;
		int[] concat = new int[totalLength];

		for (int i = 0; i < totalLength; i++) {
			if (i < s1.length) {
				concat[i] = s1[i];
			} else {
				concat[i] = s2[i - s1.length];
			}
		}

		return concat;
	}

}
