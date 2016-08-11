import java.util.Arrays;

public class InsertionSort {
	
	
	public void insertionSort(int [] array){
		int j;
		
		for(int i = 1; i< array.length; i++){
			j = i;
			//System.out.println("Comparing:  ["+array[j]+","+array[j-1]+"]");

			while( j > 0 && array[j] < array[j-1]){
				swap(array, j, j-1);
				j = j-1 ;
			}
		}
	}
	
	public void swap(int[]arr,int i, int j){
	//	System.out.println("Swapping:  ["+arr[i]+","+arr[j]+"]");
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		//System.out.println(Arrays.toString(arr));
	}
}
