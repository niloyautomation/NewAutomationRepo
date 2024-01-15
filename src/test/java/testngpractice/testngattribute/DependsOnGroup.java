package testngpractice.testngattribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    /*@Test(groups = {"smoke"})
    public void writeAnything(){
        Assert.assertTrue(false);
        System.out.println("String , Number , Character");
    }

    @Test(dependsOnGroups = {"smoke"}) //this group depends on above group
    public void writeString(){
        System.out.println("niloy");  //this method will skip if writeAnything test fails
    }

    @Test
    public void writeNumber(){
        System.out.println("500");
    }

    @Test
    public void writeCharacter(){
        System.out.println('A');
    }*/
}
