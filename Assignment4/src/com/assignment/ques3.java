package com.assignment;

public class ques3 {
	int id;  
	String name;  
	  
	ques3(int id ,int age){  
	System.out.println("id: "+id+"\nage: "+age);  
	}  
	  
	ques3(int id, String n, int age){  
	System.out.println("id: "+id+"\nname: "+n+"\nage: "+age);
	}  
	
	
	public static void main(String[] args) {
		System.out.println("Object with 2 parameters");
		ques3 obj1=new ques3(123,18);
		System.out.println("Object with 3 parameters");
		ques3 obj2=new ques3(23,"Suraj",35);
	}
}
