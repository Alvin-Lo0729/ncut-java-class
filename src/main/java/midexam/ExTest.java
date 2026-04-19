package midexam;

import java.util.Scanner;

public class ExTest {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String studentNumber = "417018";

    while (true) {
      System.out.print("請輸入字元：");
      String input = console.next();

      if (input.equals(studentNumber)) {
        System.out.println("這是我的學號！");

      } else {

        //這裡將 字串轉成char Array 再轉成int array
        char[] charArray = input.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
          intArray[i] = charArray[i];
        }

        //這裡是做由小排到大的排序
        for (int i = 0; i < intArray.length - 1; i++) {
          for (int j = i + 1; j < intArray.length; j++) {
            int valueA = intArray[i];
            int valueB = intArray[j];
            if (valueA > valueB) {
              int temp = intArray[i];
              intArray[i] = intArray[j];
              intArray[j] = temp;
            }
          }
        }
        //這裡是做 將int array 轉成 char array
        char[] chars = new char[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
          chars[i] = (char) intArray[i];
        }
        //列印出來
        System.out.println(chars);
      }
    }
  }
}
