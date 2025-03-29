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
		double[] bubbleArr = new double [nums.length];
		double[] selectionArr = new double [nums.length];
		double[] insertionArr = new double [nums.length];
		for (int i = 0; i < nums.length; i++){
			bubbleArr[i] = nums[i];
			selectionArr[i] = nums[i];
			insertionArr[i] = nums[i];
		}
		int[] bubbleResult = bubbleSort(bubbleArr);
		int[] selectionResult = selectionSort(selectionArr);
		int[] insertionResult = insertionSort(insertionArr);


		if ( bubbleResult[0] <=  selectionResult[0] &&  bubbleResult[0] <= insertionResult[0]){
			return "Bubble";
		}
		else if (selectionResult[0] >= insertionResult[0]){
			return "Insertion";
		}
		else{
			return "Selection";
		}
	}

	public static String leastIterations(double[] nums){
		double[] bubbleArr = new double [nums.length];
		double[] selectionArr = new double [nums.length];
		double[] insertionArr = new double [nums.length];
		for (int i = 0; i < nums.length; i++){
			bubbleArr[i] = nums[i];
			selectionArr[i] = nums[i];
			insertionArr[i] = nums[i];
		}
		int[] bubbleResult = bubbleSort(bubbleArr);
		int[] selectionResult = selectionSort(selectionArr);
		int[] insertionResult = insertionSort(insertionArr);


		if ( bubbleResult[1] <=  selectionResult[1] &&  bubbleResult[1] <= insertionResult[1]){
			return "Bubble";
		}
		else if (selectionResult[1] >= insertionResult[1]){
			return "Insertion";
		}
		else{
			return "Selection";
		}
	}
}
