import java.util.NoSuchElementException;

public class HeapSort 
{
	/*From stackexchange*/
	private int data[];
    private int size;
    public HeapSort(){
    	
    }
	public HeapSort(int data[]) {
	    this.data = data;
	    this.size = data.length;
	    for (int i = size / 2 - 1; i >= 0; i--) {
	        heapify(i);
	    }
	    
	}
	
	private void heapify(int i) {
	    // You might as well start with this optimistic assumption
	    int largestElementIndex = i;

	    // The optimistic assumption leads to nice parallelism between the
	    // left-child and right-child cases.
	    int l = leftChild(i);
	    if (l < size && data[l] > data[largestElementIndex]) {
	        largestElementIndex = l;
	    }
	    int r = rightChild(i);
	    if (r < size && data[r] > data[largestElementIndex]) {
	        largestElementIndex = r;
	    }

	    // If heap consistency was locally violated
	    if (largestElementIndex != i) {
	        int swap = data[i];
	        data[i] = data[largestElementIndex];
	        data[largestElementIndex] = swap;

	        // Recursively heapify the affected sub-tree
	        heapify(largestElementIndex);
	    }
	}
	
	public int removeNext() throws NoSuchElementException {
	    if (size == 0) {
	        throw new NoSuchElementException();
	    }
	    int next = data[0];
	    data[0] = data[--size];
	    heapify(0);
	    return next;
	}
	
	public int size() { return this.size; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }
	
	public static void sort(int[] data) {
	    HeapSort heap = new HeapSort(data);
	    for (int i = heap.size() - 1; i >= 0; i--) {
	        int nextMax = heap.removeNext();

	        // This is a rather naughty move, since heap.data is
	        // aliased to data.  We do this only because we know
	        // from the way the heap works that the end of the array
	        // can be used to store our sorted result in place.
	        data[i] = nextMax;
	    }
	    
	    
	    
	    
	}
}