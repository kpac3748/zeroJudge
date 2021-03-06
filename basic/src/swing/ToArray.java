package swing;

import java.util.ArrayList;

public class ToArray {

	public static void main(String[] args) {
		// create an empty array list with an initial capacity
	    ArrayList<Integer> arrlist = new ArrayList<Integer>();

	    // use add() method to add values in the list
	    arrlist.add(10);
	    arrlist.add(12);
	    arrlist.add(31);
	    arrlist.add(49);
		
	    System.out.println("Printing elements of array1");

	    // let us print all the elements available in list
	    for (Integer number : arrlist) {
	      System.out.println("Number = " + number);
	    }  

	    // toArray copies content into other array
	    Integer list2[] = new Integer[arrlist.size()];
	    Integer list3[] = new Integer[7];
	    arrlist.toArray(list3);
	    arrlist.toArray(list2);
	
	    System.out.println("Printing elements of array2");
	    System.out.println("list2 = " + list2.length);
	    System.out.println(arrlist.size());
	    
	    
	    // let us print all the elements available in list
	    for (Integer number : list3) {
	      System.out.println("Number = " + number);
	    }
	}

}
