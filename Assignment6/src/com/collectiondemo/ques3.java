package com.collectiondemo;
 class arithmetic{
	static int adds(int a,int b) {
		return a+b;
	}
	static int subs(int a,int b) {
		return a-b;
		}
	static int multiply(int a,int b) {
		return a*b;
		}
	static float div(int a,int b) {
		return a+b;
		}
	static int mods(int a,int b) {
		return a%b;
		}
	static int inc(int a) {
		return ++a;
		}
	static int dec(int a) {
		return --a;
		}
}

class bitwise extends arithmetic{
	static int and(int a,int b) {
		return a&b;
		}
	static int or(int a,int b) {
		return a|b;
		}
	static int xor(int a,int b) {
		return a^b;
		}
	static int nor(int a) {
		return ~a;
		}
}




public class ques3 extends bitwise{
	
	public static void main(String[] args) {
		ques3 obj=new ques3();
		System.out.println(obj.dec(5));
		
		ques3 obj2=new ques3();
		System.out.println(obj2.adds(5,7));
		
		ques3 obj3=new ques3();
		System.out.println(obj3.nor(7));

		ques3 obj4=new ques3();
		System.out.println(obj4.or(19,7));

	
	}

}
