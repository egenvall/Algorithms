import java.util.Arrays;

public class SelectionSort {

	public void sort(int[] input){
	//	System.out.println("*********************SELECTIONSORT*********************");

		int smallestAt;
		for(int i = 0; i < input.length; i++){
			smallestAt = i;
			//comparisons++;
			for(int j = i+1; j<input.length; j++ ){
				//comparisons++;
				if(input[j] < input[smallestAt]){
					smallestAt = j;
				}
			}
			swap(input,i,smallestAt);
		
		}
		
		//System.out.println("Comparisons: " + comparisons + "  Swaps: " + swaps);
	
	}
	public void swap(int[]arr,int i, int j){
		//swaps++;
	//	System.out.println("Swapping:  ["+arr[i]+","+arr[j]+"(S)]");
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	//	System.out.println(Arrays.toString(arr));
	}
	
}
