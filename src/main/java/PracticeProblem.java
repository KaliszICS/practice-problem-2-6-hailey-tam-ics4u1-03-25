public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] bubbleSort(double[] nums){
		int swapCounter = 0;
		int comparisonCounter = 0;
		boolean swapped = true;
		
		for (int i = 0; i < nums.length-1 && swapped; i++){
			swapped = false;
			for (int j = 0; i < nums.length - 1 - j; j++){
				comparisonCounter++;
				if(nums[j] > nums[j+1]){
					double temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swapped = true;
					swapCounter+=3;
				}
			}
		}
		int[] arr = {swapCounter, comparisonCounter};
		return arr;
	}

	public static int[] selectionSort(double[] nums){
		int swapCounter = 0;
		int comparisonCounter = 0;
		for (int i = 0; i < nums.length - 1; i++){
			int smallestIndex = i;
			for(int j = i + 1; j < nums.length; j++){
				comparisonCounter++;
				if(nums[j] < nums[smallestIndex]){
					smallestIndex = j;
					swapCounter++;
				}
			}
			double temp = nums[smallestIndex];
			nums[smallestIndex] = nums[i];
			nums[i] = temp;
			swapCounter += 3; 
		}
		int[] arr = {swapCounter, comparisonCounter};
		return arr;
	}

	public static int[] insertionSort(double[] nums){
		int swapCounter = 0;
		int comparisonCounter = 0;
		for (int i = 1; i < nums.length; i++){
			double key = nums[i];
			int index = i - 1;
			swapCounter++;
			while (index >= 0 && nums[index] > key){
				nums[index + 1] = nums[index];
				index--;
				comparisonCounter++;
				swapCounter++;
			}
			nums[index + 1] = key;
			swapCounter++;
		}
		int[] arr = {swapCounter, comparisonCounter};
		return arr;
	}

	public static String leastSwaps(double[] nums){
		double[] nums1 = new double [nums.length];
		double[] nums2 = new double [nums.length];
		double[] nums3 = new double [nums.length];
		for (int i = 0; i < nums.length; i++){
			nums1[i] = nums[i];
			nums2[i] = nums[i];
			nums3[i] = nums[i];
		}

		int bubbleSwapCount = 0;
		boolean swapped = true;
		for (int i = 0; i < nums1.length - 1 && swapped; i++){
			swapped = false;
			for (int j = 0; j < nums1.length - 1 - i; j++){
				if(nums1[j] > nums1[j + 1]){
					double temp = nums1[j];
					nums1[j] = nums1[j+1];
					nums1[j+1] = temp;
					swapped = true;
					bubbleSwapCount++;
				}
			}
		}

		int selectionSwapCount = 0;
		for(int i = 0; i < nums2.length - 1; i++){
			int smallestIndex = i;
			for (int j = i + 1; j < nums2.length; j++){
				if (nums2[j] < nums2[smallestIndex]){
					smallestIndex = j;
				}
			}
				double temp = nums2[smallestIndex];
				nums2[smallestIndex] = nums2[i];
				nums2[i] = temp;
				selectionSwapCount++;
		}
		
		int insertionSwapCount = 0;
		for (int i = 1; i < nums3.length; i++){
			double key = nums3[i];
			int index = i - 1;
			while(index >= 0 && nums3[index] > key){
				nums3[index + 1] = nums3[index];
				index--;
			}
			nums3[index + 1] = key;
			insertionSwapCount++;
		}

		if (bubbleSwapCount <= selectionSwapCount && bubbleSwapCount <= insertionSwapCount){
			return "Bubble";
		}
		else if (selectionSwapCount >= insertionSwapCount){
			return "Insertion";
		}
		else{
			return "Selection";
		}
	}

	public static String leastIterations(double[] nums){
		double[] nums1 = new double [nums.length];
		double[] nums2 = new double [nums.length];
		double[] nums3 = new double [nums.length];
		for (int i = 0; i < nums.length; i++){
			nums1[i] = nums[i];
			nums2[i] = nums[i];
			nums3[i] = nums[i];
		}

		int bubbleIterationsCount = 0;
		boolean swapped = true;
		for (int i = 0; i < nums1.length - 1 && swapped; i++){
			swapped = false;
			for (int j = 0; j < nums1.length - 1 - i; j++){
				bubbleIterationsCount++;
				if (nums1[j] > nums1[j+1]){
					double temp = nums1[j];
					nums1[j] = nums1[j+1];
					nums1[j+1] = temp;
					swapped = true;
				}
			}
		}

		int selectionIterationsCount = 0;
		for (int i = 0; i < nums2.length - 1; i++){
			int smallestIndex = i;
			for (int j = i + 1; j < nums2.length; j++){
				selectionIterationsCount++;
				if (nums2[j] < nums2[smallestIndex]){
					smallestIndex = j;
				}
			}
			double temp = nums2[smallestIndex];
			nums2[smallestIndex] = nums2[i];
			nums2[i] = temp;
		}

		int insertionIterationsCount = 0;
		for (int i = 1; i < nums3.length; i++){
			double key = nums3[i];
			int index = i - 1;
			while (index >= 0 && nums3[index] > key){
				insertionIterationsCount++;
				nums3[index + 1] = nums3[index];
				index--;
			}
			nums3[index + 1] = key;
		}
		if (bubbleIterationsCount <= selectionIterationsCount && bubbleIterationsCount <= insertionIterationsCount){
			return "Bubble";
		}
		else if (insertionIterationsCount <= selectionIterationsCount){
			return "Insertion";
		}
		else{
			return "Selection";
		}
	}
	
}
