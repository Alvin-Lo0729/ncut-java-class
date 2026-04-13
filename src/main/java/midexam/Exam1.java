package midexam;

import java.util.Scanner;

public class Exam1 {

  public static final String SCHOOL_NUMBER = "9b417004";

  public static final int NUMBER = 3;

  public static void main(String[] args) {

    String string = getString();

    while (check(string)) {
      int[] intValue = getCharArrayFromString(string);
      int[] sortValue = sortDesc(intValue);
      char[] chars = transIntArrayToCharArray(sortValue);
      System.out.println(chars);
      string = getString();
    }

  }

  /**
   * 從cmd取得字串
   *
   * @return 字串
   */
  public static String getString() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("請輸入" + NUMBER + "個字:");
    return scanner.next();
  }

  /**
   * 排序由小到大
   *
   * @param intValue 字串的intArray
   * @return 排序由小到大
   */
  public static int[] sortAsc(int[] intValue) {
    for (int i = 0; i < intValue.length - 1; i++) {
      for (int j = i + 1; j < intValue.length; j++) {
        int valueA = intValue[i];
        int valueB = intValue[j];
        int temp = 0;
        if (valueA > valueB) {
          temp = intValue[i];
          intValue[i] = intValue[j];
          intValue[j] = temp;
        }
      }
    }
    return intValue;
  }

  /**
   * 排序由大到小
   *
   * @param intValue 字串的intArray
   * @return 排序由大到小
   */
  public static int[] sortDesc(int[] intValue) {
    for (int i = 0; i < intValue.length - 1; i++) {
      for (int j = i + 1; j < intValue.length; j++) {
        int valueA = intValue[i];
        int valueB = intValue[j];
        int temp = 0;
        if (valueA < valueB) {
          temp = intValue[i];
          intValue[i] = intValue[j];
          intValue[j] = temp;
        }
      }
    }
    return intValue;
  }

  /**
   * 將int array轉成char array
   *
   * @return char array
   */
  public static char[] transIntArrayToCharArray(int[] intArray) {

    char[] chars = new char[intArray.length];
    for (int i = 0; i < intArray.length; i++) {
      chars[i] = (char) intArray[i];
    }
    return chars;
  }

  /**
   * 從 String 轉成int Array
   *
   * @param string 輸入的字串
   * @return char Array
   */
  public static int[] getCharArrayFromString(String string) {
    char[] charArray = string.toCharArray();
    int[] intArray = new int[charArray.length];
    for (int i = 0; i < charArray.length; i++) {
      intArray[i] = charArray[i];
    }
    return intArray;
  }

  /**
   * 輸入的字串跟學號後N碼做比較
   *
   * @param string 輸入的字串
   * @return 相同為FALSE，不同為TRUE
   */
  public static boolean check(String string) {
    String compareString = SCHOOL_NUMBER.substring(SCHOOL_NUMBER.length() - NUMBER);
    return !string.equals(compareString);
  }


}
