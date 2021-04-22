package com.assign5;
import java.util.*;  

public class samestr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int l=str1.length();
		int flag=0;
		for(int i=0;i<l;i++) {
			if(str1.charAt(i)!=str2.charAt(i))
				flag=1;
		}
		if(flag==0)
			System.out.println("Same");
		else
			System.out.println("Not same");
	}
}
