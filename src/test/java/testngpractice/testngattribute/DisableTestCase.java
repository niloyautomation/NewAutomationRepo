package testngpractice.testngattribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableTestCase {

    @Test()
    public void writeAnything(){
        System.out.println("String , Number , Character");
    }

    @Test(enabled = false) //enabled = false used to disable test case
    public void writeString(){
        System.out.println("niloy");  //it will not execute
    }
}
