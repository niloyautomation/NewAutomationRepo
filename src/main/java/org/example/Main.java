package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();  //Chrome Browser object
        chromeOptions.setBinary("C:\\Users\\NILOY\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe"); //Chrome Browser path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);  //Chrome driver object
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        /*driver.findElement(By.id("openwindow")).click();  //click on open window
        String parentWindowId = driver.getWindowHandle();  //return type is string because String is immutable
        //getWindowHandle() returns parent window id
        System.out.println(parentWindowId);

        Set<String> allWindow = driver.getWindowHandles();  //getWindowHandles() returns all window id
        System.out.println(allWindow);

        for(String all : allWindow){
            if(!parentWindowId.contentEquals(all)){
                driver.switchTo().window(all);  //switching to child window
                System.out.println(driver.getTitle());
                Thread.sleep(3000);
                driver.close();   //closing child window
            }
        }
        driver.switchTo().window(parentWindowId);  //switching again to parent window
        driver.close();   //closing parent window*/
    }
}