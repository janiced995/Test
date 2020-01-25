package com.project.testpage;

import org.testng.annotations.Test;

public class SecondTest {
	
	@Test(groups = { "SmokeTest" })
	public void test7() {
		System.out.println("this is a test 7 ");
	}
	
	@Test(groups = { "Regression" })
	public void test8() {
		System.out.println("this is a test 8 ");
	}
	
	@Test(groups = { "Regression" })
	public void test9() {
		System.out.println("this is a test 9  ");
	}
	
	@Test(groups = { "Regression" })
	public void test10() {
		System.out.println("this is a test 10   ");
	}

}
