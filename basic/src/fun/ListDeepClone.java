package fun;

import java.util.ArrayList;

public class ListDeepClone {

	public static void main(String[] args) {
        /*deepClone function*/
//        deepCloneTest();
        
        /*notDeepClone function*/
        notDeepCloneTest();
	}
	
	static void deepCloneTest() {
		ArrayList<String> stringList = new ArrayList<>();
		ArrayList<String> stringListClone = new ArrayList<>();
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		
		/*印出原先的list*/
        System.out.println("original list = " + stringList);   
		
//		Iterator<String> iterator = stringList.iterator();
//        while(iterator.hasNext()){
//        	stringListClone.add(new String( iterator.next()));
//        }
        
        for(int i = 0 ; i < stringList.size(); i++) {
        	stringListClone.add(new String(stringList.get(i)));
        }
        
        for(int i = 0 ; i < stringList.size(); i++) {
        	if(stringList.get(i) == stringListClone.get(i)) {
        		System.out.println(stringList.get(i));
        	}
        }
        
        
        
//        stringList.clear();
//		stringListClone.clear();
		
//		stringList.remove(0);
//		stringListClone.remove(0);
        
//        stringList.set(0, "999");
//        stringListClone.set(0, "999");
        
        /*測試方法後的list*/
        System.out.println("after function stringList = " + stringList); 
        System.out.println("after function stringListClone = " + stringListClone); 
	}
	
	static void notDeepCloneTest() {
		ArrayList<String> stringList = new ArrayList<>();
		ArrayList<String> stringListClone = new ArrayList<>();
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		
		/*印出原先的list*/
        System.out.println("original list = " + stringList); 
		
//		stringListClone.addAll(stringList);
		
		stringListClone = stringList;
		
//		for(int i = 0 ; i < stringList.size(); i++) {
//        	stringListClone.add(stringList.get(i));
//        }
        
//        for(int i = 0 ; i < stringList.size(); i++) {
//        	if(stringList.get(i) == stringListClone.get(i)) {
//        		System.out.println(stringList.get(i));
//        	}
//        }
//        
//        if(stringList == stringListClone) {
//    		System.out.println("true");
//    	}
//        else {
//        	System.out.println("false");
//        }
        
		stringList = new ArrayList<>();
//		stringListClone.clear();
		
//		stringList.remove(0);
//		stringListClone.remove(0);
		
//		stringList.set(1, "222");
//		stringListClone.set(0, "999");
		
		/*測試方法後的list*/
        System.out.println("after function stringList = " + stringList); 
        System.out.println("after function stringListClone = " + stringListClone); 
	}

}
