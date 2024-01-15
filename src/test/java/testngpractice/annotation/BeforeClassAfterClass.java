package testngpractice.annotation;

import org.testng.annotations.*;

public class BeforeClassAfterClass {

    @BeforeClass
    public void test(){
        System.out.println("This is A");
    }
    @AfterClass
    public void test2() {
        System.out.println("This is B");
    }
    @Test
    public void test1(){
        System.out.println("This is C");
    }
}
