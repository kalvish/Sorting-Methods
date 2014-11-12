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
		//Double[] heights = {5.45,3.56,6.45,2.45,6.34,1.45};
		Double[] heights = new Double[10];
		LinkedList<Double> heightsLinkedList = new LinkedList<>();
		
		for (int i = 0; i < heights.length; i++) {
			heights[i] = Math.random();
			heightsLinkedList.add(heights[i]);
		}
		
		BubbleSort bubbleSort = new BubbleSort();
		Double[] sortedArray = bubbleSort.sort(heights);
		//System.out.println(Arrays.toString(sortedArray));
		
		SelectionSort selectionSort = new SelectionSort();
		Double[] selectionSortedArray = selectionSort.sort(heights);
		//System.out.println(Arrays.toString(selectionSortedArray));
		
		InsertionSort insertionSort = new InsertionSort();
		Double[] sortedDoubles = insertionSort.sort(heights);
		LinkedList<Double> sortedLS = insertionSort.sort(heightsLinkedList);
		//System.out.println(Arrays.toString(sortedDoubles));
		//System.out.println(sortedLS.toString());
	}

}
