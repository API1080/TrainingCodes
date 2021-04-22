package com.collectiondemo;
import java.util.*;

public class arraylisttest {
		public static void main(String[] args) {
			ArrayList<String> stmt = new ArrayList<String>();
			stmt.add("Little brown fox");
			stmt.add("jumped over");
			stmt.add("the lazy dog");
			stmt.add("after eating");
			stmt.add("some chicken");
			int count=0,tc=0;
			Iterator<String> itr=stmt.iterator();
			int index=0;
			while(itr.hasNext()) {
				String str=itr.next();
				for(int i = 0; i < str.length(); i++) {    
		            if(str.charAt(i) != ' ')    
		                count+=1;    
		            }
				System.out.println("no. of characters at index "+(index++)+" = "+count);
				tc+=count;
			}
			
			System.out.println("Total no. of characters : "+tc);
		}
}
