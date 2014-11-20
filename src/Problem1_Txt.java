import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Problem1_Txt {

	public static <T> void main(String[] args) {
		
		String[] currentRoom;
	     String [] rooms = {"Start", "Treashre Room1", "Goblin Home1", "Spider Nest1","Goblin Hyme1", "Spider Nest1", "Goblin Home1", "Spider Nest1","Spider Nest2", "Goblin Home1", "Spider Nest1"};

	     
		// TODO Auto-generated method stub
		String str = "";
		try{
		    FileInputStream fstream = new FileInputStream("/Users/kalan/Documents/smart/android/workspace/SortingMethods/src/words.txt");
		          DataInputStream in = new DataInputStream(fstream);
		          BufferedReader br = new BufferedReader(new InputStreamReader(in));
		          String strLine;
		          while ((strLine = br.readLine()) != null)   {
		        	  str= str+ strLine + " ";
		   
		  
		   }
		   in.close();
		   }catch (Exception e){
		     System.err.println("Error: " + e.getMessage());
		   }
		String[] tokens = str.split(" ");
//		String[] a = new String[tokens.length];
//		for (int i = 0; i < tokens.length; i++) {
//			a[i] = tokens[i];
//		}
		String[] a = {"sdf"	," gf", " gdfgdf", " hgfhfg"};
//		try {
//			Scanner s = new Scanner(new File("/Users/kalan/Documents/smart/android/workspace/SortingMethods/src/words.txt")).useDelimiter(",");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		BubbleSort bubbleSort = new BubbleSort();
		Comparable<String> [] sortedArray =  bubbleSort.sort(rooms);
		System.out.println(Arrays.toString(sortedArray));
		
		InsertionSort insertionSort = new InsertionSort();
		Comparable [] sortedDoubles = insertionSort.sort(rooms);
		System.out.println(Arrays.toString(sortedDoubles));
		
		SelectionSort selectionSort = new SelectionSort();
		Comparable [] selectionSortedArray = selectionSort.sort(rooms);
		System.out.println(Arrays.toString(selectionSortedArray));
	}

}
