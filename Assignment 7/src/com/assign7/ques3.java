package com.assign7;
import java.util.*;

import java.util.Map.Entry;


public class ques3 {
	public static void main(String[] args) {
	    HashMap<Integer, String> places = new HashMap<Integer, String>();
	    places.put(4, "Kerala");
	    places.put(3, "Tamil Nadu");
	    places.put(5, "Karnataka");
	    places.put(1, "Maharashtra");
	    places.put(2, "Telangana");
	    System.out.println("Initial Map: "+places);
	    
	    List<Integer> keys= new ArrayList<Integer>(places.keySet());
	    Collections.reverse(keys);
	    
	    System.out.print("Reverse of the hashmap: ");
	    for (Integer strKey : keys) {	
            System.out.print(strKey+"="+places.get(strKey)+",  ");
	    }
	    System.out.println();
	    
	    System.out.print("elements that are less than or equal to the key ‘3': ");
	    List<Integer> keys1= new ArrayList<Integer>(places.keySet());
	    for (Integer strKey : keys1) {
	    	if(strKey<=3)
            System.out.print(strKey+"="+places.get(strKey)+",  ");
	    }
	    System.out.println();
	    
	    System.out.print("elements that do not contain the key '2' and '5': ");
	    for (Integer strKey : keys1) {
	    	if(strKey!=2&&strKey!=5)
            System.out.print(strKey+"="+places.get(strKey)+",  ");
	    }
	    System.out.println();
	    
	    System.out.print("elements that are greater than the key ‘3': ");
	    for (Integer strKey : keys1) {
	    	if(strKey>=3)
            System.out.print(strKey+"="+places.get(strKey)+",  ");
	    }
	    System.out.println();
	    
	    System.out.print("elements that are lesser than or equal to the value ‘Maharashtra': ");
	    List<String> mapvalues = new ArrayList<>(places.values());
	    Collections.sort(mapvalues);
	    for(String s : mapvalues) {
	    	for(Entry<Integer,String> entry: places.entrySet()) { 
	    	      if(entry.getValue() == s) {
	    	        System.out.print(entry.getKey()+"="+s+", ");
	    	        break;
	    	      }
	    	    }
	    	if(s=="Maharashtra") {
	    		  break;
	    	  }
	    }
	    System.out.println();
	    
	    System.out.print("elements that are greater than the value 'Karnataka': ");	
	    Iterator itr=mapvalues.iterator();
	    while(itr.hasNext()) {
	    	if(itr.next()=="Karnataka")
	    		break;
	    }
	    while(itr.hasNext()) {
	    	String s=(String) itr.next();
	    	for(Entry<Integer,String> entry: places.entrySet()) { 
	    	      if(entry.getValue() == s) {
	    	        System.out.print(entry.getKey()+"="+s+", ");
	    	        break;
	    	      }
	    	    }
	    	
	    }
	    System.out.println();
	    
	    
	    System.out.print("elements that does not contain the value ‘Kerala' and 'Telangana': ");
	    for (Integer strKey : keys1) {
	    	if(places.get(strKey)!="Kerala"&&places.get(strKey)!="Telangana")
            System.out.print(strKey+"="+places.get(strKey)+",  ");
	    }
	    
	}
}
