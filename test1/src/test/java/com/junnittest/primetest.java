package com.junnittest;
import com.primenum.*;
import org.junit.*;

public class primetest {
	static prime n;
	
	@BeforeClass
	public static void set() {
		n=new prime();
	}
	
	@Test
	public void test1() {
		org.junit.Assert.assertEquals(false, n.checkPrime(0));
	}
	
	@Test
	public void test2() {
		org.junit.Assert.assertEquals(true, n.checkPrime(31));
	}
	
	@After
	public void display() {
		System.out.println("SUCCESSFUL");
	}
}
