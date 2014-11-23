import java.util.Arrays;


public class MergeSort {
	public Comparable [] sort(Comparable [] heights) {
		// TODO Auto-generated method stub
		Comparable [] heightsEdit = Arrays.copyOf(heights, heights.length);

		long startTime = System.nanoTime();
		// ... the code being measured ...
		
		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("\n" + this.getClass().getSimpleName() + " : " + estimatedTime);

		return heightsEdit;
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
