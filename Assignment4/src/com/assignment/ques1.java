package com.assignment;

public class ques1 {
		public static void main(String[] args) {
			for(int i=0;i<=100;i++) {
				if(i%4==0&&i%7==0)
					System.out.println("Left shift of "+i+"="+(i<<1));
			}
		}
}
