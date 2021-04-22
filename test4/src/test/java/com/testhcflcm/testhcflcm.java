package com.testhcflcm;
import com.hcflcm.*;
import org.junit.*;

public class testhcflcm {
		static hcflcm n;
		
		@BeforeClass
		public static void set() {
			n=new hcflcm();
		}
		
		
		@Test 
		public void test1() {
			org.junit.Assert.assertEquals(1, n.checkhcf(13,21,27));
		}

		@Test 
		public void test2() {
			org.junit.Assert.assertEquals(2457, n.checklcm(13,21,27));
		}
		
		@Test 
		public void test3() {
			org.junit.Assert.assertEquals(12, n.checklcm(2,4,6));
		}
		
		@Test 
		public void test4() {
			org.junit.Assert.assertEquals(2, n.checkhcf(2,4,6));
		}
}
