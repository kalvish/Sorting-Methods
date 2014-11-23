import java.util.Arrays;


public class MergeSort {
	public Comparable [] sort(Comparable [] heights) {
		// TODO Auto-generated method stub
		Comparable [] heightsEdit = Arrays.copyOf(heights, heights.length);
		Comparable [] mergedArray = new Comparable [heightsEdit.length];

		long startTime = System.nanoTime();
		// ... the code being measured ...
		this.compareAndMergeTwoSortedArrays(mergedArray, heightsEdit,0, 1);
		this.compareAndMergeTwoSortedArrays(mergedArray, heightsEdit,2, 3);
		
		this.compareAndMergeTwoSortedArrays(mergedArray, mergedArray,0, 3);
		
		
		this.compareAndMergeTwoSortedArrays(mergedArray, heightsEdit,4, 5);
		this.compareAndMergeTwoSortedArrays(mergedArray, heightsEdit,6, 7);
		
		this.compareAndMergeTwoSortedArrays(mergedArray, mergedArray,4, 7);
		
		
		this.compareAndMergeTwoSortedArrays(mergedArray, mergedArray,0, 7);
		
		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("\n" + this.getClass().getSimpleName() + " : " + estimatedTime);

		return heightsEdit;
	}
	
	
//	private Comparable [] mergeSort(Comparable[] toSort, int i, int j){
//		if((j-i+1)<=2){
//			this.mergeSort(toSort);
//		}
//		return null;
//	}
//	
//	void play (){
//		this.compareAndMergeTwoSortedArrays(mergedArray, toSort, b)
//	}
	
	public Comparable [] compareAndMergeTwoSortedArrays(Comparable [] mergedArray, Comparable [] toSort, int startIndex, int endIndex) {
		int inter =startIndex+((endIndex-startIndex+1)/2);
		Comparable [] a = Arrays.copyOfRange(toSort, startIndex, inter);
		Comparable [] b = Arrays.copyOfRange(toSort, inter, endIndex+1);
		int comparisons = 0;
		int a_inc =0, b_inc = 0, merge_inc = startIndex;
		while (a_inc<a.length && b_inc<b.length) {
			
			if(Utils.less(a[a_inc], b[b_inc])){
				comparisons++;
				mergedArray[merge_inc] = a[a_inc];
				a_inc++;
			}else if(Utils.less(b[b_inc], a[a_inc])){
				comparisons++;
				mergedArray[merge_inc] = b[b_inc];
				b_inc++;
			}else{
				comparisons++;
				mergedArray[merge_inc] = a[a_inc];
				merge_inc++;
				mergedArray[merge_inc] = a[a_inc];
				a_inc++;
				b_inc++;
			}
			merge_inc++;
			
		}
		
		while (a_inc==a.length && b_inc<b.length) {
			mergedArray[merge_inc] = b[b_inc];
			b_inc++;
			merge_inc++;
		}
		while (b_inc==b.length && a_inc<a.length) {
			mergedArray[merge_inc] = a[a_inc];
			a_inc++;
			merge_inc++;
		}
//		if(a_inc==a.length && b_inc==b.length-1){
//			mergedArray[merge_inc] = b[b_inc];
//		}else if(b_inc==b.length && a_inc==a.length-1){
//			mergedArray[merge_inc] = a[a_inc];
//		}
	//	System.out.println(Integer.toString(comparisons) +"\n");
	//	System.out.println(Arrays.toString(mergedArray));
		return mergedArray;
	}
	
	public Comparable [] compareAndMergeTwoSortedArrays(Comparable [] mergedArray, Comparable [] a, Comparable [] b) {
		int comparisons = 0;
		int a_inc =0, b_inc = 0, merge_inc = 0;
		while (a_inc<a.length && b_inc<b.length) {
			
			if(Utils.less(a[a_inc], b[b_inc])){
				comparisons++;
				mergedArray[merge_inc] = a[a_inc];
				a_inc++;
			}else if(Utils.less(b[b_inc], a[a_inc])){
				comparisons++;
				mergedArray[merge_inc] = b[b_inc];
				b_inc++;
			}else{
				comparisons++;
				mergedArray[merge_inc] = a[a_inc];
				merge_inc++;
				mergedArray[merge_inc] = a[a_inc];
				a_inc++;
				b_inc++;
			}
			merge_inc++;
			
		}
		
		while (a_inc==a.length && b_inc<b.length) {
			mergedArray[merge_inc] = b[b_inc];
			b_inc++;
			merge_inc++;
		}
		while (b_inc==b.length && a_inc<a.length) {
			mergedArray[merge_inc] = a[a_inc];
			a_inc++;
			merge_inc++;
		}
//		if(a_inc==a.length && b_inc==b.length-1){
//			mergedArray[merge_inc] = b[b_inc];
//		}else if(b_inc==b.length && a_inc==a.length-1){
//			mergedArray[merge_inc] = a[a_inc];
//		}
		System.out.println(Integer.toString(comparisons) +"\n");
		System.out.println(Arrays.toString(mergedArray));
		return mergedArray;
	}
	
}
