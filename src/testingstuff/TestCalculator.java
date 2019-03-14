package testingstuff;

import org.testng.asserts.SoftAssert;

public class TestCalculator {
   public static void main(String[] args) {
      SoftAssert s_assert = new SoftAssert();
      s_assert.assertEquals(Calculator.add(10,20), 30);
      System.out.println("This will still print");
      s_assert.assertAll();
   }

}
