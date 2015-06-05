import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestString {

  //  "01"
  //  "11"
  // "100"
  
  @Test
  public void testString(){
    String expectedResult = "100";
    String actualResult = BinaryStringCalculator.add("01", "11");
    assertEquals(expectedResult, actualResult);
  }
}
