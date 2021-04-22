package com.assignment;

public class ques2 {
	public static void main(String[] args) {
		for(int i=0,j=1;i<100&&j<101;i+=2,j+=2) {
			System.out.println(i+" + "+j+" = "+(i&j));
		}
	}
}
