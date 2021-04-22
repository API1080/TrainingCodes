package com.evenoddtest;
import com.evenodd.*;
import org.junit.*;


public class evenoddtest {

	static evenodd n;
	
	@BeforeClass
	public static void set() {
		n=new evenodd();
	}
	
	@Test
	public void test0() {
		org.junit.Assert.assertEquals("even", n.check(88));
	}
	
	@Test
	public void test1() {
		org.junit.Assert.assertEquals("even", n.check(0));
	}
	
	@Test
	public void test2() {
		org.junit.Assert.assertEquals("odd", n.check(31));
	}
	
	@After
	public void display() {
		System.out.println("SUCCESSFUL");
	}
}


