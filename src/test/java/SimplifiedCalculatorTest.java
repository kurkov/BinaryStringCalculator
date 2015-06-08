import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifiedCalculatorTest {

  //  "01"
  //  "11"
  // "100"

  @Test
  public void test1_EqualLengthStrings() {
    String expectedResult = "100";
    String actualResult = SimplifiedCalculator.add("01", "11");
    assertEquals(expectedResult, actualResult);
  }

  //  "111"
  //   "01"
  // "1000"

  @Test
  public void test2_DifferentLengthStrings() {
    String expectedResult = "1000";
    String actualResult = SimplifiedCalculator.add("111", "01");
    assertEquals(expectedResult, actualResult);
  }

  //   "01"
  // "1011"
  // "1100"

  @Test
  public void test3_DifferentLengthStrings() {
    String expectedResult = "1100";
    String actualResult = SimplifiedCalculator.add("01", "1011");
    assertEquals(expectedResult, actualResult);
  }
}