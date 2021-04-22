package com.assign7;
import java.util.*;

public class ques2 {
	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();  
		al.add("L");  
		al.add("M");  
		al.add("N");  
		al.add("O"); 
		al.add("P");
		al.add("Q"); 
		System.out.println("Initial Set: "+al);
		
		System.out.println("Reverse Set: "+al.descendingSet());
		
		System.out.println("elements that are less than or equal to the element 'O': "+al.headSet("O",true));
		
		System.out.print("elements that do not contain the element 'Q' :");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o!="Q")
				System.out.print(o+", ");
			
		}
		System.out.println();
		
		System.out.println("elements that are greater than the element 'N' : "+al.tailSet("N",true));
		
		System.out.print("elements that do not contain the element ‘L' :");
		Iterator itr1=al.iterator();
		while(itr1.hasNext()) {
			Object o=itr1.next();
			if(o!="L")
				System.out.print(o+", ");
			
		}
	}
}
