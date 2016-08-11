import java.util.Arrays;

public class MergeSort {
	
	
	/**
	 * First variant with array of ints
	 */
	
	
	public static void mergeSort(int [] inputArray){
		//System.out.println("*********************MERGESORT*********************");
		int size = inputArray.length;
		if(size < 2) return; //only one element = already sorted
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		
		// Fill new arrays
		for(int i = 0; i < mid; i++){
			left[i] = inputArray[i];
		}
		
		for(int i = mid; i < size; i++){
			right[i - mid] = inputArray[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,inputArray);
		
	}
	
	public static void merge(int[] left, int[] right, int [] input){
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0, j = 0 , k = 0 ;
		
		while(i < leftSize && j < rightSize){
			if(left[i] <= right[j]){
				input[k] = left[i];
				k++;
				i++;
			}
			else{
				input[k] = right[j];
				k++;
				j++;
			}
		}
		
		//Uneven numbers, right array was longer
		while(i < leftSize){
			input[k] = left[i];
			k++;
			i++;

			
		}
		
		//Uneven numbers, right array was longer
		while(j < rightSize){
			input[k] = right[j];
			k++;
			j++;

		}
	}
   

}
