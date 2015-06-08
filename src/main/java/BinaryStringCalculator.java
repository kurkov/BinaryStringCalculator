public class BinaryStringCalculator {

  public static String add(String s1, String s2) {

    StringBuilder result = new StringBuilder();
    String num1, num2;

    int sum, cursorS1, cursorS2;
    int maxCharCount;
    int memory = 0;

    cursorS1 = s1.length() - 1;
    cursorS2 = s2.length() - 1;

    String s1Check = checkIfStringIsValid(s1, cursorS1);
    String s2Check = checkIfStringIsValid(s2, cursorS2);
    if (s1Check.equals("-1") || s2Check.equals("-1")) {
      return "Error! Invalid binary string";
    }

    maxCharCount = getMaxCharCount(cursorS1, cursorS2);

    for (int i = maxCharCount; i >= 0; i--) {

      num1 = getStringChar(s1, cursorS1);
      num2 = getStringChar(s2, cursorS2);

      sum = Integer.parseInt(num1) + Integer.parseInt(num2) + memory;

      if (sum == 0) {
        result.append("0");
        memory = 0;
      } else if (sum == 1) {
        result.append("1");
        memory = 0;
      } else if (sum == 2) {
        result.append("0");
        memory = 1;
      } else if (sum == 3) {
        result.append("1");
        memory = 1;
      } else {
        result = new StringBuilder("Error! Enter valid binary string");
        break;
      }

      cursorS1--;
      cursorS2--;

      if ((i == 0) && (memory == 1)) {
        result.append("1");
      }
    }
    return result.reverse().toString();
  }

  private static String getStringChar(String s1, int cursorS1) {
    String num1;
    if (cursorS1 >= 0) {
      num1 = String.valueOf(s1.charAt(cursorS1));
    } else {
      num1 = "0";
    }
    return num1;
  }

  private static int getMaxCharCount(int cursorS1, int cursorS2) {
    int maxCharCount;
    if (cursorS1 >= cursorS2) {
      maxCharCount = cursorS1;
    } else {
      maxCharCount = cursorS2;
    }
    return maxCharCount;
  }

  private static String checkIfStringIsValid(String string, int cursor) {

    String number, result = "";

    for (int i = 0; i < cursor; i++) {
      number = String.valueOf(string.charAt(cursor));
      if (!number.equals("0") && !number.equals("1")) {
        result = "-1";
        break;
      }
    }
    return result;
  }
}
