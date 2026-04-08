package c3;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3Dash2 {

  public static void main(String[] args) {

    int[] numbers = getArray();
    while (numbers.length != 5) {
      System.out.println("數字個數必須為5個");
      numbers = getArray();
    }

    System.out.println("共" + numbers.length + "個數字");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("第" + (i + 1) + "個數字是：" + numbers[i]);
    }
    int[] sortAsc = sortAsc(copyOf(numbers, numbers.length));
    int[] sortDesc = sortDesc(copyOf(numbers, numbers.length));
    System.out.println(Arrays.toString(sortAsc));
    System.out.println(Arrays.toString(sortDesc));

    System.out.println("中位數是：" + sortDesc[2]);

  }

  public static int[] getArray() {
    Scanner sc = new Scanner(System.in);
    System.out.println("請輸入0~999的數字，輸入x則離開");
    int[] numbers = new int[100];
    int count = 0;
    String input = sc.next();
    while (!input.equals("x")) {
      int number = Integer.parseInt(input);
      if (number < 0 || number > 999) {
        System.out.println("請重新輸入");
      } else {
        numbers[count] = Integer.parseInt(input);
        count++;
      }
      input = sc.next();
    }

    int[] last = new int[count];
    System.arraycopy(numbers, 0, last, 0, count);

    return last;
  }

  public static int[] sortAsc(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] > numbers[j]) {
          int tmp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = tmp;
        }
      }
    }
    return numbers;
  }

  public static int[] sortDesc(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] < numbers[j]) {
          int tmp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = tmp;
        }
      }
    }
    return numbers;
  }

  public static int[] copyOf(int[] numbers, int length) {
    int[] copy = new int[length];
    for (int i = 0; i < length; i++) {
      copy[i] = numbers[i];
    }
    return copy;
  }
}
