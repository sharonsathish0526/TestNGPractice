package org.pageexe;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups = "A")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = "A")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups = "B")
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups = "B")
	public void test4() {
		System.out.println("test4");
	}

}
