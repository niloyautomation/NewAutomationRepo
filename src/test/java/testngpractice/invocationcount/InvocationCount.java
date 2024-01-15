package testngpractice.invocationcount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {

    @Test(invocationCount = 10)   //invocationCount is used to execute test case multiple time
    public void test1(){
        System.out.println("Hello TestNG");
    }
}
