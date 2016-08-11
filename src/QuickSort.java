import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[] array)
	{
		//System.out.println("*********************QUICKSORT*********************");

	    quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int pivotIndex, int rangeIndex)
	{
		if(pivotIndex<rangeIndex)
        {
            int q=partition(array,pivotIndex,rangeIndex);
            quickSort(array,pivotIndex,q);
            quickSort(array,q+1,rangeIndex);
        }
	}
	
	private static int partition(int[] array, int pivotIndex, int rangeIndex) {
        int x = array[pivotIndex];
        int i = pivotIndex;
        int j = rangeIndex;
		//System.out.println("Partitioning: ["+ pivotIndex + "," + rangeIndex +"] Pivot:  " + x);

        while (true) {
            while ( i< rangeIndex && array[i] < x){
                i++;
               
            }
            while (j>pivotIndex && array[j] > x){
                j--;
            }
            if (i < j){
                swapNumbers(array, i, j);
                
                i++;
                j--;
            }
            else{
                return j;
            }
        }
    }

    private static void swapNumbers(int[] array, int i, int j) {
    	//System.out.print(Arrays.toString(array));
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    	//System.out.print( " --> " + Arrays.toString(array) + " swapped(" + array[j] + " , " + array[i] +")\n");

        
    }	

}
