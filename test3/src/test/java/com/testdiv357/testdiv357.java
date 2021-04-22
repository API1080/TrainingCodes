package com.testdiv357;
import com.div357.*;
import org.junit.*;

public class testdiv357 {
	static div357 n;
	
	@BeforeClass
	public static void set() {
		n=new div357();
	}
	
	@Test
	public void test1() {
		org.junit.Assert.assertEquals(true, n.check(21));
	}
	
	
	@Test
	public void test2() {
		org.junit.Assert.assertEquals(false, n.check(19));
	}
	
	
	@Test
	public void test3() {
		org.junit.Assert.assertEquals(true, n.check(105));
	}
}
