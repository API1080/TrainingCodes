package com.collectiondemo;
import java.util.*;


public class hashmaptest {
	 public static void main(String[] args) {
		 
		    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		 
		    hashmap.put(11,"Suresh");
		    hashmap.put(22,"Ramesh");
		    hashmap.put(33,"Aladin");
		    hashmap.put(44,"Amit");
		    hashmap.put(55,"Abhishek");
		 
		    Set entrySet = hashmap.entrySet();
		    int index=0,sumofindex=0,sumofvalues=0;
		    Iterator it = entrySet.iterator();
		    
		    while(it.hasNext()){
		       Map.Entry me = (Map.Entry)it.next();
		       sumofindex+=(int)me.getKey();
		       String str=(String)me.getValue();
		       int count=0;
		       for(int i = 0; i < str.length(); i++) {    
		            if(str.charAt(i) != ' ')    
		                count+=1;    
		            }
		       sumofvalues+=count;
				System.out.println("no. of characters at index "+(index++)+" = "+count);
		    }
		   System.out.println("Sum of Keys: "+sumofindex);
		   System.out.println("Number of character: "+sumofvalues);
		 }
}
