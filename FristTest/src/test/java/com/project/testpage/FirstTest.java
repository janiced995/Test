package com.project.testpage;

import org.testng.annotations.Test;

//@Test(groups= {"all tests"})
public class FirstTest {

	@Test(groups = { "Regression", "SmokeTest" })
	public void test1() {
		System.out.println("this is a test 1    " + Thread.currentThread().getId());
	}

	@Test(groups = { "Regression", "SmokeTest" })
	public void test2() {
		System.out.println("this is a test 2    " + Thread.currentThread().getId());
	}

	@Test(groups = { "Regression" })
	public void test3() {
		System.out.println("this is a test 3    " + Thread.currentThread().getId());
	}

	@Test(groups = { "Regression" })
	public void test4() {
		System.out.println("this is a test 4    " + Thread.currentThread().getId());
	}

	@Test(groups = { "SmokeTest" })
	public void test5() {
		System.out.println("this is a test 5    " + Thread.currentThread().getId());
	}

	@Test(groups = { "SmokeTest" })
	public void test6() {
		System.out.println("this is a test 6    " + Thread.currentThread().getId());
	}

}
