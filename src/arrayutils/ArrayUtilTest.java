package arrayutils;

public class ArrayUtilTest {

	public static void main(String[] args) {

		int[] intArray = { 10, 20, 30, 40, 50 };

		double[] doubleArray = ArrayUtils.intToDouble(intArray);

		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i] + " ");
		}

		System.out.println();

		double[] doubleArray2 = { 11.2, 23.24, 52.11, 42.765 };

		int[] intArray2 = ArrayUtils.doubleToInt(doubleArray2);

		for (int i = 0; i < intArray2.length; i++) {
			System.out.print(intArray2[i] + " ");
		}

		System.out.println();

		int[] arr1 = { 1, 4, 20, 3, 5 };
		int[] arr2 = { 6, 33, 24, 99, 1, 23, 44 };

		int[] concat = ArrayUtils.concat(arr1, arr2);

		for (int i = 0; i < concat.length; i++) {
			System.out.print(concat[i] + " ");
		}

	}

}
