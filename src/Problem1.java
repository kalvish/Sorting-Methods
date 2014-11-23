import java.util.Arrays;
import java.util.LinkedList;

//BubbleSort : 30006983000

//SelectionSort : 9626248000

//InsertionSort : 14560687000

public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] heights = {5.45,3.56,6.45,2.45,6.34,1.45,4.35,1.34};
//		Double[] heights = new Double[1000];
//		LinkedList<Double> heightsLinkedList = new LinkedList<>();
//		
//		for (int i = 0; i < heights.length; i++) {
//			heights[i] = Math.random();
//			heightsLinkedList.add(heights[i]);
//		}
//		
		BubbleSort bubbleSort = new BubbleSort();
		Comparable [] sortedArray = bubbleSort.sort(heights);
		//System.out.println(Arrays.toString(sortedArray));
//		
		SelectionSort selectionSort = new SelectionSort();
		Comparable [] selectionSortedArray = selectionSort.sort(heights);
		//System.out.println(Arrays.toString(selectionSortedArray));
		
		InsertionSort insertionSort = new InsertionSort();
		Comparable [] sortedDoubles = insertionSort.sort(heights);
		//System.out.println(Arrays.toString(sortedDoubles));
//		
//		LinkedList<Double> sortedLS = insertionSort.sort(heightsLinkedList);
		
		//System.out.println(sortedLS.toString());
		
		Integer[] a = {2,9,6,8,10,12,4,2};
		Integer[]b = {2,4,1,3,9};
		Integer[] merge = new Integer[a.length+b.length];
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(heights);
		//mergeSort.compareAndMergeTwoSortedArrays(merge, a, b);
		//mergeSort.compareAndMergeTwoSortedArrays(merge, b,1, 2);
	}

}
