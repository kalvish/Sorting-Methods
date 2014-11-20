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
}
