package com.assign7;
import java.util.*;

public class ques1 {
	public static void main(String[] args) {
	
			Scanner sc= new Scanner(System.in); 
			ArrayList<String> lis = new ArrayList<>();
			lis.add("Ant");
			lis.add("bat");
			lis.add("catt");
			lis.add("dartt");
			lis.add("Ear");
			lis.add("fan");
			System.out.println("enter first index: ");
			int a=sc.nextInt();
			System.out.println("enter Second index: ");
			int b=sc.nextInt();
			try {
				String s=lis.get(a);
				lis.set(a,lis.get(b));
				lis.set(b, s);
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("The index you have entered is invalid");
		        System.out.println("Please enter an index number between 0 and 5");
			}
			
			System.out.println("New arraylist:\n"+lis);
	}
}
 