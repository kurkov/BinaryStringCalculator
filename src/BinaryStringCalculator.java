public class BinaryStringCalculator {
  public static String add(String s1, String s2) {
    StringBuilder result = new StringBuilder();
    int memory = 0;
    int countChars = 0;
    if (s1.length() >= s2.length()){
      countChars = s1.length();
    } else {
      countChars = s2.length();
    }
    int num1, num2, sum;
    for (int i = countChars; i > 0; i--) {
      num1 = Integer.parseInt(String.valueOf(s1.charAt(i)));
      num2 = Integer.parseInt(String.valueOf(s2.charAt(i)));
      sum = num1 + num2 + memory;
      if (sum == 0) {
        result.append("0");
        memory = 0;
      } else if (sum == 1) {
        result.append("1");
        memory = 0;
      } else if (sum == 2) {
        result.append("1");
        memory = 0;
      } else {
        result.append("1");
        memory = 1;
      }
    }
    return result.toString();
  }
}
