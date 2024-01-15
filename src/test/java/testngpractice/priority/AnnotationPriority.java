package testngpractice.priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationPriority {

    @Test(priority = 1)
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.amazon.in/");
        System.out.println("Good Morning");
        driver.close();
    }

    @Test(priority = 2)
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.meesho.com/");
        driver.close();
    }

    @Test(priority = 0)               //0 priority gets more priority than higher number
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.flipkart.com/");
        driver.close();
    }

    @Test                               //it is default priority 0
    public void test5(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.swiggy.com/");
        driver.close();
    }
    @Test(priority = -1)                 //smaller number get first priority
    public void test6() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.zomato.com/india");
        driver.close();
    }

    @Test(priority = 4)
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.myntra.com/");
        System.out.println("Hello");
        driver.close();
    }
}

