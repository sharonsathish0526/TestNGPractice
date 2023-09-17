package org.pageexe;

import org.testng.annotations.Test;

public class PrioritySet {
	@Test(priority = 1)
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = -5)
	public void testa() {
		System.out.println("testa");
	}

	@Test(priority = 0)
	public void test() {
		System.out.println("test");
	}

}
