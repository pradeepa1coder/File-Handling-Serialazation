package AllSortinggs;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int[] ar = { 10, 3, 5, 7 };
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(divide(ar)));

	}

	public static int[] divide(int[] ar) {
		if (ar.length == 1) {
			return ar;
		}
		int mid = ar.length / 2;
		int[] left = divide(Arrays.copyOfRange(ar, 0, mid));
		int[] right = divide(Arrays.copyOfRange(ar, mid, ar.length));
		return merge(left, right);

	}

	private static int[] merge(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}

		return arr3;
	}

}
