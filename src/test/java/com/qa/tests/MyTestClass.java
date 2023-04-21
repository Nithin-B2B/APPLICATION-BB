package com.qa.tests;

import org.testng.annotations.Test;

public class MyTestClass 
{

	@Test
    public void test1() {
        System.out.println("Executing test case 1");
    }
    
    @Test
    public void test2() {
        System.out.println("Executing test case 2");
        throw new RuntimeException("Test case 2 failed");
    }
    
    @Test
    public void test3() {
        System.out.println("Executing test case 3");
    }
}
