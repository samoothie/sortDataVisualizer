package dataVisualizer;

import java.util.Random;

public class Datavisuals {

	private static int[] populateArrayWithRandomValues(int[] randomizedArray, int sliderValue) {
		Random random = new Random();
		for (int i = 0; i < sliderValue; ++i) {
			randomizedArray[i] = (random.nextInt(1000));
		}
		return randomizedArray;
	}

	private static int[] bubbleSortArray(int[] randomizedArray) {
		int swapVariable = 0;
		boolean hasSwapped = true;
		while (hasSwapped) {
			hasSwapped = false;
			for (int i = 0; i < randomizedArray.length; ++i) {
				
				if(i == randomizedArray.length -1) {
					if(randomizedArray[i-1] > randomizedArray[i]) {
						swapVariable = randomizedArray[i-1];
						randomizedArray[i-1] = randomizedArray[i];
						randomizedArray[i] = swapVariable;
						hasSwapped = true;
					}
				} else if ((randomizedArray[i] > randomizedArray[i + 1]) && i != randomizedArray.length) {
					swapVariable = randomizedArray[i];
					randomizedArray[i] = randomizedArray[i + 1];
					randomizedArray[i + 1] = swapVariable;
					hasSwapped = true;
					
				}
				System.out.print(randomizedArray[i]);
			}
			System.out.println();
		}
		return randomizedArray;
	}

	private static int[] quickSortArray(int[] randomizedArray) {
		return randomizedArray;
	}

	private static int[] mergeSortArray(int[] randomizedArray) {

		return randomizedArray;
	}

	private static int[] heapSortArray(int[] randomizedArray) {
		return randomizedArray;
	}

	public static void main(String[] args) {
		int[] randomizedArray = { 5, 6, 3, 8, 7, 4, 2, 0, 1 };
		int sliderValue = 1;
		int[] finalArray = bubbleSortArray(randomizedArray);
	}
}
