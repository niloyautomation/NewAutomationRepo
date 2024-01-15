package testngpractice.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {

    @BeforeMethod
    public void test(){
        System.out.println("This is A");
    }

    @AfterMethod
    public void test2() {
        System.out.println("This is B");
    }

    @Test
    public void test1(){
        System.out.println("This is C");
    }
}
