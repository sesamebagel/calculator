package testingstuff;

import org.testng.asserts.Assert;

public class TestCalculator {
   public static void main(String[] args) {
      Assert.assertEquals(Calculator.add(10,20), 30);
   }

}
