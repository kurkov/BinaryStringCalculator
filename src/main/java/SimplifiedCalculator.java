public class SimplifiedCalculator {
  public static String add(String s1, String s2) {
    int number1 = Integer.parseInt(s1, 2);
    int number2 = Integer.parseInt(s2, 2);
    return String.valueOf(Integer.toBinaryString(number1 + number2));
  }
}