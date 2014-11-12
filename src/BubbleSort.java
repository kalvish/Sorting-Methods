import java.util.Arrays;

public class BubbleSort {

	public Double[] sort(Double[] heights) {
		// TODO Auto-generated method stub
		Double[] heightsEdit = Arrays.copyOf(heights, heights.length);

		long startTime = System.nanoTime();
		// ... the code being measured ...

//		for (int k = 1; k < heightsEdit.length; k++) {
//			for (int i = 0; i < heightsEdit.length - k; i++) {
//				if (heightsEdit[i] > heightsEdit[i + 1]) {
//					Utils.swap(heightsEdit, i, i + 1);
//				}
//			}
//		}

		for (int k = heightsEdit.length - 1; k >= 1; k--) {
			//System.out.println("\n" + "decrement--------");
			for (int i = 0; i < k; i++) {
				//System.out.println("\n" + "increment");
				if (heightsEdit[i] > heightsEdit[i + 1]) {
					Utils.swap(heightsEdit, i, i + 1);
					//System.out.println("\n" + "swap");
				}
			}
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("\n" + this.getClass().getSimpleName() + " : " + estimatedTime);

		return heightsEdit;
	}

}
