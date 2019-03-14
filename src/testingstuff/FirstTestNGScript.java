package testingstuff;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGScript {

   @Test
   public void testAssert() {
      int [] arr = {1, 2, 3, 4, 5, 6};
      int [] brr =  {1, 2, 3, 4, 5, 6};
      Assert.assertEquals(arr, brr);
      System.out.println("Names are the same.");
   }

   public String getName() { return "Anika"; }
}
