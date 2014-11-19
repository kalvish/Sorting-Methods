import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utils {
	
	/*public static final <T> void swap(double[] a, int i, int j) {
		double t = a[i];
		a[i] = a[j];
		a[j] = t;
	}*/
	
	// is v < w ?
	public static <T> boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }
	
	public static final <T> void swap(T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static final <T> void swap(List<T> l, int i, int j) {
		Collections.<T> swap(l, i, j);
	}

	//Examples for the above two swapping functions.
	/*private void test() {
		String[] a = { "Hello", "Goodbye" };
		swap(a, 0, 1);
		System.out.println("a:" + Arrays.toString(a));
		List<String> l = new ArrayList<String>(Arrays.asList(a));
		swap(l, 0, 1);
		System.out.println("l:" + l);
	}*/
	

}
