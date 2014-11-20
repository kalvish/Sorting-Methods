import java.util.Arrays;
import java.util.LinkedList;

public class InsertionSort {

	public Comparable [] sort(Comparable [] heights) {
		// TODO Auto-generated method stub
		Comparable [] heightsEdit = Arrays.copyOf(heights, heights.length);

		long startTime = System.nanoTime();
		// ... the code being measured ...

		Comparable [] sortedArray;
		int marker = 1;

		for (int i = 0; i < heightsEdit.length-1; i++) {
			int currentComparedGuy = marker-1;
			Comparable temp = heightsEdit[marker];
			while ((currentComparedGuy >= 0) && Utils.less(temp, heightsEdit[currentComparedGuy]))
			{
				heightsEdit[currentComparedGuy+1] = heightsEdit[currentComparedGuy];
				currentComparedGuy--;				
			}
			heightsEdit[currentComparedGuy+1]=temp;
			marker++;
		}
		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("\n" + this.getClass().getSimpleName() + " : "
				+ estimatedTime);

		return heightsEdit;
	}

	
	//Linked list implementation
	public LinkedList<Double> sort(LinkedList<Double> heightsLinkedList) {
		// TODO Auto-generated method stub
		LinkedList<Double> heightsEdit = new LinkedList<>();
		heightsEdit = (LinkedList<Double>) heightsLinkedList.clone();

		long startTime = System.nanoTime();
		// ... the code being measured ...

		//Double[] sortedArray;
		int marker = 1;

		for (int i = 0; i < heightsEdit.size()-1; i++) {
			int currentComparedGuy = marker-1;
			double temp = heightsEdit.get(marker);
			while ((currentComparedGuy >= 0) && (temp < heightsEdit.get(currentComparedGuy))
					 ) {
				//heightsEdit[currentComparedGuy+1] = heightsEdit[currentComparedGuy];
				currentComparedGuy--;				
			}
			heightsEdit.add(currentComparedGuy+1, temp);
			heightsEdit.remove(marker+1);
			marker++;
		}
		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("\nLinkedList : " + this.getClass().getSimpleName() + " : "
				+ estimatedTime);

		return heightsEdit;
	}
}
