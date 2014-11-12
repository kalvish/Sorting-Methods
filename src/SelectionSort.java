import java.util.Arrays;


public class SelectionSort {

	public Double[] sort(Double[] heights) {
		// TODO Auto-generated method stub
		Double[] heightsEdit = Arrays.copyOf(heights, heights.length);
		
		long startTime = System.nanoTime();
		// ... the code being measured ...

		for (int k = 0; k < heightsEdit.length-1; k++) {
			//System.out.println("\n" + "decrement--------");
			int shortesGuyIndex = k;
			for (int i = k; i < heightsEdit.length-1; i++) {
				//System.out.println("\n" + "increment");
				if (heightsEdit[shortesGuyIndex] > heightsEdit[i + 1]) {
					shortesGuyIndex = i+1;
					//System.out.println("\n" + "swap");
				}
			}
			Utils.swap(heightsEdit, k, shortesGuyIndex);
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("\n" + this.getClass().getSimpleName() + " : " + estimatedTime);

		return heightsEdit;
	}


}
