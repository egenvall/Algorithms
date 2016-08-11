import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
	
	static int[] sortQs = new int[10000];
	static int[] sortMs = new int[10000];
	static int[] sortSs = new int[10000];
	static int[] sortIs = new int[10000];
	
	public static void generateArray(){
		Random r = new Random();
		for(int i = 0 ; i < 10000; i++){
			int random = r.nextInt(100);
			sortQs[i] = random;
			sortMs[i] = random;
			sortIs[i] = random;
			sortSs[i] = random;
		}
	}
	
	public static void main(String [] args){
		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
		SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();
		
			generateArray();
			long qsTime, ssTime, msTime,isTime;

			//System.out.println(Arrays.toString(sortQs));
			long startTime = System.nanoTime();
			
			startTime = System.nanoTime();
			is.insertionSort(sortIs);
			isTime = System.nanoTime() - startTime;
			
			
			startTime = System.nanoTime();
			ms.mergeSort(sortMs);
			msTime = System.nanoTime() - startTime;
			
			startTime = System.nanoTime();
			ss.sort(sortSs);
			ssTime = System.nanoTime() - startTime;
			
			startTime = System.nanoTime();
			qs.quickSort(sortQs);
			qsTime = System.nanoTime() - startTime;
			
			
			
			
			
			System.out.println("\n Finished Sorting QS: "  +  "Time: " + (double)qsTime/1000000 +"ms");
			System.out.println("\n Finished Sorting IS: " + "Time: " + (double)isTime/1000000 +"ms");
			System.out.println("\n Finished Sorting SS: "  + "Time: " + (double)ssTime/1000000 +"ms");
			System.out.println("\n Finished Sorting MS: "  + " Time: " + (double)msTime/1000000 +"ms");

		
	}

}
