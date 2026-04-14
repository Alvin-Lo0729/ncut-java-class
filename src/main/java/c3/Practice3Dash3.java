package c3;

import java.util.Scanner;

public class Practice3Dash3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char inputChar = 0;
    while (charIsNotEnglish(inputChar)) {
      System.out.println("請輸入一個字元，且是英文字母的");
      String input = scanner.next();
      while (input.length() != 1) {
        System.out.println("請重新輸入一個字");
        input = scanner.next();
      }
      inputChar = input.charAt(0);
    }


  }

  public static boolean charIsNotEnglish(char input) {
    return !(isCharInDownCase(input) || isCharInUpperCase(input));
  }

  public static boolean isCharInDownCase(char input) {
    return input >= 'a' && input <= 'z';
  }

  public static boolean isCharInUpperCase(char input) {
    return input >= 'A' && input <= 'A';
  }
}
