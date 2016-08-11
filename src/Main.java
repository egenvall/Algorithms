import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

	static int[] sortQs = new int[10000];
	static int[] sortHs = new int[10000];
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
			sortHs[i] = random;
		}
	}

	public static void main(String [] args){
		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
		SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();
		double qsTime, ssTime, msTime,isTime,hsTime;
		long startTime = System.nanoTime();

		generateArray();


		// Insertion Sort
		startTime = System.nanoTime();
		is.insertionSort(sortIs);
		isTime = (double)(System.nanoTime() - startTime)/1000000;


		// Merge Sort
		startTime = System.nanoTime();
		ms.mergeSort(sortMs);
		msTime = (double)(System.nanoTime() - startTime)/1000000;

		
		// Heap Sort including heap creation
		startTime = System.nanoTime();
		HeapSort hs = new HeapSort();
		hs.sort(sortHs);
		hsTime = (double)(System.nanoTime() - startTime)/1000000;
		

		// Selection Sort
		startTime = System.nanoTime();
		ss.sort(sortSs);
		ssTime = (double)(System.nanoTime() - startTime)/1000000;

		// Quick Sort
		startTime = System.nanoTime();
		qs.quickSort(sortQs);
		qsTime = (double)(System.nanoTime() - startTime)/1000000;

		System.out.println("Sorted 10000 elements, interval: 0-100");
		System.out.println("\n Quicksort: "  + qsTime+"ms");
		System.out.println("\n Insertionsort: " + isTime +"ms");
		System.out.println("\n Heapsort: "  + hsTime +"ms");
		System.out.println("\n Selectionsort: "  + ssTime +"ms");
		System.out.println("\n Mergesort: "  +  msTime +"ms");


	}

}
