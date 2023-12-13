package AllSortinggs;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] ar = { 5, 2, 1, 4, 3 };
		System.out.println(Arrays.toString(ar));
		insertionSort(ar);
	}

	public static void bruteForce(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void bubbleSort(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 1; j < ar.length - i; j++) {
				if (ar[j] < ar[j - 1]) {
					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void selectionSort(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int start = 0;
			int end = ar.length - 1 - i;
			int maxInd = getMaxInd(ar, start, end);
			int temp = ar[maxInd];
			ar[maxInd] = ar[end];
			ar[end] = temp;

		}
		System.out.println(Arrays.toString(ar));
	}

	private static int getMaxInd(int[] ar, int start, int end) {
		int max = ar[0], maxInd = 0;
		for (int i = start; i <= end; i++) {
			if (ar[i] > max) {
				maxInd = i;
			}
		}
		return maxInd;
	}

	public static void insertionSort(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (ar[j] < ar[j - 1]) {
					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
